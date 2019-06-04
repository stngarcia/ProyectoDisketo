package disketo_restclient;

import disketo_restclient.consumer.ArtistConsumer;
import disketo_restclient.consumer.EstadoConsumer;
import disketo_restclient.consumer.GeneroConsumer;


/**
 * @author asathor
 */
public class Disketo_restClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mostrando los estados...");
        EstadoConsumer estadoConsumer = new EstadoConsumer();
        estadoConsumer.getEstados();;

        System.out.println("");
        System.out.println("Mostrando los generos...");
        GeneroConsumer generoConsumer = new GeneroConsumer();
        generoConsumer.getGeneros();

        System.out.println("");
        System.out.println("Mostrando los artistas...");
        ArtistConsumer artistConsumer = new ArtistConsumer();
        artistConsumer.getArtists();;


        System.out.println("");
        System.out.println("Listo...");

    }


}
