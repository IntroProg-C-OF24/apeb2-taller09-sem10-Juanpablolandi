package taller_09;
public class ejercicio_2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int mediaA, suma = 0, elementos = 13;
        for (int i = 0; i < elementos; i++) {
            suma = suma + arreglo[i];
        }
        mediaA = (suma/elementos);
        System.out.println("Media Aritmética: " + mediaA);
        for (int i = 0; i < elementos; i++) {
            if (arreglo[i] > mediaA) {
                System.out.println("Valores por encima de la media aritmética: ");
                System.out.println(arreglo[i]);
            }
        }
        System.out.println("==================================================");
        for (int i = 0; i < elementos; i++) {
            if (arreglo[i] < mediaA) {
                System.out.println("Valores por debajo de la media aritmética: ");
                System.out.println(arreglo[i]);
            }
        }
    }
}