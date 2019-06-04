package model.dao;

import java.util.List;
import model.pojo.Genero;


/**
 * @author asathor
 */
public class GeneroDAOClass extends SelectQuery implements GeneroDAO {

    public GeneroDAOClass() {
        super();
        querySelect = "SELECT g.idGenero, g.nombreGenero ";
        queryFrom = "FROM Genero g ";
        queryOrderBy = "ORDER BY g.nombreGenero ";
    }


    @Override
    public List getGeneros() {
        List<Genero> myList;
        try {
            myList = (List<Genero>) queryDefine().list();
        } catch (Exception ex) {
            myList = null;
        }
        return myList;
    }


}
