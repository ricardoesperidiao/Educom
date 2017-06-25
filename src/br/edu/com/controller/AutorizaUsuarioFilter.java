package br.edu.com.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.com.entities.UsuarioLogin;

@WebFilter(filterName = "AutorizaUsuarioFilter", urlPatterns = {"/WEB-INF/*"}, servletNames={"Servlet"})  
public class AutorizaUsuarioFilter implements Filter {

	public AutorizaUsuarioFilter() {
        // TODO Auto-generated constructor stub
    }
	
	@Override
	public void destroy() {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
		
		System.out.println("Entrou no filtro de Sessao");  

		HttpServletRequest t1 = (HttpServletRequest) request;
		HttpServletResponse t2 = (HttpServletResponse) response;

		String url = t1.getRequestURI(); 
		System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>URL que ta vindo = "+url);
		
		String acao = request.getParameter("acao");
		UsuarioLogin usuarioLogado = null; 
		
		try {
			usuarioLogado = (UsuarioLogin) t1.getSession().getAttribute("usuarioSessao");
		} catch (Exception e) {
			System.err.println("erro no login do usuario");
			
		}

		if(url.equals("/Educom/Educom") && usuarioLogado != null || acao.equals("AutenticarUsuario")){
			chain.doFilter(request, response);
			System.out.println("Passou");
		} else {
			request.setAttribute("msg", "Seu sessão expirou. Faça o login novamente para acessar o sistema.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		System.out.println("Fim do filtro de Sessao"); 
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {}

}
