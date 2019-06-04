package disketo_restclient.dto;

/**
 * @author asathor
 */
public class Artista {

    private Integer idArtista;
    private Estado estado;
    private Genero genero;
    private String nombreArtista;
    private String origenArtista;
    private Integer formadoArtista;
    private String tematicaArtista;

    public Artista() {
        idArtista = 0;
        estado = new Estado();
        genero = new Genero();
        nombreArtista = "";
        origenArtista = "";
        formadoArtista = 0;
        tematicaArtista = "";
    }


    public Integer getIdArtista() {
        return idArtista;
    }


    public void setIdArtista(Integer idArtista) {
        this.idArtista = idArtista;
    }


    public Estado getEstado() {
        return estado;
    }


    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    public Genero getGenero() {
        return genero;
    }


    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public String getNombreArtista() {
        return nombreArtista;
    }


    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }


    public String getOrigenArtista() {
        return origenArtista;
    }


    public void setOrigenArtista(String origenArtista) {
        this.origenArtista = origenArtista;
    }


    public Integer getFormadoArtista() {
        return formadoArtista;
    }


    public void setFormadoArtista(Integer formadoArtista) {
        this.formadoArtista = formadoArtista;
    }


    public String getTematicaArtista() {
        return tematicaArtista;
    }


    public void setTematicaArtista(String tematicaArtista) {
        this.tematicaArtista = tematicaArtista;
    }


    @Override
    public String toString() {
        return this.nombreArtista;
    }


}
