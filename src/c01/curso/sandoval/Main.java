package c01.curso.sandoval;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        // leeNombre();
        tiposDeDatos();
    }


    /**
     * Esta función lee el nombre de una persona por la entrada
     * estandar (teclado) y lo muestra en la pantalla.
     *
     */
    public static void leeNombre() {
        // Declara variable scanner
        Scanner scanner = new Scanner(System.in);

        // Imprime mensaje para pedir nombre
        System.out.print("Ingrese su nombre: ");

        // Pide nombre
        String nom = scanner.nextLine();

        // Imprime datos obtenido
        System.out.println("Tu Nombre es: " + nom);
    }


    /**
     * Tipos de datos:
     *
     *
     *
     */
    private static void tiposDeDatos(){
        byte edad = 0;     // 1 byte :)
        short numero = 0;  // 2 bytes
        int i = 0;         // 4 bytes
        long total = 0;    // 8 bytes
        float r = 0.0f;     // decimal simple, 4 bytes
        double d = 0.0d;    // decimal doble, 8 bytes
        char c = 'A';      // caracter, 2 bytes
        boolean b = false; // true/false, 1 byte

        String cadena = "Yomero";
        System.out.println("Yo soy: " + cadena);
    }
}
