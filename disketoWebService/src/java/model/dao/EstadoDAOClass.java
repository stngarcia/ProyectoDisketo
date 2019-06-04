package model.dao;

import java.util.List;
import model.pojo.Estado;


/**
 * @author asathor
 */
public class EstadoDAOClass extends SelectQuery implements EstadoDAO {

    public EstadoDAOClass() {
        super();
        querySelect = "SELECT e.idEstado, e.nombreEstado ";
        queryFrom = "FROM Estado e ";
        queryOrderBy = "ORDER BY e.nombreEstado ";
    }


    @Override
    public List getEstados() {
        List<Estado> myList;
        try {
            myList = (List<Estado>) queryDefine().list();
        } catch (Exception ex) {
            myList = null;
        }
        return myList;
    }


}
