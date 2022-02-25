public class Main {

    public static void main(String[] args) {

        for (int cnt = 0; cnt < 31; cnt++) {
            System.out.printf("%3d", cnt);
        }
        System.out.println("\n");
        for (int cnt = 30; cnt > -1; cnt = cnt - 1) {
            System.out.printf(" %3d", cnt);
        }
        System.out.println("\n");
        for (int cnt = 0; cnt < 19; cnt = cnt + 3) {
            System.out.printf("%3d", cnt);
        }
        System.out.println("\n");
        for (int cnt = 10; cnt > -1; cnt = cnt - 2) {
            System.out.printf(" %3d", cnt);
        }
        System.out.println("\n");
      /*   final int ROW = 12; // NOTES OS NESTED FOR LOOPS
        final int COL = 12;

        for(int row = 0; row <= ROW; row++)
        {
            for(int col = 0; col <= COL; col++)
            {
                System.out.printf("%5d", row * col);
            }
            System.out.println("");
        }
        */
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");

        for (int row = 5; row >= 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\n");

        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 18; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 12; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 18; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
