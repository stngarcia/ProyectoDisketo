package model.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * @author asathor
 */
public abstract class SelectQuery {

    protected Session mySession;
    protected String querySelect;
    protected String queryFrom;
    protected String queryWhere;
    protected String queryOrderBy;

    public SelectQuery() {
        this.mySession = HibernateUtil.getSessionFactory().getCurrentSession();
        this.querySelect = "";
        this.queryFrom = "";
        this.queryWhere = "";
        this.queryOrderBy = "";
    }


    protected Query queryDefine() throws Exception {
        Transaction myTransaction = this.mySession.beginTransaction();
        Query myQuery = this.mySession.createQuery(querySelect + queryFrom + queryWhere + queryOrderBy);
        return myQuery;
    }


}
