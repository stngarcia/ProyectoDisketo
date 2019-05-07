package data;


import entity.AdmTable;
import java.util.List;
import java.util.Map;
import javax.ejb.Local;


/**
 *
 * @author asathor
 */
@Local
public interface AdmTableFacadeLocal {

    void create(AdmTable admTable);


    void edit(AdmTable admTable);


    void remove(AdmTable admTable);


    AdmTable find(Object id);


    List<AdmTable> findAll();


    List<AdmTable> findRange(int[] range);


    int count();


    List<AdmTable> findNamedQuery(String namedQueryName, Map<String, String> parameters);


}
