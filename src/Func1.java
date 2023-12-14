import java.util.Scanner;

public class Func1 {

    public static double multiplica(double a, double b) {
        double result = a * b;
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double mult = multiplica(num1,num2);
        System.out.println(mult);

    }

}
