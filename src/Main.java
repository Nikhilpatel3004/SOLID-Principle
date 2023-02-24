import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operation op = new Addition();

        double calculate = op.calculate(56, 867);


        System.out.println(calculate);
    }
}