package Chapter2;

public class GridScanner {

     void main() {

         char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
         char[][] grid = {

                 {'.', '.', '#', '.'},

                 {'a', '#', 'b', '2'},

                 {'.', '.', '.', '.'}

         };

         OUTER_LOOP: for(int i = 0 ; i < grid.length ; i++) {
                        for(int j = 0 ; j < grid[i].length ; j++) {
                            if(grid[i][j] == '#') {
                                continue;
                            }
                            for (char digit : digits) {
                                if (digit == grid[i][j]) {
                                    System.out.println("found digit " + digit + " at row " + i + " column " + j );
                                    break OUTER_LOOP;
                                }
                            }
                        }
         }
     }
}
