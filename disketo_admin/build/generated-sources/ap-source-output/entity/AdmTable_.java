package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-07T06:20:40")
@StaticMetamodel(AdmTable.class)
public class AdmTable_ { 

    public static volatile SingularAttribute<AdmTable, String> password;
    public static volatile SingularAttribute<AdmTable, Integer> idAdm;
    public static volatile SingularAttribute<AdmTable, Date> fechaCreacion;
    public static volatile SingularAttribute<AdmTable, String> usuario;
    public static volatile SingularAttribute<AdmTable, String> nombre;
    public static volatile SingularAttribute<AdmTable, String> email;

}