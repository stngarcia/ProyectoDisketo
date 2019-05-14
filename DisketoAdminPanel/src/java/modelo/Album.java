package modelo;


import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;



/**
  * @author asathor
 */
@Entity
@Table(name = "album", catalog = "disketo_data2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Album.findAll", query = "SELECT a FROM Album a")
    , @NamedQuery(name = "Album.findByIdAlbum", query = "SELECT a FROM Album a WHERE a.idAlbum = :idAlbum")
    , @NamedQuery(name = "Album.findByNombreAlbum", query = "SELECT a FROM Album a WHERE a.nombreAlbum = :nombreAlbum")
    , @NamedQuery(name = "Album.findByLanzamientoAlbum", query = "SELECT a FROM Album a WHERE a.lanzamientoAlbum = :lanzamientoAlbum")
    , @NamedQuery(name = "Album.findByEdicionAlbum", query = "SELECT a FROM Album a WHERE a.edicionAlbum = :edicionAlbum")})
public class Album implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAlbum", nullable = false)
    private Integer idAlbum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nombreAlbum", nullable = false, length = 255)
    private String nombreAlbum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lanzamientoAlbum", nullable = false)
    private int lanzamientoAlbum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "edicionAlbum", nullable = false, length = 25)
    private String edicionAlbum;
    @JoinTable(name = "discografia_album", joinColumns = {
        @JoinColumn(name = "idAlbum", referencedColumnName = "idAlbum")}, inverseJoinColumns = {
        @JoinColumn(name = "idDiscografia", referencedColumnName = "idDiscografia")})
    @ManyToMany
    private Collection<Discografia> discografiaCollection;
    @JoinTable(name = "album_formato", joinColumns = {
        @JoinColumn(name = "idAlbum", referencedColumnName = "idAlbum")}, inverseJoinColumns = {
        @JoinColumn(name = "idFormato", referencedColumnName = "idFormato")})
    @ManyToMany
    private Collection<Formato> formatoCollection;
    @JoinColumn(name = "idFormato", referencedColumnName = "idFormato", nullable = false)
    @ManyToOne(optional = false)
    private Formato idFormato;

    public Album() {
    }


    public Album(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }


    public Album(Integer idAlbum, String nombreAlbum, int lanzamientoAlbum, String edicionAlbum) {
        this.idAlbum = idAlbum;
        this.nombreAlbum = nombreAlbum;
        this.lanzamientoAlbum = lanzamientoAlbum;
        this.edicionAlbum = edicionAlbum;
    }


    public Integer getIdAlbum() {
        return idAlbum;
    }


    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }


    public String getNombreAlbum() {
        return nombreAlbum;
    }


    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }


    public int getLanzamientoAlbum() {
        return lanzamientoAlbum;
    }


    public void setLanzamientoAlbum(int lanzamientoAlbum) {
        this.lanzamientoAlbum = lanzamientoAlbum;
    }


    public String getEdicionAlbum() {
        return edicionAlbum;
    }


    public void setEdicionAlbum(String edicionAlbum) {
        this.edicionAlbum = edicionAlbum;
    }


    @XmlTransient
    public Collection<Discografia> getDiscografiaCollection() {
        return discografiaCollection;
    }


    public void setDiscografiaCollection(Collection<Discografia> discografiaCollection) {
        this.discografiaCollection = discografiaCollection;
    }


    @XmlTransient
    public Collection<Formato> getFormatoCollection() {
        return formatoCollection;
    }


    public void setFormatoCollection(Collection<Formato> formatoCollection) {
        this.formatoCollection = formatoCollection;
    }


    public Formato getIdFormato() {
        return idFormato;
    }


    public void setIdFormato(Formato idFormato) {
        this.idFormato = idFormato;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlbum != null ? idAlbum.hashCode() : 0);
        return hash;
    }


    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.idAlbum == null && other.idAlbum != null) || (this.idAlbum != null && !this.idAlbum.equals(other.idAlbum))) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "modelo.Album[ idAlbum=" + idAlbum + " ]";
    }
    
}
