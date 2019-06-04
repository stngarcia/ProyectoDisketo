package disketo_restclient.consumer;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import disketo_restclient.client.EstadoClient;
import disketo_restclient.dto.Estado;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


/**
 * @author asathor
 */
public class EstadoConsumer {

    public EstadoConsumer() {
    }


    public void getEstados() {
        EstadoClient miEstadoClient = new EstadoClient();
        String miRespuesta = miEstadoClient.getEstados(String.class);
        System.out.println(miRespuesta);
        miEstadoClient.close();
    }


}
