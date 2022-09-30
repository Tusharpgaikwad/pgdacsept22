import java.util.*;  
class Gcd
{  
    public static void main(String a[])   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        
        int x = sc.nextInt();  
        int y = sc.nextInt();
		while (x!=2)
		{
		if (x>y)
		x=x-y;
		else 
		y=y-x;
		}
		System.out.printf("GCD of x and y is: " +y);
}
}		