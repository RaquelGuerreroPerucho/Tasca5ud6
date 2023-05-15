import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {

    @Test
    public void test1(){
        ArrayList<String> animal = new ArrayList<>();
        String resultadoEsperado= "";
        String resultadoReal = TDDSong.filtroParrafos(animal) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2(){
        ArrayList<String> animal = new ArrayList<>();
        animal.add("fly");
        String resultadoEsperado= "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" ;
        String resultadoReal = TDDSong.filtroParrafos(animal) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3(){
        ArrayList<String> animal = new ArrayList<>();
        animal.add("spider");
        String resultadoEsperado= "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" ; ;
        String resultadoReal = TDDSong.filtroParrafos(animal) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test4(){
        ArrayList<String> animal = new ArrayList<>();
        animal.add("fly");
        animal.add("spider");
        String resultadoEsperado= "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        String resultadoReal = TDDSong.filtroParrafos(animal) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test5(){
        ArrayList<String> animal = new ArrayList<>();
        animal.add("spider");
        animal.add("fly");

        String resultadoEsperado= "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the spider;\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n";
        String resultadoReal = TDDSong.filtroParrafos(animal) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test6(){
        ArrayList<String> animal = new ArrayList<>();
        animal.add("fly");
        animal.add("spider");
        animal.add("bird");

        String resultadoEsperado= "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a bird;\n" +
                "How absurd to swallow a bird.\n" +
                "She swallowed the bird to catch the spider,\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n";
        String resultadoReal = TDDSong.filtroParrafos(animal) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test7(){
        ArrayList<String> animal = new ArrayList<>();
        animal.add("bird");
        animal.add("fly");
        animal.add("spider");

        String resultadoEsperado= "There was an old lady who swallowed a bird.\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "How absurd to swallow a spider.\n" +
                "She swallowed the spider to catch the fly,\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n";
        String resultadoReal = TDDSong.filtroParrafos(animal) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

}