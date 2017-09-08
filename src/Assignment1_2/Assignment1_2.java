package Assignment1_2;
/*
 * program to print the sum of two numbers without using + operator. Other operators have to be used.
 */
import java.util.Scanner;//importing scanner class
public class Assignment1_2 
{
	public static void main(String[] args) //Start of main method
	{	
		// TODO Auto-generated method stub
		int first_num,second_num,i,num,sum=0,opt=0;
		Scanner sc=new Scanner(System.in);//creating objects of scanner class
		System.out.println("Enter option");//user input for Switch Case
		opt=sc.nextInt();
		System.out.println("Enter first number");//user input for 1st variable
		first_num=sc.nextInt();
		System.out.println("Enter second number");//user input for 2nd variable
		second_num=sc.nextInt();
		sc.close();		 
		if(first_num==0)sum = second_num;
		else if(second_num==0)sum=first_num;
		else
		switch(opt)
		{
		case 1:
		        {
		        	//Using While Loop and Decrement and Increment Operators
		         while(first_num!=0)
		         {
		           second_num++;
		           --first_num;
		         }
		         sum=second_num;
		         break;
		       }
		case 2:
		       {
		    	   //Using For loop
			     for (i = 0; i < second_num; i++)
			        first_num++;
			     sum = first_num;
			     break;
		       }
		case 3:
		       {
		    	 //Using Subtraction Operator   
		   		 first_num = first_num - (-second_num);
		   		 sum = first_num;
		    	   break;
		       }
		case 4:
		       {
		    	 //Using Bitwise Operators
		    	 while (second_num != 0)
		    		      {
		    		            num = first_num & second_num;  
		    		            first_num = first_num ^ second_num; 
		    		            second_num = num<< 1;
		    		      }
		    	 sum= first_num;
		    	 break;
		       }
		 default:{
			 System.out.println("Invalid option: ");
			        break;
		         }
		}
		if(opt!=0)
		System.out.println("Sum of two numbers is : "+sum);
	}	
}
