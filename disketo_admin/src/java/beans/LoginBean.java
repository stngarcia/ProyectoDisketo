package beans;

import data.AdmTableFacadeLocal;
import entity.AdmTable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import utils.Session;




/**
 * @author asathor
 */
@ManagedBean
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    // Variables privadas.
    @EJB
    AdmTableFacadeLocal myUserSB;
    List<AdmTable> myUser;

    // Atributos.
    private String userName;
    private String userPassword;

    // Constructor.
    public LoginBean() {
    }


    public String getUserName() {
        return userName;
    }


    public String getUserPassword() {
        return userPassword;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    // Metodo para validar el ingreso de las credenciales del usuario.
    public String loginValidate(String userName, String userPassword) {
        Map<String, String> myParameters = new HashMap<>();
        myParameters.put("usuario", this.userName);
        myParameters.put("password", this.userPassword);
        this.myUser = this.myUserSB.findNamedQuery("User.findLogin", myParameters);
        if (this.myUser.isEmpty()) {
            return this.logginFailed();
        }
        return this.logginCorrect();
    }


    // Metodo para cuando el loggin es incorrecto.
    private String logginFailed() {
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "Nombre de usuario o contraseña incorrecta", ""));
        return "index";
    }


    // Funcion para asignar la sesión cuando el loggin es correcto.
    private String logginCorrect() {
        AdmTable myUserFound = this.myUser.get(0);
        HttpSession mySession = Session.create().getSession();
        mySession.setAttribute("userName", myUserFound.getNombre());
        mySession.setAttribute("userNick", myUserFound.getUsuario());
        mySession.setAttribute("userEmail", myUserFound.getEmail());
        return "admin";
    }


}
