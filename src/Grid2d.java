import java.util.Random;

public class Grid2d {
  public static void main(String[] args) {
    String[][] grid = new String[10][10];
    Random rand = new Random();
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        grid[i][j] = rand.nextBoolean() ? " ~ " : "   ";
      }
    }
    for(int i = 0; i < 10; i++) {
      System.out.println();
      for(int j = 0; j < 10; j++) {
        System.out.print(grid[i][j]);
      }
    }

  }
}
