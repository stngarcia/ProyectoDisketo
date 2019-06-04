package model.dao;

import java.util.List;
import model.pojo.Artista;
import org.hibernate.Query;


/**
 * @author asathor
 */
public class ArtistaDAOClass extends SelectQuery implements ArtistaDAO {

    public ArtistaDAOClass() {
        super();
        querySelect = "SELECT a.idArtista, a.nombreArtista, a.estado.nombreEstado, a.genero.nombreGenero, a.origenArtista, a.formadoArtista, a.tematicaArtista ";
        queryFrom = "FROM Artista a ";
        queryOrderBy = "ORDER BY a.nombreArtista ";
        queryWhere = "";
    }


    @Override
    public List getArtistas() {
        List<Artista> myArtistList;
        try {
            myArtistList = (List<Artista>) queryDefine().list();
        } catch (Exception ex) {
            myArtistList = null;
        }
        return myArtistList;
    }


    @Override
    public List getArtistaByName(String nombreArtista) {
        queryWhere = "WHERE a.nombreArtista= :nombreArtista ";
        List<Artista> myArtistList;
        try {
            Query myQuery = queryDefine();
            myQuery.setParameter("nombreArtista", nombreArtista);
            myArtistList = (List<Artista>) myQuery.list();
        } catch (Exception ex) {
            myArtistList = null;
        }
        return myArtistList;
    }


}
