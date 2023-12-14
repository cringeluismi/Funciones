import java.util.Scanner;

public class Func6 {

    public static double añadirIVA (double precio) {

        double precioConIVA = precio * 1.21;
        return precioConIVA;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vecPrecios = new double[5];

        for (int i = 0; i < vecPrecios.length; i++) {
            vecPrecios[i] = sc.nextDouble();
        }

        for (int i = 0; i < vecPrecios.length; i++) {
            System.out.println(añadirIVA(vecPrecios[i]));
        }





    }

}
