package service.webservice;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import model.dao.EstadoDAO;
import model.dao.EstadoDAOClass;
import model.pojo.Estado;


/**
 * @author asathor
 */
@Stateless
@Path("/estado")
public class EstadoResource {

    @GET
    public String getEstados() {
        EstadoDAO myDao = new EstadoDAOClass();
        Type miTipo = new TypeToken<List<Estado>>() {
        }.getType();
        List<Estado> miLista = new ArrayList<>();
        miLista = myDao.getEstados();
        String estadoJson = new Gson().toJson(miLista, miTipo);
        return estadoJson;
    }


}
