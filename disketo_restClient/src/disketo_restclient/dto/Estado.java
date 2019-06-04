package disketo_restclient.dto;

/**
 * @author asathor
 */
public class Estado {

    private Integer idEstado;
    private String nombreEstado;

    public Estado() {
        this.idEstado = 0;
        this.nombreEstado = "";
    }


    public Integer getIdEstado() {
        return idEstado;
    }


    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }


    public String getNombreEstado() {
        return nombreEstado;
    }


    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }


    @Override
    public String toString() {
        return this.nombreEstado;
    }


}
