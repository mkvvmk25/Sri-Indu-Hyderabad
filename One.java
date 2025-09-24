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
  static int snForword(int num, int sm)
  {
    if( num == 0)
    {
      return sm;
    }
    int m = num + sm; 
    int e = snForword(num - 1,  m );
    return e; 
  }
  
  public static void main(String[] args) {
    int s = snForword(5, 0 );
    System.out.println(s);
    
  }
}
