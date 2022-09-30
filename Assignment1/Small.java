import java.util.*;
class Small{
public static void main (String args []){

int a,b,c;
Scanner sc = new Scanner (System.in);
Scanner sc1 = new Scanner (System.in);
Scanner sc2= new Scanner (System.in);

System.out.println ("Enter number a");
a = sc.nextInt();
System.out.println ("Enter number b");
b = sc1.nextInt();
System.out.println ("Enter number c");
c = sc2.nextInt();

if (a<=b && a<=c)
System.out.println ("a is smaller" +a);
else if (b<=c)
System.out.println ("b is smaller"+b);
else
System.out.println ("c is smaller"+c);
}
}
