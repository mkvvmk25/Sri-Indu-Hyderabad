import java.util.Arrays;
import java.util.Scanner;

public class One {
    
    static void twoThree(int n) {
        int cnt = 0;
        int i = 1;
        while (i <= n) {
            cnt++;
            if (cnt == n)
                System.out.print(2 * i + " "); // 1 3 5 7 9
            else
                break;

            cnt++;
            if (cnt == n)
                System.out.print(3 * i + " "); // 2 4 6 8 10
            else
                break;

            i++;
        }

    }

    static int cntDigitsNum(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n / 10;
            cnt++;
        }
        return cnt;
    }

    static boolean uniqueDigits(int n) {
        int copy = n;
        boolean unique = true;
        while (n != 0 && unique == true) {
            int r = n % 10;

            int c = copy;
            int cntDigit = 0;
            while (c != 0) {
                int r1 = c % 10;
                if (r1 == r)
                    cntDigit++;
                c = c / 10;
            }
            if (cntDigit > 1)
                unique = false;

            n = n / 10;

        }

        return unique;
    }

    static void series1(int n) {
        for (int i = 1; i <= n; i++) {
            // print i for i times
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(i * i + " ");

        }
    }

    static void pyramidNumber(int n) {
        for (int line = 1; line <= n; line++) {
            // space
            int nSpace = n - line;
            for (int space = 1; space <= nSpace; space++) {
                System.out.print(" ");
            }
            // 1 half
            for (int num = 1; num <= line - 1; num++) {
                System.out.print(num);
            }
            // 2nd half
            for (int num = line; num >= 1; num--) {
                System.out.print(num);
            }

            System.out.println();
        }
    }

    static void diamondPat(int n) {
        int fstHalf = n / 2 + 1;
        int snHalf = n - fstHalf;

        for (int line = 1; line <= fstHalf; line++) {
            // space
            for (int space = 1; space <= fstHalf - line; space++) {
                System.out.print(" ");
            }
            // 1st half
            for (int num = line; num >= 2; num--) {
                System.out.print(num);
            }
            // 2nd half
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
        for (int line = 1; line <= snHalf; line++) {
            // space
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }
            // 1st half
            for (int num = snHalf - (line - 1); num >= 2; num--) {
                System.out.print(num);
            }
            // 2nd half
            for (int num = 1; num <= snHalf - (line - 1); num++) {
                System.out.print(num);
            }
            System.out.println();
        }

    }

    static int[] pattern1(int arr[][]) {

        int rows = arr.length,
                cols = arr[0].length;

        int ans[] = new int[rows * cols];
        int ind = 0;

        for (int row = 0; row < arr.length; row++) {
            int left = 0, right = cols - 1;
            if (row % 2 == 0) {
                for (; left <= right; left++) {
                    ans[ind] = arr[row][left];
                    ind++;
                }
            } else {
                for (; right >= left; right--) {
                    ans[ind] = arr[row][right];
                    ind++;
                }

            }
        }
        return ans;
    }

    static int[][] rotate90(int arr[][]) {
        int rows = arr.length,
                cols = arr[0].length;

        int ans[][] = new int[cols][rows];
        for (int col = 0; col < cols; col++) {
            int bottom = rows - 1;
            int top = 0;
            int c = 0;
            for (; bottom >= top; bottom--) {
                ans[col][c] = arr[bottom][col];
                c++;
                if (c == rows) {
                    c = 0;
                }
            }
        }

        return ans;
    }

    static boolean magicSquare(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        int ld = 0, rd = 0;
        for (int i = 0; i < cols; i++) {
            ld = ld + arr[i][i];
            rd = rd + arr[i][rows - (i + 1)];
        }
        if (ld != rd) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < rows; j++) {
                // 0,0 ,01, 02
                rowSum = rowSum + arr[i][j];
                colSum = colSum + arr[j][i];
            }
            if (rowSum != ld || colSum != ld) {
                return false;
            }
        }

        return true;
    }

    static int[] boundary(int arr[][])
    {
        int rows = arr.length;
        int cols = arr[0].length;
        int rt = 0, rb = rows - 1, cl = 0, cr = cols - 1;
        int ans[] = new int[2 * cols + 2 * (rows - 2)];
        int ind = 0;
        repeat this for how many times 
        {

            // first row is done 
            for(int i = cl; i <= cr; i++ )
            {
                ans[ind++] = arr[rt][i];
            }
            rt++;
            
            // last col is done  
            for(int i = rt; i <= rb; i++)
            {
                ans[ind++] = arr[i][cr];
            }
            cr--;
            
            // last row is done 
            for(int i = cr ; i >= cl; i--)
            {
                ans[ind++] = arr[rb][i];
            }
            rb--;
    
            // first col is done  
            for(int i = rb; i >= rt; i--)
            {
                ans[ind++] = arr[i][cl];
            }
            cl++;
        }

        return ans; 
    }

    public static void main(String[] args) {
        //
        String a = "pop";
        String t = new String("pop");
        
        System.out.println(a + t);

        // if("pop" == "pop")
        // {
        //     // hi
        // }
        // helo
        


        


    }
}