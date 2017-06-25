package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Instituicao;

public class ExcluirInstituicao implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Instituicao inst = Facade
							.getInstance()
							.getIInstituicao()
							.procurarInstituicao("from Instituicao where id = '"+request.getParameter("id")+"'")
							.get(0);
		
		Facade.getInstance().getIInstituicao().inativarInstituicao(inst);

		request.setAttribute("msg", "Instituição excluida com sucesso");
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

}
