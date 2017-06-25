package br.edu.com.controller.negocio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Instituicao;
import br.edu.com.entities.Turma;
import br.edu.com.entities.UsuarioLogin;

public class Rd implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String acao = request.getParameter("acao");
		UsuarioLogin user = (UsuarioLogin) request.getSession().getAttribute("usuarioSessao");
		
		//List<Professor> listUsuarios = Facade.getInstance().getIUsuarioLogin().listarUsuarioLogin();
		//com.github.jlinqer.collections.List<Usuario> t = new com.github.jlinqer.collections.List<>();
		//t.addAll(listUsuarios);
		
		if(acao.equals("cadastroInstituicao")){
			request.getRequestDispatcher("/WEB-INF/CadastroInstituicao.jsp").forward(request, response);
		}
		else if(acao.equals("listarInstituicao")){
			
			List<Instituicao> instituicao = Facade
							.getInstance()
							.getIInstituicao()
							.procurarInstituicao("from Instituicao where professor = " + user.getProfessor().getId());
			request.setAttribute("listaInstituicao", instituicao);
			request.getRequestDispatcher("/WEB-INF/ListarInstituicao.jsp").forward(request, response);
		}
		else if (acao.equals("editarInstituicao")){
			
			String id = request.getParameter("id");
			
			Instituicao ins = Facade
								.getInstance()
								.getIInstituicao()
								.procurarInstituicao("from Instituicao where id = '"+id+"'").get(0);
			
			request.setAttribute("inst", ins);
			request.getRequestDispatcher("/WEB-INF/EditarInstituicao.jsp").forward(request, response);
			
		}
		else if(acao.equals("cadastroTurma")){
			
			List<Instituicao> listaInstituicao = Facade
					.getInstance()
					.getIInstituicao()
					.procurarInstituicao("from Instituicao where professor = " + user.getProfessor()
					.getId());
			
			request.setAttribute("listaInstituicao", listaInstituicao);
			request.getRequestDispatcher("/WEB-INF/CadastroTurma.jsp").forward(request, response);
		}
		else if(acao.equals("listarInstituicaoTurma")){
			
			List<Instituicao> listaInstituicao = Facade
					.getInstance()
					.getIInstituicao()
					.procurarInstituicao("from Instituicao where professor = " + user.getProfessor()
					.getId());
			
			request.setAttribute("listaInstituicao", listaInstituicao);
			request.getRequestDispatcher("/WEB-INF/ListarInstituicaoTurma.jsp").forward(request, response);
		}
		else if(acao.equals("listarTurma")){
			
			String idInstituicao = request.getParameter("id");
			List<Turma> listaTurma = Facade
							.getInstance()
							.getITurma()
							.procurarTurma("from Turma where instituicao = " + idInstituicao);
			request.setAttribute("listaTurma", listaTurma);
			request.setAttribute("idInstituicao", idInstituicao);
			request.getRequestDispatcher("/WEB-INF/ListarTurma.jsp").forward(request, response);
		}
		else if (acao.equals("editarTurma")){
			
			String id = request.getParameter("id");
			List<Instituicao> listaInstituicao = Facade
					.getInstance()
					.getIInstituicao()
					.procurarInstituicao("from Instituicao where professor = " + user.getProfessor()
					.getId());
			
			Turma turma = Facade
							.getInstance()
							.getITurma()
							.procurarTurma("from Turma where id = '"+id+"'").get(0);
		
			request.setAttribute("turma", turma);
			request.setAttribute("listaInstituicao", listaInstituicao);
			
			request.getRequestDispatcher("/WEB-INF/EditarTurma.jsp").forward(request, response);	
		}
		else if (acao.equals("cadastroDisciplina")){
			List<Turma> turma = Facade
					.getInstance()
					.getITurma().listarTurma();
			
			request.setAttribute("listaTurma", turma);
			request.getRequestDispatcher("/WEB-INF/CadastroDisciplina.jsp").forward(request, response);	
		}
		
		
	}

}
