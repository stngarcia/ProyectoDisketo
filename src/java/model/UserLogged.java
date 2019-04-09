package model;

// Importaciones.
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asathor
 */
public class UserLogged {

// Atributos de la clase.
    private String user_name;
    private String date_login;

// Contructores
    private UserLogged() {
        this.user_name = "Anonimo";
        this.date_login = this.getCurrentDate();
    }

    private UserLogged(String user_name) {
        this.user_name = user_name;
        this.date_login = this.getCurrentDate();
    }

// Constructores implicitos
    public static UserLogged createUserLog() {
        return new UserLogged();
    }

    public static UserLogged createUserLog(String user_name) {
        return new UserLogged(user_name);
    }

    /*
* getCurrentDate()
* Devuelve la fecha y hora actual.
     */
    private String getCurrentDate() {
        Date myDate = new Date();
        DateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return myFormat.format(myDate);
    }

    // Accesadores y mutadores.
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDate_login() {
        return date_login;
    }

    public void setDate_login(String date_login) {
        this.date_login = date_login;
    }

}
