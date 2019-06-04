package service.webservice;

import com.google.gson.Gson;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import model.dao.ArtistaDAO;
import model.dao.ArtistaDAOClass;
import model.pojo.Artista;


/**
 * @author asathor
 *
 */
@Stateless
@Path("/artista")
public class ArtistaResource {

    @GET
    public String artistas() {
        ArtistaDAO miDao = new ArtistaDAOClass();
        List<Artista> miLista = miDao.getArtistas();
        String artistaJson = new Gson().toJson(miLista);
        return artistaJson;
    }


}
