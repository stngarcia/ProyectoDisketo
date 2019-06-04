package service.webservice;

import com.google.gson.Gson;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import model.dao.ArtistaDAO;
import model.dao.ArtistaDAOClass;
import model.pojo.Artista;


/**
 * @author asathor
 */
@Stateless
@Path("/artistapornombre")
public class ArtistaByNameResource {

    @GET
    public String artistaByName(@QueryParam("nombre") String nombre) {

        ArtistaDAO miDao = new ArtistaDAOClass();
        List<Artista> miLista = miDao.getArtistaByName(nombre);
        String artistaJson = new Gson().toJson(miLista);
        return artistaJson;
    }


}
