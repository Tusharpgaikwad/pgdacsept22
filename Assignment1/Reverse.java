import java.util.*;
class Reverse{
public static void main (String args []){
Scanner sc = new Scanner (System.in);
int n,reverse =0 ;
System.out.println ("Enter a number ");
n=sc.nextInt();
while (n !=0)
{
int remainder = n%10;
reverse =reverse*10+remainder;
n=n/10;
}
System.out.println ("Reverse number=" +reverse);
}
}