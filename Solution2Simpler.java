class Solution {
    public boolean isPalindrome(String s) {
          String ss = "";
          String b = "";
          for(int i = 0; i<s.length();i++){
              if(Character.isLetterOrDigit(s.charAt(i))){
                  ss+=Character.toLowerCase(s.charAt(i));
                  b= Character.toLowerCase(s.charAt(i))+b;
              }
          } 
        return ss.equals(b)? true: false;

    }
}
