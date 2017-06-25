package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.mchange.v2.beans.BeansUtils;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Turma;
import net.sf.jasperreports.olap.mapping.Tuple;

public class CadastroTurma implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Turma turma = new Turma();
		
		BeanUtils.populate(turma, request.getParameterMap());
		
		turma.setInstituicao(
				Facade
				.getInstance()
				.getIInstituicao()
				.procurarInstituicao("from Instituicao where id = "+request.getParameter("idInstituicao"))
				.get(0)
				);
		
		Facade
		.getInstance()
		.getITurma()
		.salvarTurma(turma);
		
		request.setAttribute("msg", "Turma" + turma.getNome() + "Cadastrada com sucesso!");
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
				
				
		
	}

}
