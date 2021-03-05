import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (;;) {
            System.out.println("Введите 10 десятичное число");

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            String hexstr = Integer.toString(a, 16);
            System.out.println(hexstr);

        }
    }
}
