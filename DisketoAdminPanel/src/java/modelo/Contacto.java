package modelo;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;



/**
  * @author asathor
 */
@Entity
@Table(name = "contacto", catalog = "disketo_data2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contacto.findAll", query = "SELECT c FROM Contacto c")
    , @NamedQuery(name = "Contacto.findByIdContacto", query = "SELECT c FROM Contacto c WHERE c.idContacto = :idContacto")
    , @NamedQuery(name = "Contacto.findByNombre", query = "SELECT c FROM Contacto c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Contacto.findByEmail", query = "SELECT c FROM Contacto c WHERE c.email = :email")
    , @NamedQuery(name = "Contacto.findByTelefono", query = "SELECT c FROM Contacto c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Contacto.findByMotivo", query = "SELECT c FROM Contacto c WHERE c.motivo = :motivo")
    , @NamedQuery(name = "Contacto.findByTextoReq", query = "SELECT c FROM Contacto c WHERE c.textoReq = :textoReq")
    , @NamedQuery(name = "Contacto.findByFechaHora", query = "SELECT c FROM Contacto c WHERE c.fechaHora = :fechaHora")})
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_contacto", nullable = false)
    private Integer idContacto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "email", nullable = false, length = 75)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "telefono", nullable = false, length = 12)
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "motivo", nullable = false, length = 100)
    private String motivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "texto_req", nullable = false, length = 255)
    private String textoReq;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;

    public Contacto() {
    }


    public Contacto(Integer idContacto) {
        this.idContacto = idContacto;
    }


    public Contacto(Integer idContacto, String nombre, String email, String telefono, String motivo, String textoReq, Date fechaHora) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.motivo = motivo;
        this.textoReq = textoReq;
        this.fechaHora = fechaHora;
    }


    public Integer getIdContacto() {
        return idContacto;
    }


    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getMotivo() {
        return motivo;
    }


    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }


    public String getTextoReq() {
        return textoReq;
    }


    public void setTextoReq(String textoReq) {
        this.textoReq = textoReq;
    }


    public Date getFechaHora() {
        return fechaHora;
    }


    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContacto != null ? idContacto.hashCode() : 0);
        return hash;
    }


    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) object;
        if ((this.idContacto == null && other.idContacto != null) || (this.idContacto != null && !this.idContacto.equals(other.idContacto))) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "modelo.Contacto[ idContacto=" + idContacto + " ]";
    }
    
}
