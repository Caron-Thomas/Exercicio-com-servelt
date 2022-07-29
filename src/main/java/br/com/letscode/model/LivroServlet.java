package br.com.letscode.model;

import br.com.letscode.bo.LivroBusinessObject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.List;

@WebServlet(value = "/livro-servlet")
public class LivroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = null;
        String nome = req.getParameter("nome");
        String autor = req.getParameter("Autor");

        LivroBusinessObject businessObject = new LivroBusinessObject();
        Livro livro = new Livro(id, nome, autor);
        Livro livroSalvo = businessObject.save(livro); //(?????? Não deu boa)

        req.setAttribute("idLivroSalvo", livroSalvo.getId());
        req.setAttribute("livrosSalvos", livroSalvo);
        List<Livro> livraria = businessObject.listarLivros();

        RequestDispatcher dispatcher = req.getRequestDispatcher("lista-livros.jsp");
        dispatcher.forward(req, resp);

    }
}
