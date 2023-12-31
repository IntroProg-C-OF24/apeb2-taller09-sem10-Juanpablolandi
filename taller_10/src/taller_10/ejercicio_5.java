package taller_10;
public class ejercicio_5 {
    public static void main(String[] args) {
        int limMatriz = 3;
        int primeraMat[][] = new int[limMatriz][limMatriz];
        int segundaMat[][] = new int[limMatriz][limMatriz];
        int solucion[][] = new int[limMatriz][limMatriz];
        for (int i = 0; i < limMatriz; i++) {
            for (int j = 0; j < limMatriz; j++) {
                primeraMat[i][j] = (int) (Math.random() * (-9 - 9 + 1) + 9);
            }
        }
        System.out.println("Primera Matriz: ");
        for (int i = 0; i < primeraMat.length; i++) {
            for (int j = 0; j < limMatriz; j++) {
                System.out.print(primeraMat[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < limMatriz; i++) {
            for (int j = 0; j < limMatriz; j++) {
                segundaMat[i][j] = (int) (Math.random() * (-9 - 9 + 1) + 9);
            }
        }
        System.out.println("Segunda Matriz: ");
        for (int i = 0; i < segundaMat.length; i++) {
            for (int j = 0; j < limMatriz; j++) {
                System.out.print(segundaMat[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < limMatriz; i++) {
            for (int j = 0; j < limMatriz; j++) {
                for (int k = 0; k < limMatriz; k++) {
                    solucion[i][j] = solucion[i][j] + primeraMat[i][k] * segundaMat[k][j];
                }
            }
        }
        System.out.println("Resultado: ");
        for (int i = 0; i < limMatriz; i++) {
            for (int j = 0; j < limMatriz; j++) {
                System.out.print(solucion[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
/*POR FM Y JP MI PROFEEEEEEEEEEEE
Primera Matriz: 
5	0	-3	
-5	6	8	
2	7	5	
Segunda Matriz: 
3	-5	1	
6	-6	3	
-1	-1	3	
Resultado: 
18	-22	-4	
13	-19	37	
43	-57	38	
*/