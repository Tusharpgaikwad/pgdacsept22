class PQ9 {

public static void main(String args[]){

      char ch='A';
   for(int i=1;i<=5;i++)
	  
   {  
      for(int j=5;j>=i;j--)
	  {
		System.out.print(" ");
	  }  
	   ch='A';
     for(int j=1;j<=i;j++)
	 {	 
	 System.out.print(ch+" ");
	    ch++;
     }
	
	 System.out.println();
    
   }
   
}
}