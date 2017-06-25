package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Instituicao;
import br.edu.com.entities.UsuarioLogin;

public class EditarInstituicao implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		try {

			Instituicao inst = Facade
								.getInstance()
								.getIInstituicao()
								.procurarInstituicao("from Instituicao where id = '"+request.getParameter("id")+"'")
								.get(0);
			
			BeanUtils.populate(inst, request.getParameterMap()); 
			
			Facade.getInstance().getIInstituicao().atualizarInstituicao(inst);
			request.setAttribute("msg", "Instituição atualizado com sucesso!!");
			request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
			
		} catch (Exception e) {
			System.err.println(">>>>>>>>>>>>>>>>.O erro foi = "+e);
			request.setAttribute("msg", "Ocorreu um erro ao tentar atualizado a Instituição");
			request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		}
	}
}
