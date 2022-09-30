import java.util.*;
class Facters{
public static void main (String args []){
Scanner sc = new Scanner (System.in);
int i,ga;
System.out.println ("Enter a number you want facters");
ga =sc.nextInt();
for ( i=1; i<=ga; i++)
{
if ( ga%i == 0)
{
System.out.println("facters of number ");
System.out.println(i +" ");
}
}
}
}