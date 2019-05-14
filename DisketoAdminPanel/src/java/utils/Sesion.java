package utils;


import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


/**
 * @author asathor
 */
public class Sesion {

    // Atributos.
    private HttpSession mySession;
    private String nombreUsuario;
    private String idUsuario;

    // Constructor.
    private Sesion() {
        this.mySession = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(false);
    }


    // Creador de la instancia.
    public static Sesion create() {
        return new Sesion();
    }


    // Metodo que devuelbe la session.
    public HttpSession getSession() {
        return this.mySession;
    }


    // Metodo que retorna el nombre del usuario.
    public String getNombreUsuario() {
        this.nombreUsuario = "";
        if (this.mySession != null) {
            this.nombreUsuario = (String) this.mySession.getAttribute("userName");
        }
        return this.nombreUsuario;
    }


    // Metodo que devuelbe el id del usuario.
    public String getIdUsuarioName() {
        this.idUsuario = "";
        if (this.mySession != null) {
            this.idUsuario = (String) this.mySession.getAttribute("userNick");
        }
        return this.idUsuario;
    }


}
