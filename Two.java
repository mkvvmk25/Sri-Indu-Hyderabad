public class Two {
  static int sumArr(int arr[], int index) {
    if (index == arr.length - 1) {
      return arr[index];
    }
    int n = sumArr(arr, index + 1);
    n = n + arr[index];
    return n;
  }

  static void ratTravel(int x, int y, int maze[][], boolean reached[]) {
    int rows = maze.length;
    int cols = maze[0].length;
    if (x == rows - 1 && y == cols - 1)
    {
      reached[0] = true;
      return;
    }

    // explore two options
    if (x < rows
        && y + 1 < cols
        && maze[x][y + 1] != 0) {
      ratTravel(x, y + 1, maze, reached);
    }
    if (x + 1 < rows
        && y < cols
        && maze[x + 1][y] != 0) {
      ratTravel(x + 1, y, maze, reached);
    }

    return;

  }

  public static void main(String[] args) {
    int maze[][] = {
        { 1, 1, 0, 1 },
        { 1, 0, 0, 1 },
        { 1, 0, 1, 0 },
        { 1, 1, 1, 1 },
    };
    boolean reached[] = { false };
    ratTravel(0, 0, maze, reached);
    System.out.println(reached[0]);

    // int arr[] = { 1, 2, 3 };
    // int ans = sumArr(arr, 0);
    // System.out.println(ans);
  }
}
