import java.util.ArrayList;

public class TDDSong {
    private static String resultado="";
    private static String estrofa1 =
            "There was an old lady who swallowed a fly.\n" +
            "I don't know why she swallowed a fly - perhaps she'll die!\n";

    private static String estrofa2 =
            "There was an old lady who swallowed a spider;\n" +
            "That wriggled and wiggled and tickled inside her.\n" +
            "She swallowed the spider to catch the fly;\n" +
            "I don't know why she swallowed a fly- perhaps she'll die!\n";

    private static String estrofa3 =
            "There was an old lady who swallowed a bird;\n" +
            "How absurd to swallow a bird.\n" +
            "She swallowed the bird to catch the spider,\n" +
            "She swallowed the spider to catch the fly;\n" +
            "I don't know why she swallowed a fly - perhaps she'll die!\n" +
            "\n";

    public static String filtroParrafos(ArrayList<String> animales) {
        if (animales.size() == 1) {
            resultado = estrofa1;
        } else if (animales.size() == 2) {
            resultado = estrofa2;
        } else if (animales.size() == 3) {
            resultado = estrofa3;
        }
        return resultado;
    }
}
