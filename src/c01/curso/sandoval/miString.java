package c01.curso.sandoval;

/**
 * Ejemplo del uso del objeto String.
 *
 */
public class miString {
    public void testString() {

        System.out.println();
        System.out.println("===== Clase String =====");

        // Maneras de declarar una variable
        String s1 = new String("Uno");
        String s2 = "Dos";
        String s3 = new String();


        // Metodos mas usados
        int l = s1.length();                    // Longitud de una cadena
        boolean b1 = s1.equals(s2);             // compara cadenas (MAY/MIN)
        boolean b2 = s1.equalsIgnoreCase(s2);   // compara cadenas
        char c = s1.charAt(1);                  // devuelve el caracter a la posición dada
        String s4 = s1.substring(2, 3);         // extrae la cadena indicada (inicio, final)
        int p = s1.indexOf('o');                // devuelve la posición del carcater o cadena (-1 si no esta)
        String s5 = s1.replace('o', '-');       // devuelve la cadena resultante de reemplazar 'o' x '-'
        String s6 = s1.toLowerCase();
        String s7 = s1.toUpperCase();
        String s8 = s1 + s2;
        char arrChar[] = s1.toCharArray();  // Pasa la cadena a un array de caracteres


        // De aqui en adelante agregar ejemplos de uso comun de los metodos/funciones
    }
}
