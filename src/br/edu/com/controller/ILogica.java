package br.edu.com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ILogica {

	void executa(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
