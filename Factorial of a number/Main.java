import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here 
      Scanner in=new Scanner(System.in);
  int i,fact=1;  
  int number=in.nextInt();    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact); 
	}
}