package controlador.login;


import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import modelo.Usuario;
import utils.Sesion;


/**
 * @author asathor
 */
@Named(value = "LoginController")
@ViewScoped
public class LoginController implements Serializable {

    @EJB
    private UsuarioFacadeLocal miUsuarioEJB;
    private Usuario usuario;

    @PostConstruct
    public void init() {
        this.usuario = new Usuario();
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public String validar() {
        Usuario miUsuario;
        FacesContext miContexto = FacesContext.getCurrentInstance();
        FacesMessage miMensaje;
        String miUrl = "index";
        try {
            miUsuario = miUsuarioEJB.login(this.usuario);
            if (miUsuario != null) {
                HttpSession mySession = Sesion.create().getSession();
                mySession.setAttribute("nombre", miUsuario.getNombre() + ' ' + miUsuario.getApellido());
                mySession.setAttribute("idUsuario", miUsuario.getIdUsuario());
                miUrl = "/sitio/inicio?faces-redirect=true";
            } else {
                miMensaje = new FacesMessage(FacesMessage.SEVERITY_WARN, "Atención!", "Email o contraseña incorrecta.");
                FacesContext.getCurrentInstance().addMessage(null, miMensaje);
            }
        } catch (Exception e) {
            miMensaje = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Atención!", "Eror inesperado en Disketo.");
            FacesContext.getCurrentInstance().addMessage(null, miMensaje);
        }
        return miUrl;
    }


}
