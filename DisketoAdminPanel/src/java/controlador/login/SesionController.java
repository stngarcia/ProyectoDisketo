package controlador.login;


import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import utils.CapUtil;
import utils.Sesion;


/**
 * @author asathor
 */
@Named(value = "sesionController")
@SessionScoped
public class SesionController implements Serializable {

    // Variables.
    private String nombreUsuario;
    private String idUsuario;

    // Accesadores.
    public String getNombreUsuario() {
        HttpSession mySession = Sesion.create().getSession();
        this.nombreUsuario = CapUtil.capitalize((String) mySession.getAttribute("nombre")).toString();
        return this.nombreUsuario;
    }


    public String getIdUsuario() {
        HttpSession mySession = Sesion.create().getSession();
        this.idUsuario = (String) mySession.getAttribute("idUsuario");
        return this.idUsuario;
    }


    public String logOut() {
        HttpSession mySession = Sesion.create().getSession();
        if (mySession != null) {
            mySession.invalidate();
        }
        return "index";
    }


}
