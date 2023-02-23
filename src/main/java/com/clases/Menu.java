package main.java.com.clases;

import java.util.Scanner;

public class Menu {

   
    private static final String PRIMERA_OPCION = "1. Ver obraObraDeArte expuestas";
    private static final String SEGUNDA_OPCION = "2. Dar de alta una nueva obra";
    private static final String TERCERA_OPCION = "3. Modificar los datos de una obra";
    private static final String CUARTA_OPCION = "4. Datalles de las obraObraDeArte";
    private static final String QUINTA_OPCION = "5. Precios";
    private static final String SEXTA_OPCION = "6. Etiqueta";
    private static final String OPCION_DE_SALIR = "7. Salir de la aplicación";
    private static final String[] OPCIONES_DEL_MENU = { PRIMERA_OPCION,
            SEGUNDA_OPCION, TERCERA_OPCION, CUARTA_OPCION, QUINTA_OPCION,
            SEXTA_OPCION, OPCION_DE_SALIR };

    private static final int OBRA_EXPUESTAS = 1; 
    private static final int NUEVA_OBRA = 2; 
    private static final int MODIFICAR_LOS_DATOS = 3; 
    private static final int DETALLES = 4;
    private static final int PRECIOS = 5;
    private static final int ETIQUETA = 6;
    private static final int SALIR = 7; 
    private static final int MENU_PRINCIPAL = 8; 

    private static boolean terminar = false;

    private static final String MENSAJE_DE_ERROR = "Opcion incorrecta. Prueba a poner otra opcion";
    private static final String MENSAJE_DE_DESPEDIDA = "Gracias por visitarnos";
}
    public static void main(String[] args) {

        // Aqui se archivan las obraObraDeArte.

        ObraDeArte obra1 = new ObraDeArte(001, "Guernica", "P.Picasso", "Óleo", null, 1000, 5, 2, 5, "cuadro guerra civil");
        ObraDeArte obra2 = new ObraDeArte(002, "La Vie", "P.Picasso", "Óleo", null, 200, 1, 1, 1, "óleo");
        ObraDeArte obra3 = new ObraDeArte(003, "El Sueño", "P.Picasso", "Óleo", null, 300, 1.3, 1, 1, "óleo");
        ObraDeArte obra4 = new ObraDeArte(004, "Retrato de Dora Maar", "P.Picasso", "Óleo", null, 400, 0.8, 1, 5, "óleo");
        ObraDeArte obra5 = new ObraDeArte(005, "El piel roja", "U.Checa", null, "Escultura", 350, 0.8, 2, 1, "escultura");
        ObraDeArte[] arrayObraDeArte = { obra1, obra2, obra3, obra4, obra5 };

        // muestra el menu principal al iniciar la aplicación

        for (int n = 1; n < 2; n++) {
            for (int i = 0; i < OPCIONES_DEL_MENU.length; i++) {
                System.out.println(OPCIONES_DEL_MENU[i]);
            }
            System.out.println("DIME A DONDE VAMOS");
        }

        // Aquí empieza el menú.

        Scanner teclado = new Scanner(System.in);

        while (!terminar) {

            int usuarioDice = 0;
            int usuarioElijeObra = 0;
            String usuarioDaNombre = null;
            String usuarioDaAutor = null;
            String usuarioDaTecnica = null;
            String usuarioDaMaterial = null;
            int usuarioDaPrecio = 0;
            int usuarioDaAltura = 0;
            int usuarioDaPeso = 0;
            int usuarioDaPiezas = 0;
            String usuarioDaDescripcion = null;
            usuarioDice = teclado.nextInt();

            if (usuarioDice <= 0 | usuarioDice > 8) {
                System.out.println(MENSAJE_DE_ERROR);
            }
            switch (usuarioDice) {

                // Menú principal.

                case MENU_PRINCIPAL:
                    for (int i = 0; i < OPCIONES_DEL_MENU.length; i++) {
                        System.out.println(OPCIONES_DEL_MENU[i]);
                    }
                    System.out.println("Dime una Opcion");
                    break;

                // ObraDeArte expuestas.

                case OBRA_EXPUESTAS:
                    for (int i = 0; i < arrayObraDeArte.length; i++) {
                        System.out.println(arrayObraDeArte[i]);
                    }
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Dar de alta.

                case NUEVA_OBRA:

                    ObraDeArte[] NuevaObra = new ObraDeArte[arrayObraDeArte.length + 1];
                    for (int i = 0; i < arrayObraDeArte.length; i++) {
                        NuevaObra[i] = arrayObraDeArte[i];
                    }
                    System.out.println(
                            "El id de la obra se registrara automaticamente, si desea cambiarlo dirijase al menu de modificacion de datos.");

                    System.out.println("Nombre de la obra  ");
                    teclado.nextLine();
                    usuarioDaNombre = teclado.nextLine();
                    System.out.println("Nombre del autor ");
                    usuarioDaAutor = teclado.nextLine();
                    System.out.println(
                            "Si es una pintura, introduzca la tecnica (de lo contarrio enter): ");
                    usuarioDaTecnica = teclado.nextLine();
                    System.out.println("Si es una escultura, introduzca de que material: ");
                    usuarioDaMaterial = teclado.nextLine();
                    System.out.println("Introduzca una descripción a la obra: ");
                    usuarioDaDescripcion = teclado.nextLine();
                    System.out.println("Introduzca el precio base de la obra: ");
                    usuarioDaPrecio = teclado.nextInt();
                    System.out.println("Introduzca la altura de la obra (EN METROS): ");
                    usuarioDaAltura = teclado.nextInt();
                    System.out.println("Introduzca el peso de la obra (EN TONELADAS): ");
                    usuarioDaPeso = teclado.nextInt();
                    System.out.println("Introduzca el número de piezas que componen la obra: ");
                    usuarioDaPiezas = teclado.nextInt();
                    ObraDeArte ObraNueva = new ObraDeArte(NuevaObra.length, usuarioDaNombre, usuarioDaAutor,
                            usuarioDaTecnica, usuarioDaMaterial, usuarioDaPrecio, usuarioDaAltura, usuarioDaPeso,
                            usuarioDaPiezas, usuarioDaDescripcion);

                    NuevaObra[NuevaObra.length - 1] = ObraNueva;
                    arrayObraDeArte = NuevaObra;

                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Modificar los datos.

                case MODIFICAR_LOS_DATOS:

                    break;

                // Detalles.

                case DETALLES:

                    Etiqueta estoDaLosDetalles = new Etiqueta();
                    estoDaLosDetalles.datosDeEtiqueta(usuarioDice, arrayObraDeArte);
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Precios.

                case PRECIOS:

                    break;

                // Etiqueta.

                case ETIQUETA:
                    System.out.println("Introduce el ID de la obra que quieras ver su etiqueta: ");
                    usuarioElijeObra = teclado.nextInt();
                    Etiqueta estoDaLaEtiqueta = new Etiqueta();
                    estoDaLaEtiqueta.datosDeEtiqueta(usuarioDice, arrayObraDeArte);
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Salir.

                case SALIR:
                    System.out.println(MENSAJE_DE_DESPEDIDA);
                    terminar = true;
            }
        }
    }