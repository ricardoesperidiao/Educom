package br.edu.educom.util;


import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.edu.com.controller.Facade;
import br.edu.com.entities.Professor;
import br.edu.com.entities.UsuarioLogin;

public class GeradorBanco {
	
	public static void main(String[] args) {
		
		try{
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure();
			
			SchemaExport schemaExport = new SchemaExport(cfg);
			schemaExport.create(true, true);
			System.out.println("BANCO GERADO COM SUCESSO!");
			
			UsuarioLogin user  = new UsuarioLogin();
			user.setEmail("ricardoesperidiao@gmail.com");
			user.setSenha("123@mudar");
			user.setNome("teste");
			Professor professor = new Professor(user);
			Facade.getInstance().getProfessor().salvarUsuario(professor);
			
			UsuarioLogin teste;
			teste = (UsuarioLogin)Facade.getInstance().getIUsuarioLogin().procurarUsuarioLogin("from UsuarioLogin where email = 'ricardoesperidiao@gmail.com'").get(0);

			System.out.println("Usuario - Professor = " + teste.getProfessor());
			
//			Usuario user  = new Usuario();
//			user.setEmail("joao.p.lira@gmail.com");
//			user.setNome("Jo�o Paulo");
//			user.setSenha("123@mudar");
//			
			
//			Facade.getInstance().getUsuario().salvarUsuario(user);
			
//			Administrador admPadao = new Administrador();
//			admPadao.setEmail("administrador@gmail.com");
//			admPadao.setLogin("admin");
//			admPadao.setNome("Administrador Pad�o");
//			admPadao.setSenha("admin");
//			admPadao.setCpf("358.932.958-03");
//			admPadao.setTelefone("(81) 9729-8198");
			
//			Fachada.getInstancia().getRepositorioAdministrador().salvarAdministrador(admPadao);
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("BANCO N�O FOI GERADO!");

		}
		
	}

}