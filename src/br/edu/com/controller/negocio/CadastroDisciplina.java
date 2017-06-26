package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Disciplina;

public class CadastroDisciplina implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Disciplina disciplina = new Disciplina();
		
		BeanUtils.populate(disciplina, request.getParameterMap());
		
		disciplina.setTurma(
				Facade
				.getInstance()
				.getITurma()
				.procurarTurma("from Turma where id = "+request.getParameter("idTurma"))
				.get(0)
				);
		
		Facade
		.getInstance()
		.getIDisciplina()
		.salvarDisciplina(disciplina);
		
		request.setAttribute("msg", "Disciplina" + disciplina.getDescricao() + "Cadastrada com sucesso!");
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
				
	}

}
