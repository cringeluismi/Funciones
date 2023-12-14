import java.util.Scanner;

public class Func4 {

    public static int dimeSigno (int num) {

        int r;

        if (num == 0) {
            r = 0;
        } else if (num < 0) {
            r = -1;
        } else {
            r = 1;
        }

        return r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        switch (dimeSigno(userInput)) {
            case -1:
                System.out.println("El número es negativo");
                break;
            case 0:
                System.out.println("El número es 0");
                break;
            case 1:
                System.out.println("El número es positivo");
                break;
        }

    }

}
