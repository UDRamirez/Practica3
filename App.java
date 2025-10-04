import java.util.Scanner;

/**
 * Clase principal de la aplicación.
 * <p>
 * Contiene el método {@code main} que inicializa el catálogo con películas, sagas y discos,
 * además de ofrecer un menú interactivo para que el usuario explore los artículos.
 * </p>
 */
public class App {

    /**
     * Método principal que ejecuta el programa.
     * <p>
     * Inicializa el catálogo, crea las películas, sagas y discos, los añade al catálogo,
     * y gestiona el menú interactivo para que el usuario pueda:
     * <ul>
     *     <li>Ver el catálogo completo</li>
     *     <li>Filtrar por género</li>
     *     <li>Filtrar por costo máximo</li>
     *     <li>Ver información detallada de un artículo</li>
     *     <li>Salir del programa</li>
     * </ul>
     * </p>
     *
     * @param args argumentos de línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();

        Saga StarWars = new Saga("STAR WARS", "Ciencia Ficción");

        Saga trilogiaDePrecuelas = new Saga("Trilogía de Precuelas", "Ciencia Ficción");

        Saga trilogiaOriginal = new Saga("Trilogía Original", "Ciencia Ficción");

        Saga trilogiaDeSecuelas = new Saga("Trilogía de Secuelas", "Ciencia Ficción");

        Pelicula SW1i = new Pelicula(
            "Star Wars Episodio I: La Amenaza Fantasma",
            "George Lucas",
            136,
            "Aventura",
            "Dos Jedi protegen a la Reina Amidala mientras descubren a un niño con la profecía de traer equilibrio.",
            45.0
        );

        Pelicula SW1ii = new Pelicula(
            "Star Wars Episodio II: El Ataque de los Clones",
            "George Lucas",
            142,
            "Romance",
            "Anakin protege a Padmé, pero la guerra y su amor prohibido lo empujan hacia el lado oscuro.",
            48.0
        );

        Pelicula SW1iii = new Pelicula(
            "Star Wars Episodio III: La Venganza de los Sith",
            "George Lucas",
            140,
            "Drama",
            "Anakin cae al lado oscuro, traicionando a los Jedi para unirse a Palpatine como Darth Vader.",
            50.0
        );

        Pelicula SW2i = new Pelicula(
            "Star Wars Episodio IV: Una Nueva Esperanza",
            "George Lucas",
            121,
            "Aventura",
            "Luke y los rebeldes luchan para destruir la Estrella de la Muerte y liberar a la galaxia.",
            55.0
        );

        Pelicula SW2ii = new Pelicula(
            "Star Wars Episodio V: El Imperio Contraataca",
            "Irvin Kershner",
            124,
            "Suspenso",
            "El Imperio persigue a los rebeldes mientras Luke enfrenta su destino con una terrible verdad sobre su padre.",
            58.0
        );

        Pelicula SW2iii = new Pelicula(
            "Star Wars Episodio VI: El Retorno del Jedi",
            "Richard Marquand",
            131,
            "Aventura",
            "Los rebeldes luchan para destruir la segunda Estrella de la Muerte mientras Luke enfrenta su destino.",
            56.0
        );

        Pelicula SW3i = new Pelicula(
            "Star Wars Episodio VII: El Despertar de la Fuerza",
            "J.J. Abrams",
            138,
            "Acción",
            "Rey y Finn se unen para encontrar a Luke Skywalker mientras la Primera Orden amenaza la galaxia.",
            52.0
        );

        Pelicula SW3ii = new Pelicula(
            "Star Wars Episodio VIII: Los Últimos Jedi",
            "Rian Johnson",
            152,
            "Bélica",
            "Rey entrena con Luke, mientras la resistencia lucha por sobrevivir ante la opresión de la Primera Orden.",
            54.0
        );

        Pelicula SW3iii = new Pelicula(
            "Star Wars Episodio IX: El Ascenso de Skywalker",
            "J.J. Abrams",
            142,
            "Aventura",
            "La Resistencia se enfrenta a su última batalla contra la Primera Orden, mientras Rey descubre su linaje.",
            53.0
        );

        Pelicula SWni = new Pelicula(
            "Rogue One: Una Historia de Star Wars",
            "Gareth Edwards",
            133,
            "Bélica",
            "Un grupo de rebeldes roba los planos de la Estrella de la Muerte en una misión suicida.",
            49.0
        );

        trilogiaDePrecuelas.addArticulo(SW1i);
        trilogiaDePrecuelas.addArticulo(SW1ii);
        trilogiaDePrecuelas.addArticulo(SW1iii);

        trilogiaOriginal.addArticulo(SW2i);
        trilogiaOriginal.addArticulo(SW2ii);
        trilogiaOriginal.addArticulo(SW2iii);

        trilogiaDeSecuelas.addArticulo(SW3i);
        trilogiaDeSecuelas.addArticulo(SW3ii);
        trilogiaDeSecuelas.addArticulo(SW3iii);

	catalogo.addArticulo(trilogiaDePrecuelas);
	catalogo.addArticulo(trilogiaOriginal);
	catalogo.addArticulo(trilogiaDeSecuelas);
	
        StarWars.addArticulo(trilogiaDePrecuelas);
        StarWars.addArticulo(trilogiaOriginal);
        StarWars.addArticulo(trilogiaDeSecuelas);
        StarWars.addArticulo(SWni);

        catalogo.addArticulo(StarWars);

	Pelicula TR = new Pelicula(
            "Thunderbolts*",
            "Jake Schreier",
            126,
            "Acción",
            "Un grupo de antiheroés se unen, en contra de su voluntad,  ante una amenaza que podría acabar con el mundo",
            60.0
        );

	catalogo.addArticulo(TR);

        Saga wesAnderson = new Saga("Películas de Wes Anderson", "Comedia");

        Pelicula WA1 = new Pelicula(
            "The Grand Budapest Hotel",
            "Wes Anderson",
            99,
            "Comedia",
            "Un conserje y su joven protegido se ven envueltos en un robo, un asesinato y una batalla por una fortuna familiar, mientras enfrentan la locura de la guerra.",
            45.0
        );

        Pelicula WA2 = new Pelicula(
            "Moonrise Kingdom",
            "Wes Anderson",
            94,
            "Aventura",
            "Dos jóvenes se escapan en busca de libertad, mientras sus familias y la policía tratan de encontrarlos en una isla remota durante un verano caluroso.",
            50.0
        );

        Pelicula WA3 = new Pelicula(
            "The Royal Tenenbaums",
            "Wes Anderson",
            108,
            "Drama",
            "La historia de una familia disfuncional y sus tres hijos prodigiosos, quienes, al regresar a su hogar, se enfrentan a su pasado y a sus propios fracasos.",
            48.0
        );

        Pelicula WA4 = new Pelicula(
            "Fantastic Mr. Fox",
            "Wes Anderson",
            87,
            "Animación",
            "Un zorro astuto planea un último robo a tres granjeros, mientras enfrenta las complicaciones de su vida familiar y su naturaleza salvaje.",
            52.0
        );

        Pelicula WA5 = new Pelicula(
            "The Life Aquatic with Steve Zissou",
            "Wes Anderson",
            119,
            "Comedia",
            "Un excéntrico oceanógrafo se embarca en una misión para cazar al tiburón que mató a su compañero, mientras enfrenta sus propios demonios y problemas familiares.",
            53.0
        );

        Pelicula WA6 = new Pelicula(
            "Isle of Dogs",
            "Wes Anderson",
            101,
            "Animación",
            "En un futuro distópico, un niño viaja a una isla llena de perros exiliados para rescatar a su mascota, mientras se enfrenta a una rebelión canina.",
            54.0
        );

        wesAnderson.addArticulo(WA1);
        wesAnderson.addArticulo(WA2);
        wesAnderson.addArticulo(WA3);
        wesAnderson.addArticulo(WA4);
        wesAnderson.addArticulo(WA5);
        wesAnderson.addArticulo(WA6);

        catalogo.addArticulo(wesAnderson);

        Saga LOTR = new Saga("El Señor de los Anillos", "Fantasía");

        Saga EH = new Saga("El Hobbit", "Fantasía");

        Saga LOTRyEH = new Saga("Universo del Señor de los Anillos", "Fantasía");

        Pelicula LOTR1 = new Pelicula(
            "El Señor de los Anillos: La Comunidad del Anillo",
            "Peter Jackson",
            178,
            "Aventura",
            "Un grupo de héroes se une para destruir el Anillo Único y detener el mal que amenaza con apoderarse de la Tierra Media.",
            55.0
        );

        Pelicula LOTR2 = new Pelicula(
            "El Señor de los Anillos: Las Dos Torres",
            "Peter Jackson",
            179,
            "Bélico",
            "Mientras la Comunidad se disuelve, Aragorn, Legolas y Gimli luchan por detener el avance de Sauron mientras Frodo y Sam se acercan a Mordor.",
            57.0
        );

        Pelicula LOTR3 = new Pelicula(
            "El Señor de los Anillos: El Retorno del Rey",
            "Peter Jackson",
            201,
            "Drama",
            "La batalla final por la Tierra Media llega a su fin mientras Frodo y Sam completan su misión en el Monte del Destino.",
            60.0
        );

        Pelicula H1 = new Pelicula(
            "El Hobbit: Un Viaje Inesperado",
            "Peter Jackson",
            169,
            "Aventura",
            "Bilbo Bolsón se une a un grupo de enanos para recuperar su hogar, mientras se enfrenta a orcos, trolls y dragones en su épica travesía.",
            50.0
        );

        Pelicula H2 = new Pelicula(
            "El Hobbit: La Desolación de Smaug",
            "Peter Jackson",
            161,
            "Suspenso",
            "Bilbo y los enanos enfrentan más desafíos en su misión para derrotar al dragón Smaug y reclamar la Montaña Solitaria.",
            52.0
        );

        Pelicula H3 = new Pelicula(
            "El Hobbit: La Batalla de los Cinco Ejércitos",
            "Peter Jackson",
            144,
            "Bélico",
            "La batalla por la Montaña Solitaria llega a su clímax mientras Bilbo y los enanos luchan por sobrevivir en medio del caos.",
            54.0
        );

        Pelicula LOTR1978 = new Pelicula(
            "El Señor de los Anillos",
            "Ralph Bakshi",
            132,
            "Animación",
            "Frodo Bolsón y su grupo de héroes deben destruir el Anillo Único en el Monte del Destino para evitar que el malvado Sauron conquiste la Tierra Media.",
            30.0
        );

        LOTR.addArticulo(LOTR1);
        LOTR.addArticulo(LOTR2);
        LOTR.addArticulo(LOTR3);

        EH.addArticulo(H1);
        EH.addArticulo(H2);
        EH.addArticulo(H3);

        LOTRyEH.addArticulo(LOTR);
        LOTRyEH.addArticulo(EH);
        LOTRyEH.addArticulo(LOTR1978);

        catalogo.addArticulo(LOTRyEH);

        Disco disco1 = new Disco(
            "The Wall",
            "Pink Floyd",
            "Rock",
            1979,
            28.0
        );

        Disco disco2 = new Disco(
            "<|°_°|>",
            "Caravan Palace",
            "Electroswing",
            2015,
            30.0
        );

        Disco disco3 = new Disco(
            "Like a Prayer",
            "Madonna",
            "Pop",
            1989,
            25.0
        );

        Disco disco4 = new Disco(
            "The Miseducation of Lauryn Hill",
            "Lauryn Hill",
            "Hip-Hop",
            1998,
            22.0
        );

        Disco disco5 = new Disco(
            "Crystal Castles II",
            "Crystal Castles",
            "Experimental",
            2010,
            18.0
        );

        Disco disco6 = new Disco(
            "Random Access Memories",
            "Daft Punk",
            "Electrónica",
            2013,
            30.0
        );

        Disco disco7 = new Disco(
            "ODYSSÉE",
            "L'Impératrice",
            "Pop",
            2015,
            20.0
        );

        Disco disco8 = new Disco(
            "Master of Puppets",
            "Metallica",
            "Metal",
            1986,
            27.0
        );

        catalogo.addArticulo(new DiscoAdapter(disco1));
        catalogo.addArticulo(new DiscoAdapter(disco2));
        catalogo.addArticulo(new DiscoAdapter(disco3));
        catalogo.addArticulo(new DiscoAdapter(disco4));
        catalogo.addArticulo(new DiscoAdapter(disco5));
        catalogo.addArticulo(new DiscoAdapter(disco6));
        catalogo.addArticulo(new DiscoAdapter(disco7));
        catalogo.addArticulo(new DiscoAdapter(disco8));

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
	    System.out.println("Bienvenido a la plataforma de RockBuster");
            System.out.println("\n---- MENU ----");
            System.out.println("1. Ver el catálogo completo");
            System.out.println("2. Filtrar por género");
            System.out.println("3. Filtrar por costo máximo");
            System.out.println("4. Ver información de un artículo");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    catalogo.mostrarCatalogo();
                    break;
                case 2:
                    System.out.print("Ingrese el género para filtrar: ");
                    String genero = scanner.next();
                    catalogo.filtarPorGenero(genero);
                    break;
                case 3:
                    System.out.print("Ingrese el costo máximo: ");
                    double costoMaximo = scanner.nextDouble();
                    catalogo.filtarPorCosto(costoMaximo);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del artículo: ");
                    String nombreArticulo = scanner.next();
                    catalogo.mostrarArticulo(nombreArticulo);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción entre 1 y 5.");
            }
        }
        scanner.close();
    }
}
