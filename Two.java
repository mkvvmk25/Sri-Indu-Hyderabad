
class Hashing {
  int hashTable[]; // 
  int tableSize;

  public Hashing(int size) {
    tableSize = size;
    hashTable = new int[size];
  }

  int hashCode(int key)
  {
    Integer hc = new Integer(key)
    return key % tableSize ;
    // return hc.hashCode();
  }

  void insert(int key) {
    int hkey = this.hashCode(key);

    for(int i = 0; i < tableSize; i++)
    {
      int ch = (hkey + i*i) % tableSize;
      if( hashTable[ch] == 0)
      {
        hashTable[ch] = key;
        return;
      }
    }
    
  }
  
  boolean search(int key) {
    
    int hkey = this.hashCode(key);
    // int hkey 
  
    for(int i = 0; i < tableSize; i++)
    {
      int ch = (hkey + i*(4*key + 67)) % tableSize;
      if (hashTable[ch] == 0)
      {
        return false; 
      }
      if (hashTable[ch] == key) {

        return true;
      }
      
    }
    
    return false; 
  }
}
// class Hashing {
//   int hashTable[]; // 
//   int tableSize;

//   public Hashing(int size) {
//     tableSize = size;
//     hashTable = new int[size];
//   }

//   int hashCode(int key)
//   {
//     Integer hc = new Integer(key)
//     return key % tableSize;
//     // return hc.hashCode();
//   }

//   void insert(int key) {
//     int hkey = this.hashCode(key);

//     for(int i = 0; i < tableSize; i++)
//     {
//       int ch = (hkey + i) % tableSize;
//       if( hashTable[ch] == 0)
//       {
//         hashTable[ch] = key;
//         return; 
//       }
//     }
    
//   }
  
//   boolean search(int key) {
    
//     int hkey = this.hashCode(key);
  
//     for(int i = 0; i < tableSize; i++)
//     {
//       int ch = (hkey + i) % tableSize;
//       if (hashTable[ch] == 0)
//       {
//         return false; 
//       }
//       if (hashTable[ch] == key) {

//         return true;
//       }
      
//     }
    
//     return false; 
//   }
// }

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
    if (x == rows - 1 && y == cols - 1) {
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

  static void coinsDeno(
      int amount,
      int coinInd,
      int coins[], int cnt[]) // 3 or 6
  {
    // when the amt becomes zero sucess bc inc and return
    if (amount == 0) {
      cnt[0]++;
      return;
    }
    // // when the amt < 0 ie -ve unsuccess return
    // if (amount < 0) {
    // return;
    // }

    // explore the possiblities
    for (int ci = coinInd; ci < coins.length; ci++) {
      if (amount - coins[ci] >= 0)
        coinsDeno(amount - coins[ci], ci, coins, cnt);
    }
    return;
  }

  public static void main(String[] args) {

    // // Hashing

    // int arr[] = { 453, 463, 433, 90, 1000 };
    // int hashTable[] = new int[arr.length];

    // // 453 % 5 = 3 is storedin 3rd ind

    // // search the ele 453 is avail ?
    // // h(key) = apple % 5 = 3 go and chec in 3rd

    // // f(n) = n^2 + n^3
    // Human per = new Human();

    // per.age = 78;

    // System.out.println(per.age);

    // int hc = (12 * key / 34 * 45) % ts;
    // // 3453 ^ 4534 ^ 5345
    // // f(3) =

    // // 463 % 5 = 3 is storedin 3rd ind
    // // probing.....
    // // linear probing

    // // search the ele 456 is avail ?
    // // 453 % 5 = 3 go and chec in 3rd
    // Integer a = new Integer(32);
    // Integer ab = new Integer(32);
    // String d = "123";
    // String da = "12asd";
    // System.out.println(324 % tableSize + " ------");
    // System.out.println(da.hashCode() + " ------");

    // // // System.out.println(arr[4]);
    // // int crr[] = new int[1000001];
    // // crr[arr[4]] = 1;

    // // // crr[1000000] == 1 // ele is availabe

  }

}

// int coins[] = { 2, 5, 7 };
// int deno = 12;
// int cnt[] = { 0 };
// coinsDeno(deno, 0, coins, cnt); // 3 or 6
// System.out.println(cnt[0]);
// // 2 2 2 2 2 2 1poss
// // 5 5 2 2nd
// // 2 5 5
// // 5 2 5
// // 7 5 3rd
// // 5 7

// // int maze[][] = {
// // { 1, 1, 0, 1 },
// // { 1, 0, 0, 1 },
// // { 1, 0, 1, 0 },
// // { 1, 1, 1, 1 },
// // };
// // boolean reached[] = { false };
// boolean re = false;
// // ratTravel(0, 0, maze, reached);
// // System.out.println(reached[0]);

// // // int arr[] = { 1, 2, 3 };
// // // int ans = sumArr(arr, 0);
// // // System.out.println(ans);