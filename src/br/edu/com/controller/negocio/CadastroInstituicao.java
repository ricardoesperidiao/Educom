package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Instituicao;

public class CadastroInstituicao implements ILogica {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		Instituicao instituicao = new Instituicao();
		BeanUtils.populate(instituicao, request.getParameterMap());
		
		try {
			
			Facade.getInstance().getIInstituicao().salvarInstituicao(instituicao);
			
		} catch (Exception e) {
			System.out.println("Erro ->" + e.getMessage());
			// TODO: handle exception
		}
		
		request.setAttribute("msg", "Instituicao" + instituicao.getNome() + "Cadastrada com sucesso!");
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

}
