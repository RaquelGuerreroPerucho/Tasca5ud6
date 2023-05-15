import java.util.ArrayList;

public class TDDSong {
    private static String resultado="";
    private static String estrofa1 =
            "There was an old lady who swallowed a animal1.\n" +
            "I don't know why she swallowed a animal1 - perhaps she'll die!\n";

    private static String estrofa2 =
            "\n" +
            "There was an old lady who swallowed a animal2;\n" +
            "That wriggled and wiggled and tickled inside her.\n" +
            "She swallowed the animal2 to catch the animal1;\n" +
            "I don't know why she swallowed a animal1 - perhaps she'll die!\n";

    private static String estrofa3 =
            "\n" +
            "There was an old lady who swallowed a animal3;\n" +
            "How absurd to swallow a animal3.\n" +
            "She swallowed the animal3 to catch the animal2,\n" +
            "She swallowed the animal2 to catch the animal1;\n" +
            "I don't know why she swallowed a animal1 - perhaps she'll die!\n" +
            "\n";

    public static String filtroParrafos(ArrayList<String> animales) {
        if (animales.size() == 1) {
            resultado = estrofa1;
        } else if (animales.size() == 2) {
            resultado = estrofa1 + estrofa2;
        } else if (animales.size() == 3) {
            resultado = estrofa1 + estrofa2 +estrofa3;
        }

        if (animales.size() == 1) {
            resultado=resultado.replaceAll("animal1", animales.get(0));

        } else if (animales.size() == 2) {
            resultado=resultado.replaceAll("animal1", animales.get(0));
            resultado=resultado.replaceAll("animal2", animales.get(1));
        } else if (animales.size() == 3) {
            resultado=resultado.replaceAll("animal1", animales.get(0));
            resultado=resultado.replaceAll("animal2", animales.get(1));
            resultado=resultado.replaceAll("animal3", animales.get(2));
        }
        return resultado;
    }
}
