package taller_09;
public class ejercicio_3 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        promediosCualitativos [0] = "Promedio Regular";
        promediosCualitativos [1] = "Promedio Bueno";
        promediosCualitativos [2] = "Promedio Sobresaliente";
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i]<5.9){
                System.out.println(estudiantes[i] + " :"  + promedios[i] + " " + promediosCualitativos[0]);
            }
            if (promedios[i]>=6 && promedios[i]<= 8.9){
                System.out.println(estudiantes[i] + " :"  + promedios[i] + " " + promediosCualitativos[1]);
            }
            if (promedios[i]>=9 && promedios[i] <= 10){
                System.out.println(estudiantes[i] + " :"  + promedios[i] + " " + promediosCualitativos[2]);
            }
        }
    }
}