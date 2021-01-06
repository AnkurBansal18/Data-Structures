import java.util.*;
import java.lang.*;
class reverseString{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t-- >0){
Solution ob = new Solution;
System.out.println(ob.reverse(sc.next()));
}
}
}

class Solution
{
    
    public String reverse(String S)
    {
       Stack<Character> st = new Stack<Character>();
       for(int i=0; i<S.length(); i++)
       {
           st.push(S.charAt(i));
       }
       String v="";
      while(!st.isEmpty())
      {
           v = v+st.pop(); 
      }
         return v;
    }
}
