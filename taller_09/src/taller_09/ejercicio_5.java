package taller_09;
public class ejercicio_5 {
    public static void main(String[] args) {
        int limEstu = 28;
        double notasEst[] = new double[limEstu];
        double sumaNotas = 0, promedio, notaMayor, notaMenor;
        for (int i = 0; i < notasEst.length; i++) {
            notasEst[i] = (double) (Math.random() * (9 - 0 + 1) + 0);
        }
        System.out.println("CURSO C:");
        System.out.println("=======================================");
        for (int i = 0; i < notasEst.length; i++) {
            System.out.printf("%s %d: %.2f \n", "Nota del Estudiante", (i + 1), notasEst[i]);
        }
        for (int i = 0; i < notasEst.length; i++) {
            sumaNotas += notasEst[i];
        }
        notaMayor = notasEst[0];
        notaMenor = notasEst[0];
        for (int i = 1; i < notasEst.length; i++) {
            if (notasEst[i] > notaMayor) {
                notaMayor = notasEst[i];
            }
            if (notasEst[i] < notaMenor) {
                notaMenor = notasEst[i];
            }
        }
        
        System.out.printf("Mejor nota: %.2f \n", notaMayor);
        System.out.printf("Nota Menor: %.2f \n", notaMenor);
        promedio = sumaNotas / notasEst.length;
        System.out.printf("Promedio del curso: %.2f \n", promedio);
        for (int i = 1; i < notasEst.length; i ++) {
            if (notasEst[i] > promedio) {
                System.out.printf("NOTAS POR ENCIMA DEL PROMEDIO: Estudiante %d: %.2f \n", (i + 1), notasEst[i]);
            }
        }
        System.out.println("===============================================================");
        for (int i = 0; i < notasEst.length; i++) {
             if (notasEst[i]<promedio){
                System.out.printf("NOTAS POR DEBAJO DEL PROMEDIO: Estudiante %d: %.2f \n" , (i + 1) , notasEst[i]);
             }
        }
    }
}