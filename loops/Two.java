import java.util.Arrays;

public class Two {
    static String rev1(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        return ans;
    }

    static String rev2(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            ans = s.charAt(i) + ans;
        }
        return ans;
    }

    static String rev3(String s) {
        char ca[] = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            char c = ca[i];
            ca[i] = ca[j];
            ca[j] = c;
        }
        return new String(ca);
    }

    static String senRev1(String s) {
        String a = "";
        String fa = "";
        for (int i = s.length() - 1; i >= -1; i--) {
            if (i == -1) {
                fa = fa + " " + a;
                a = "";

            } else if (s.charAt(i) != ' ') {
                a = s.charAt(i) + a;
            } else {
                // tranfer
                fa = fa + " " + a;
                a = "";

            }
        }
        return fa.trim();
    }

    static String senRev(String s) {
        String arr[] = s.split(" ");

        // abc cbd qwe;
        // 0 1 2 3 4 5
        String ans = "";
        for (String i : arr) {
            ans = i + " " + ans;
            // abc " " "" = "abc "
            // cbd " " abc = 'cbd abc "
        }

        return ans.trim();

    }

    static String removeSpace(String s)
    {
        String fa = ""; 
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if( c != ' ')
            {
                fa = fa + s.charAt(i);
            }
            else if( c == ' ' && s.charAt(i - 1) != ' '  )
            {
                fa = fa + c;
            }
        }
        return fa;
    }
    static String removeSpace1(String s)
    {
        String fa = "";
        String arr[] = s.split(" ");
        System.out.println(Arrays.toString(arr));
        return fa;
    }

    

    static int totalBox(String s)
    {
        int fa = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) == true) {
                // extract 
                int j = i;
                String num = "";
                while (j < s.length() && s.charAt(j) != ' ') {
                    num = num + s.charAt(j); // 9012
                    j++;
                }
                int intNum = Integer.parseInt(num);
                fa = fa + intNum;
                i = j;

            }
        }
        return fa;
    }

    static int last(String s)
    {
        s = s.trim();
        int cnt = 0;
        for(int i = s.length() - 1; s.charAt(i) != ' '; i--)
        {
            cnt++;
        }
        return cnt; 
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "aqqweqwebbqweqwecwqedsfsa";
      
        String s = "axc";
        String t = "aqqweqwebbqweqwecwqedsfsa";
        

    }
}
