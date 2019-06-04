package service.webservice;

import com.google.gson.Gson;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import model.dao.GeneroDAO;
import model.dao.GeneroDAOClass;
import model.pojo.Genero;


/**
 * @author asathor
 */
@Stateless
@Path("/genero")
public class GeneroResource {

    @GET
    public String getGeneros() {
        GeneroDAO miDao = new GeneroDAOClass();
        List<Genero> miLista = miDao.getGeneros();
        String generoJson = new Gson().toJson(miLista);
        return generoJson;
    }


}
