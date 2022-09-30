import java.util.*;
class Factro{
public static void main (String args[]){
System.out.println ("enter number u want factorial");
Scanner sc= new Scanner (System.in);
int i,fact=1,n;
n = sc.nextInt();
for (i=1;i<=n;i++)
{
	fact = fact*i;
}
System.out.println("factorial of "+n+"is:"+fact);
}
}	

