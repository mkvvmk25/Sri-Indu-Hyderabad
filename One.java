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
    if( num == 0)
    {
      return 0;
    }
    int e = sn(num - 1);
    int d = e + num;
    return d; 
  }
  
  public static void main(String[] args) {
    int s = sn(3);
    System.out.println(s);
    
  }
}
