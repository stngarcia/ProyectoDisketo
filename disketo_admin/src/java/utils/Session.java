package utils;


import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


/**
 * @author asathor
 */
public class Session {

    // Atributos.
    private HttpSession mySession;
    private String userName;
    private String userNickName;
    private String userEmail;

    // Constructor.
    private Session() {
        this.mySession = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(false);
    }


    // Creador de la instancia.
    public static Session create() {
        return new Session();
    }


    // Metodo que devuelbe la session.
    public HttpSession getSession() {
        return this.mySession;
    }


    // Metodo que retorna el nombre del usuario.
    public String getUserName() {
        this.userName = "";
        if (this.mySession != null) {
            this.userName = (String) this.mySession.getAttribute("userName");
        }
        return this.userName;
    }


    // Metodo que devuelbe el nick del usuario.
    public String getUserNickName() {
        this.userNickName = "";
        if (this.mySession != null) {
            this.userNickName = (String) this.mySession.getAttribute("userNick");
        }
        return this.userNickName;
    }


    // Metodo que devuelbe el email del usuario.
    public String getUserEmail() {
        this.userEmail = "";
        if (this.mySession != null) {
            this.userEmail = (String) this.mySession.getAttribute("userEmail");
        }
        return this.userEmail;
    }


}
