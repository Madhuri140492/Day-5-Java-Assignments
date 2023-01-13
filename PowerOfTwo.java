//Write Java Program for Power OF 2.

/*import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter powers of 2 : ");
        int x = sc.nextInt();
        int n = 2;
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = n * result;
        }
        System.out.println("Power = " + result);
    }
}*/

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        int base = 0,
                power = 0,
                result = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base value: ");
        base = sc.nextInt();

        System.out.println("Enter power value: ");
        power = sc.nextInt();

        for(int i = 1; i <= power; i++) {
            result = result * base;
        }

        System.out.println( "Value  is: " + result);
    }
}
