/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.sesionbeans;

import entity.User;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author asathor
 */
@Local
public interface UserFacadeLocal {

    void create(User user);

    void edit(User user);

    void remove(User user);

    User find(Object id);

    List<User> findAll();

    List<User> findRange(int[] range);

    int count();

    List<User> findNamedQuery(String namedQueryName);

    List<User> findNamedQuery(String namedQueryName, String parameterName, Object parameterValue);

}
