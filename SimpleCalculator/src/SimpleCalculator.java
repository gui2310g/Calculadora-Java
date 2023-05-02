import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean cont = true;

        while (cont) {
            boolean repeat = false;
            int x, y;
            System.out.print("Insert one number: ");
            x = ler.nextInt();
            System.out.print("Insert other number: ");
            y = ler.nextInt();
            System.out.print("Insert one option = [+, -, /(you can select %), *(you can select x)]: ");
            String operator = ler.next();

            while(!repeat) {
                if (operator.equals("+")) {
                    System.out.println(x + y);
                    repeat = true;
                } else if (operator.equals("-")) {
                    System.out.println(x - y);
                    repeat = true;
                } else if (operator.equals("/") || operator.equals("%")) {
                    System.out.println(x / y);
                    repeat = true;
                } else if (operator.equals("*") || operator.equals("x") || operator.equals("X")) {
                    System.out.println((x * y));
                    repeat = true;
                } else {
                    System.out.print("please choose one of these options: ");
                    operator = ler.next();
                }
            }
            System.out.println("Do you want continue? (yes or no)");
            String choose = ler.next();
            if(choose.equals("no")) {
                cont = false;
                System.out.println("Exiting");
            }
        }
    }
}