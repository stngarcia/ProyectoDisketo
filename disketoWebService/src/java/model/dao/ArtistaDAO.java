package model.dao;

import java.util.List;


/**
 * @author asathor
 */
public interface ArtistaDAO {

    List getArtistaByName(String nombreArtista);


    List getArtistas();


}
