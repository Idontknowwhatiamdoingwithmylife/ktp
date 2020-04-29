public class Palindrome {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      String s = args[i];
      System.out.println(Pali(s));
    } 
  }

  public static boolean Pali(String s){
    return s.equals(reverseString(s));
  }

  public static String reverseString(String s){
    String res = "";

    for(int i = s.length() - 1; i >= 0; i --){
      res += s.charAt(i);
    }
    return res;
  }
 }