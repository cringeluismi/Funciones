import java.util.Scanner;

public class Func2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una edad: ");
        int userInput = sc.nextInt();

        boolean bool = esMayorEdad(userInput);
        System.out.println(bool);

    }

    public static boolean esMayorEdad (int edad) {
        boolean mayor;
        if (edad >= 18){
            mayor = true;
        } else {
            mayor = false;
        }
        return mayor;
    }

}
