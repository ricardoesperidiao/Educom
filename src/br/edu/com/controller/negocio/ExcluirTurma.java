package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Turma;

public class ExcluirTurma implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Turma turma = Facade
				.getInstance()
				.getITurma()
				.procurarTurma("from Turma where id = '"+request.getParameter("id")+"'")
				.get(0);

		Facade.getInstance().getITurma().inativarTurma(turma);
		
		request.setAttribute("msg", "Turma excluida com sucesso");
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

}
