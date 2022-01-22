package mathproblems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */

        // Call pyramid method and pass numbers of rows
        MakePyramid.pyramid(6);
    }

    /**
     * This method Implement a large Pyramid of stars in the screen using nested for loop
     * @param rows
     * @return
     */
    public static int pyramid(int rows) {
        int spaces = rows - 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (rows - spaces); j++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
        }
        return rows;
    }
}
