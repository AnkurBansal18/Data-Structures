import java.util.*;
class BalancedParantheses{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
Stack<Character> st = new Stack<Character>();
for(int i=0; i<s.length(); i++){
if((s.charAt(i)=='(') || (s.charAt(i)=='{') || (s.charAt(i)=='[')){
st.push(s.charAt(i));}
else if((s.charAt(i)==')'))
{
if((st.size()==0) || (st.peek()!='('))
    {
    System.out.println("not balanced");
    return;
    }
else
  {
   st.pop();
  }
}
else if((s.charAt(i)=='}'))
{
if((st.size()==0) || (st.peek()!='{'))
 {
  System.out.println("not balanced");
  return;
 }
else
 {
  st.pop();
 }
}
else if((s.charAt(i)==']'))
{
if((st.size()==0) || (st.peek()!='['))
{
System.out.println("not balanced");
return;
}
else{
  st.pop();
  }
}
else
  {
    // do nothing
  }
}
if(st.size()==0)
  {
      System.out.println("balanced");
  }
else
  {
   System.out.println(" not balanced");
  }
 }
}
