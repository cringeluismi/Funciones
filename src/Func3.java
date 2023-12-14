import java.util.Scanner;

public class Func3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userInput1 = sc.nextInt();
        int userInput2 = sc.nextInt();

        int min = minimo(userInput1,userInput2);
        System.out.println("El menor es " + min);
    }

    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

}
