package c01.curso.sandoval;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        // leeNombre();
        tiposDeDatos();
        desiciones();
        operadoresArtimeticos();
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
     * Tipos de datos
     *
     */
    private static void tiposDeDatos(){
        // Primitivos/Basicos
        byte edad = 0;     // 1 byte :)
        short numero = 0;  // 2 bytes
        int i = 0;         // 4 bytes
        long total = 0;    // 8 bytes
        float r = 0.0f;     // decimal simple, 4 bytes
        double d = 0.0d;    // decimal doble, 8 bytes
        char c = 'A';      // caracter, 2 bytes
        boolean b = false; // true/false, 1 byte

        // Objetos
        String cadena = "Yomero";
        System.out.println("Yo soy: " + cadena);
    }


    /**
     *  +  Suma
     *  -  Resta
     *  *  Multiplicación
     *  /  División
     *  %  Modulo divisor
     *
     */
    private static void operadoresArtimeticos() {
        int a = 20;
        int b = 50;
        int r = a + b;
        System.out.println("La suma es " + r);
        System.out.format("La suma de %d + %d = %d", a, b, r);
    }


    /**
     * Desiciones/Condiciones
     *  ==     Es igual
     *  !=     Es distinto
     *  <, <=, >, >=  Menor, menor o igual, mayor, mayor o igual
     *
     *  &&     Operador and (y)
     *  ||     Operador or (o)
     *  !      Operador not (no)
     *
     */
    private static void desiciones(){
        int edad = 17;
        if (edad<=18) {
            System.out.println("Eres menor de edad!");
        }

        int calificacion = 45;
        if (calificacion<=60) {
            System.out.println("REPROBASTE!");
        }
        else {
            System.out.println("OK, estas aprobado");
        }

        int resto = 100 % 2;
        String msg = (resto==0) ? "Es Par" : "Es Impar";
        System.out.println("El numero 100 " + msg);
    }
}
