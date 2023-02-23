package test.java.com.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.clases.ObraDeArte;


public class MenuTest {
    private static final int ID = 100;
    private static final String NOMBRE = "nombre de prueba";
    private static final String AUTOR = "autor inventado";
    private static final String TECNICA = "óleo";
    private static final String MATERIAL = "acero";
    private static final double PRECIO = 1000;
    private static final double ALTURA = 3;
    private static final double PESO = 5;
    private static final int PIEZAS = 3;
    private static final String DESC = "descripcion";

    private ObraDeArte OBRA_CON_MATERIAL;

    private static final int OBRAS_EXPUESTAS = 1;
    private static final int DAR_DE_ALTA_UNA_NUEVA_OBRA = 2;
    private static final int MODIFICAR_LOS_DATOS = 3;
    private static final int DETALLES = 4;
    private static final int PRECIOS = 5;
    private static final int ETIQUETA = 6;
    private static final int SALIR = 7;
    private static final int MENU_PRINCIPAL = 8;

    private int DONDE_VA_EL_USUARIO = 0; // Esto simula a donde quiere ir el usuario

    @BeforeEach
    void creoObjetoObraConMaterial() {
        OBRA_CON_MATERIAL = new ObraDeArte(ID, NOMBRE, AUTOR, TECNICA, MATERIAL, PRECIO, ALTURA, PESO, PIEZAS, DESC);
    }

    @AfterEach
    void borroObjetoObraConMaterial() {
        OBRA_CON_MATERIAL = null;
    }
    @Test
    void entrarAObrasExpuestas() {
        DONDE_VA_EL_USUARIO = 1;
        assertTrue(DONDE_VA_EL_USUARIO == OBRAS_EXPUESTAS, "no entra en obras expuestas");
    }
}
