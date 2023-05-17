class Solution {
    public boolean isPalindrome(String s) {
          String ss = "";
          for(int i = 0; i<s.length();i++){
              if(Character.isLetterOrDigit(s.charAt(i))){
                  if(Character.isUpperCase(s.charAt(i))){
                    
                  ss+=Character.toLowerCase(s.charAt(i));
                  }else{
                  ss+=s.charAt(i);
                  }
              }
          }
          String b = "";
        
        for(int x=ss.length()-1 ; x>=0 ; x--){
            b+=ss.charAt(x);
        } 

        return ss.equals(b)? true: false;

    }
}
