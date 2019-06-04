package disketo_restclient.consumer;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import disketo_restclient.client.GeneroClient;
import java.lang.reflect.Type;


/**
 * @author asathor
 */
public class GeneroConsumer {

    public GeneroConsumer() {
    }


    public void getGeneros() {
        GeneroClient miGeneroClient = new GeneroClient();
        String miRespuesta = miGeneroClient.getGeneros(String.class);
        System.out.println(miRespuesta);
        miGeneroClient.close();
    }


}
