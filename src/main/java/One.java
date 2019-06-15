import java.util.Scanner;

/**
 * Created by ASUS on 6/15/2019.
 */
public class One {

    public static void main(String[] args) {
        Two two = new Two();
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Enter num 1 : ");
        Integer input1 = scanner.nextInt();  // Read user input
        System.out.print("Enter num 2 : ");
        Integer input2 = scanner.nextInt();  // Read user input

        two.add(input1,input2);
        two.multiply(input1,input2);
        two.subtract(input1,input2);

    }
}
