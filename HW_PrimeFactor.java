package primefactor;

import java.util.Scanner; // Thitipong Ngansathin SE 5630213018

/**
 *
 * @author Kyo
 */
public class PrimeFactor {

    public static void main(String[] args) {

        int inputnumber;
        Scanner in = new Scanner(System.in);

        System.out.println("You want Exit ,Please Enter 0 \n");
        do {
            System.out.print("Enter number : ");
            inputnumber = in.nextInt();

            System.out.print("Prime result : ");
            for (int i = 2; i <= inputnumber; i++) {
                while (inputnumber % i == 0) {
                    primenumber = i;
                    inputnumber = inputnumber / primenumber;
                    System.out.print(primenumber);
                    if (inputnumber >= primenumber) {
                        System.out.print(" x ");
                    }
                }
            }
            System.out.print("\n\n");
        } while (inputnumber != 0);

    }

}
