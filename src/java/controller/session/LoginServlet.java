package controller.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


import java.util.List;
import java.util.ArrayList;
import model.UserLogged;
import javax.ejb.EJB;
import entity.User;
import model.sesionbeans.UserFacadeLocal;

@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    @EJB
    UserFacadeLocal myUserSB;
    List<User> myUser;
    UserLogged myUsuario;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
    PrintWriter printWriter = new PrintWriter ("file.txt");
    printWriter.println ("Weeeena aqui estoy!");
    printWriter.println (email);
    this.myUser =  this.myUserSB.findNamedQuery("User.findByEmail", "email", email);
        printWriter.println (this.myUser.size());
    printWriter.close ();       
    }

}
