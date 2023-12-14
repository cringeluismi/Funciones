import java.util.Scanner;

public class Func5 {

    public static double MilesToKm (double miles) {
        double km = miles*1.60934;
        return km;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double userInput = sc.nextDouble();

        System.out.println(MilesToKm(userInput));

    }

}
