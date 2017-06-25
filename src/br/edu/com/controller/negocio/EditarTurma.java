package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Instituicao;
import br.edu.com.entities.Turma;

public class EditarTurma implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		try {

			Turma turma = Facade
								.getInstance()
								.getITurma()
								.procurarTurma("from Turma where id = '"+request.getParameter("id")+"'")
								.get(0);
			BeanUtils.populate(turma, request.getParameterMap()); 
			turma.setInstituicao(
					Facade
					.getInstance()
					.getIInstituicao()
					.procurarInstituicao("from Instituicao where id = "+request.getParameter("idInstituicao"))
					.get(0)
					);
			
			Facade.getInstance().getITurma().atualizarTurma(turma);
			request.setAttribute("msg", "Turma atualizado com sucesso!!");
			request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
			
		} catch (Exception e) {
			System.err.println(">>>>>>>>>>>>>>>>.O erro foi = "+e);
			request.setAttribute("msg", "Ocorreu um erro ao tentar atualizado a Instituição");
			request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		}
		
	}

}
