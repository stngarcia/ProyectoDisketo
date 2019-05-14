package utils;


/**
 * @author asathor
 */
public class CapUtil {

    // Atributos
    private String text;

    // Constructor.
    private CapUtil(String text) {
        this.capitalizeText(text);
    }


    // Capitalizando el texto.
    private String capitalizeText(String text) {
        String[] words = text.split("\\s+");
        StringBuilder formatText = new StringBuilder();
        for (String word : words) {
            formatText.append(word.substring(0, 1).toUpperCase()
                    .concat(word.substring(1, word.length())
                            .toLowerCase()).concat(" "));
        }
        return formatText.toString();
    }


    // Creador del objeto.
    public static CapUtil capitalize(String text) {
        return new CapUtil(text);
    }


    // Accesador.
    public String getText() {
        return text;
    }


    // Mutador.
    public void setText(String text) {
        this.text = this.capitalizeText(text);
    }


    // Metodo to string de la clase.
    @Override
    public String toString() {
        return this.text;
    }


}
