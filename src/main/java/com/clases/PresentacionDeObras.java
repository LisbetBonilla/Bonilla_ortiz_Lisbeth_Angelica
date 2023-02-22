package main.java.com.clases;

public class PresentacionDeObras {

    public static void main(String[] args) {

        ObraDeArte obra1 = new ObraDeArte(001, "Guernica", "P.Picasso", "Óleo", null, 1000, 5, 2, 5,
                "cuadro guerra civil");
        ObraDeArte obra2 = new ObraDeArte(002, "La Vie", "P.Picasso", "Óleo", null, 200, 1, 1, 1, "óleo");
        ObraDeArte obra3 = new ObraDeArte(003, "El Sueño", "P.Picasso", "Óleo", null, 300, 1.3, 1, 1, "óleo");
        ObraDeArte obra4 = new ObraDeArte(004, "Retrato de Dora Maar", "P.Picasso", "Óleo", null, 400, 0.8, 1, 5,
                "óleo");
        ObraDeArte obra5 = new ObraDeArte(005, "El piel roja", "U.Checa", null, "Escultura", 350, 0.8, 2, 1,
                "escultura");

        ObraDeArte[] todasLasObras = { obra1, obra2, obra3, obra4, obra5 };

        for (int n = 0; n < todasLasObras.length; n++) {
            System.out.println(todasLasObras[n]);
        }
    }
}
