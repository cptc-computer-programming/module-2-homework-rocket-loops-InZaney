/* Zane Marcoe
CPW 140
Assignment #2

This program will create a rocket ship using loops 
*/

public class RocketShip {
    public static final int ROCKET_SIZE = 3;
    
    public static void main( String[] args ) {
        printNoseCone();
        printBody();
        printNozzle();
    }

    /**
     Print the nozzle at the bottom of the rocket.
     This reuses the pattern of the nose cone.
     */
    public static void printNozzle() {
        printNoseCone();
    }
    
    /**
     Print the nose cone. There is a pattern of **
     down the middle of the cone with a widening pattern
     of //...\\ on either side.
     */
    public static void printNoseCone() {

        for (int row = 0; row < (ROCKET_SIZE *2) - 1; row ++) {
        // leading spaces
        int spaces = (ROCKET_SIZE * 2 - 1) - row;
        for (int i = 0; i < spaces; i ++) {
            System.out.print(" ");
        }

        // print /
        int sides = row + 1;
        for (int i = 0; i < sides; i ++) {
            System.out.print("/");
        }

        // print *
        System.out.print("**");

        // print \
        for (int i = 0; i < sides; i ++) {
            System.out.print("\\");
        }

        // print trailing spaces
        for (int i = 0; i < spaces; i ++) {
            System.out.print(" ");
        }
        
        System.out.println();
        }
        
    }
    
    /**
      Print body of rocket. This is a two-stage pattern
      with a diamond pattern in the top half and an
      hour glass on the bottom.
     */
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();       
        printEdge();        
    }
    
    /**
     Print the top half of two diamonds between vertical lines.
     */
    public static void printDiamondTop() {
        // loop total rows in top half
        for (int row = 0; row < ROCKET_SIZE; row ++) {

            // start with |
            System.out.print("|");

            // repeat pattern twice
            for (int pattern = 0; pattern < 2; pattern ++) {

                // leading dots
                int dots = (ROCKET_SIZE - 1) - row;
                for (int i = 0; i < dots; i ++) {
                    System.out.print(".");
                }

                // triangles
                int triangles = row + 1;
                for (int i = 0; i < triangles; i ++) {
                    System.out.print("/\\");
                }

                // print trailing dots
                for (int i = 0; i < dots; i ++) {
                    System.out.print(".");
                }
            }

            // end with | and new line
            System.out.println("|");
        }
        
    }
    
    /**
     Print the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        // loop total rows in bottom half
        for (int row = 0; row < ROCKET_SIZE; row ++) {

            // start with |
            System.out.print("|");

            // repeat pattern twice
            for (int pattern = 0; pattern < 2; pattern ++) {

                // leading dots
                int dots = row;
                for (int i = 0; i < dots; i ++) {
                    System.out.print(".");
                }

                // triangles
                int triangles = ROCKET_SIZE - row;
                for (int i = 0; i < triangles; i ++) {
                    System.out.print("\\/");
                }

                // print trailing dots
                for (int i = 0; i < dots; i ++) {
                    System.out.print(".");
                }
            }

            // end with | and new line
            System.out.println("|");
        }
    }

    /**
      Print +=*=*=*...=+ to fit the width of the rocket.
     */
    public static void printEdge() {
        // begin with +
        System.out.print("+");

        // loop =* with SIZE * 2
        for (int i = 0; i < ROCKET_SIZE * 2; i ++) {
            System.out.print("=*");
        }

        // end with + and new line
        System.out.println("+");
    }
}