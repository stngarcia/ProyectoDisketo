package controller.session;

import java.util.HashMap;
import java.util.Map;
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
        Map<String, String> myParameters = new HashMap<String, String>();
        myParameters.put("email", request.getParameter("email"));
        myParameters.put("password", request.getParameter("pwd"));
        this.myUser = this.myUserSB.findNamedQuery("User.findLogin", myParameters);
        UserLogged myUserLogged= UserLogged.createUserLog();
        if (this.myUser.size()==0){
            getServletContext().getRequestDispatcher("/usuario-acceso-denegado.jsp").forward(request, response);
            return;
        }
        User myUserfound = this.myUser.get(0);
        myUserLogged.setUser_name(myUserfound.getNombre()+''+myUserfound.getApellido());
        PrintWriter out = response.getWriter();
        out.print(myUserLogged.get);
        out.print(myUserfound.g);
        out.close();
    }

}
