import java.lang.reflect.Array;
import java.util.Arrays;

public class One {
  // static int cnt = 0;

  static void hello(int cnt) {
    if (cnt >= 5) {
      return;
    }
    hello(cnt + 2);
    System.out.println("a " + " " + ++cnt);
    hello(cnt + 1);
    System.out.println("b " + " " + --cnt);
  }

  static int sn(int num) {
    if (num == 0) {
      return 0;
    }
    int e = sn(num - 1);
    int d = e + num;
    return d;
  }

  static int helperForword(int num) {
    return snForword(num, 0);
  }

  static int snForword(int num, int sm) {
    if (num == 0) {
      return sm;
    }
    int m = num + sm;
    int e = snForword(num - 1, m);
    return e;
  }

  static String revBack(String s, int ind) {
    // if( s.length() == ind)
    // {
    // return "";
    // }
    if (s.length() - 1 == ind) {
      return s.charAt(ind) + "";
    }

    String f = revBack(s, ind + 1);
    String ans = f + s.charAt(ind);
    return ans;
  }

  static String revFront(String s, int ind, int ans) {
    return "";
  }

  static void swap(char arr[], int a, int b) {
    char c = arr[a];
    arr[a] = arr[b];
    arr[b] = c;
  }

  static void permutate(char arr[], int work, int len) {

    if (work == len)
    {
      System.out.println(new String(arr));
      return; 
    }

    for (int i = work; i < len; i++) 
    {
      swap(arr, work, i);
      permutate(arr, work + 1, len);
      swap(arr, work, i);
    }

    return; 
  }

  public static void main(String[] args) {
    String s = "abcdef";
    char arr[] = s.toCharArray();
    permutate(arr, 0, arr.length);
    /*
     * abc
     * acb
     * bac
     * bca
     * cab
     * cba
     * 
     * 
     */

    // // int d = helperForword(5);
    // String s = "abcdef";
    // String c = revBack(s, 0);
    // System.out.println(c); // "fedcba"

  }

}
