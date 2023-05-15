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

}