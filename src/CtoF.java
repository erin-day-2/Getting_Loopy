import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double numF;
        double numC;
        String trash = "";

        boolean goodNumber = false;

        do {

            System.out.print("Please enter your Celsius: ");

            if (in.hasNextDouble()) {
                numC = in.nextDouble();
                in.nextLine();

                if (numC >= 1) {
                    numF = (numC * 9 / 5) + 32;
                    System.out.println("The Fahrenheit is: " + numF);
                    goodNumber = true;
                } else {
                    System.out.println("Illegal input: " + numC);
                    System.out.println("Please try again with a valid number!");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " please enter a valid number!");
            }


        } while (!goodNumber);
    }
}
