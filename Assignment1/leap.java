import java.util.*;
class leap{
public static void main (String args []){
Scanner sc=new Scanner (System.in);
int year;
System.out.println("enter year you want check");
year=sc.nextInt();
if (year % 400 ==0)
{
System .out.println ("year is leap");
}
else 
{
System .out.println ("year is not leap");
}
}
}