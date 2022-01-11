package practice;

import java.util.Scanner;
public  class Atm_Transaction 
{
   public static void main(String[] args) 
   {
	   
	   Scanner sc1=new Scanner(System.in);
	   System.out.println("please deposit money");
	   int balance=sc1.nextInt();
	int withdraw,deposit;
	  Scanner sc=new Scanner(System.in);
	  while(true)
	  {
		  System.out.println("choose 1 to withdraw money");
		  System.out.println("choose 2 to deposit money");
		  System.out.println("choose 3 to check balance");
		  System.out.println("choose 4 to exit");
          
		  int x=sc.nextInt();
		  switch(x)
		  {
		  case 1:
			  System.out.println("please enter money to withdraw");
			  withdraw=sc.nextInt();
			  if(balance>=withdraw)
			  {
				  balance=balance-withdraw;
				  System.out.println("please take your money");
				  System.out.println("current balance: "+balance);
			  }
			   else
			     {
				System.out.println("insufficient Balance :(  , please check it once");
			      }
			  break;
		  case 2:
			  System.out.println("please enter money to deposit");
			  deposit=sc.nextInt();
			  balance=deposit+balance;
			  System.out.println("Money deposited sucessfully");
			 
			  break;
		  case 3:
			  System.out.println("your current balance:"+balance);
			  break;
		  case 4:
		  {
			  System.out.println("THANKYOU VISIT AGAIN :)");
		  }
			  System.exit(0);
			  
	  }
   }
}
}
