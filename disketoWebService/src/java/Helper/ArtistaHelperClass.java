package Helper;

import java.util.List;
import model.pojo.Artista;
import org.hibernate.Query;


/**
 * @author asathor
 */
public class ArtistaHelperClass extends SelectQuery implements ArtistaHelper {

    private ArtistaHelperClass() {
        super();
        queryFrom = "FROM Artista a ";
        queryOrderBy = "ORDER BY a.nombreArtista ";
        queryWhere = "";
    }


    public static ArtistaHelper create() {
        return new ArtistaHelperClass();
    }


    @Override
    public List getArtistas() throws Exception {
        List<Artista> myArtistList;
        myArtistList = queryDefine().list();
        return myArtistList;
    }


    @Override
    public List getArtistaByName(String nombreArtista) throws Exception {
        List<Artista> myArtistList;
        queryWhere = "WHERE a.nombreArtista= :nombreArtista ";
        Query myQuery = queryDefine();
        myQuery.setParameter("nombreArtista", nombreArtista);
        myArtistList = myQuery.list();
        return myArtistList;
    }


}
