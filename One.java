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

  static int sn(int num)
  {
    if (num == 0) {
      return 0;
    }
    int e = sn(num - 1);
    int d = e + num;
    return d;
  }

  static int helperForword(int num)
  {
    return snForword(num, 0);
  }

  static int snForword(int num, int sm)
  {
    if (num == 0) {
      return sm;
    }
    int m = num + sm;
    int e = snForword(num - 1, m);
    return e;
  }
  
  static String rev(String s)
  {
    return "";
  }
  
  public static void main(String[] args) {
    // int d = helperForword(5);
    String s = "abcdef";
    String c = rev(s);
    System.out.println(c); // "fedcba"
    
  }
}
