public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " : " + Boolean.toString(isPalindrome(s)));
        }
    }

    /*���������� ������ � �������� �������*/
    public static String reverseString(String s) {
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }

    /*��������� �������� �� s �����������*/
    public static boolean isPalindrome(String s) {
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            res += s.charAt(i);
        }
        if (res.equals(reverseString(res))) {
            return true;
        } else {
            return false;
        }
    }
}
