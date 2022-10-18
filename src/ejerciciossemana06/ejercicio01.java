
package ejerciciossemana06;

/**
 *
 * @author User
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamada para obtener la suma de 5 
       System.out.println(sum(4));
    }
        // Metodo que devuelve la suma de los elementos desde n hasta 1 
    static int sum(int n)
    { 
        // caso base
       if(n==1)
           return 1;
       // llamada recursiva
       else 
           return n+sum(n-1);
    }
}
