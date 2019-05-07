package entity;

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
 *
 * @author asathor
 */
@Entity
@Table(name = "adm_table", catalog = "disketo_data", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdmTable.findAll", query = "SELECT a FROM AdmTable a")
    , @NamedQuery(name = "AdmTable.findByIdAdm", query = "SELECT a FROM AdmTable a WHERE a.idAdm = :idAdm")
    , @NamedQuery(name = "AdmTable.findByNombre", query = "SELECT a FROM AdmTable a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "AdmTable.findByUsuario", query = "SELECT a FROM AdmTable a WHERE a.usuario = :usuario")
    , @NamedQuery(name = "AdmTable.findByPassword", query = "SELECT a FROM AdmTable a WHERE a.password = :password")
    , @NamedQuery(name = "AdmTable.findLogin", query = "SELECT a FROM AdmTable a WHERE a.usuario = :usuario AND a.password = :password")
    , @NamedQuery(name = "AdmTable.findByEmail", query = "SELECT a FROM AdmTable a WHERE a.email = :email")
    , @NamedQuery(name = "AdmTable.findByFechaCreacion", query = "SELECT a FROM AdmTable a WHERE a.fechaCreacion = :fechaCreacion")})
public class AdmTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_adm", nullable = false)
    private Integer idAdm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "usuario", nullable = false, length = 30)
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "password", nullable = false, length = 30)
    private String password;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "email", nullable = false, length = 75)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    public AdmTable() {
    }

    public AdmTable(Integer idAdm) {
        this.idAdm = idAdm;
    }

    public AdmTable(Integer idAdm, String nombre, String usuario, String password, String email, Date fechaCreacion) {
        this.idAdm = idAdm;
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(Integer idAdm) {
        this.idAdm = idAdm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdm != null ? idAdm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdmTable)) {
            return false;
        }
        AdmTable other = (AdmTable) object;
        if ((this.idAdm == null && other.idAdm != null) || (this.idAdm != null && !this.idAdm.equals(other.idAdm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AdmTable[ idAdm=" + idAdm + " ]";
    }

}
