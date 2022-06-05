package br.com.hello.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  @Override 
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String nome = request.getParameter("nome");
	  PrintWriter out = response.getWriter();
	  
	  out.println("<html> <body> Nome: " + nome + "cadastrado(a) com sucesso!!! </body></html>");
  }
}