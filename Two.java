public class Two {
  static int sumArr(int arr[],int index)
  {
    if (index == arr.length - 1)
    {
      return arr[index];
    }
    int n = sumArr(arr, index + 1);
    n = n + arr[index];
    return n;
  }
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3 };
    int ans = sumArr(arr, 0);
    System.out.println(ans);
  }
}
