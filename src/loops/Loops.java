package loops;

public class Loops {

    public void testWhileLoop() {
        int x = 3;
        while (x > -3) {
            System.err.println("Value of x: " + x);
            x--;
        }
    }

    public static void testForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i:" + i);
        }
    }

    public static void testDoubleForLoop() {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.err.println("i= " + i + ", j = " + j);

            }
        }
    }

    public static void printMultiplicationTable() {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                int x = i * j;
                System.err.println(i + " * " + j + " = " + i * j);
            }
        }
    }

    public static void printCoordinates() {
        for (int i = 0; i < 10; i++) {
            System.out.println("\n" + i + "\n");
            for (int j = 0; j < 5; j++) {
                
                for (int k = 0; k < 10; k++) {
                    System.out.print("(" + i + "," + j + ", " + k + ")");
                }
                System.out.println();
                //(0,0) (0,1) (0,2) ..... (0,9)
            }
        }
    }
}
