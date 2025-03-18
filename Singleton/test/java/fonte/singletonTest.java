package test.java.fonte;

import main.java.fonte.singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class singletonTest {

    @Test
    public void deveRetornarMarcaImpressora() {
        singleton.getInstance().setMarcaImpressora("Ricoh");
        assertEquals("Ricoh", singleton.getInstance().getMarcaImpressora());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        singleton.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", singleton.getInstance().getUsuarioLogado());
    }

}