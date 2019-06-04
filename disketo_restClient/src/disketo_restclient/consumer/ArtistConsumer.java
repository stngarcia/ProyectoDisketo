package disketo_restclient.consumer;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import disketo_restclient.client.ArtistClient;
import java.lang.reflect.Type;


/**
 * @author asathor
 */
public class ArtistConsumer {

    public ArtistConsumer() {
    }


    public void getArtists() {
        ArtistClient artistClient = new ArtistClient();
        String miRespuesta = artistClient.artistas(String.class);
        artistClient.close();
        System.out.println(miRespuesta);
    }


}
