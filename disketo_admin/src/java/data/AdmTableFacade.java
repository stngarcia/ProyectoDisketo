package data;


import entity.AdmTable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * @author asathor
 */
@Stateless
public class AdmTableFacade extends AbstractFacade<AdmTable> implements AdmTableFacadeLocal {

    @PersistenceContext(unitName = "disketo_adminPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }


    public AdmTableFacade() {
        super(AdmTable.class);
    }


}
