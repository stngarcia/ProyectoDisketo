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

@WebServlet(name = "LoginServlet", urlPatterns = {"/signup"})
public class LoginServlet extends HttpServlet {

    @EJB
    UserFacadeLocal myUserSB;
    List<User> myUser;
    UserLogged myUsuario;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String myEmail = request.getParameter("email");
        String myPwd = request.getParameter("pwd");
        this.myUser = this.myUserSB.findNamedQuery("User.findByEmail", "email", myEmail);
        if (this.myUser.size()==0){
            getServletContext().getRequestDispatcher("/usuario-acceso-denegado.jsp").forward(request, response);
            return;
        }
        User myUserfound = this.myUser.get(0);
        PrintWriter out = response.getWriter();
        out.print(myUserfound.getNombre());
        out.print(this.myUser.size());
        out.print(myEmail);
        out.close();
    }

}
