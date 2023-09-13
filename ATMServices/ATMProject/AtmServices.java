import java.util.Scanner;
class  AtmServices
{
	public static void main(String[] args)                // Srinivas account number=111111(6 one's),pin=1111,account balance=10000;
	{                                                    // nagesh account number=222222(6 two's),pin=2222,account balance=7000; 
		Scanner scan=new Scanner (System.in);            //kasinadh account number=333333(6 three's),pin=3333,account balance=8000;
		int accountnumbernagesh=222222;
		int pinnagesh=2222;
		double amountnagesh=7000;
		int accountnumber=111111;
		int pin=1111;
		double amount=10000;
		int accountnumberkasinadh=333333;
		int pinkasinadh=3333;
		double amountkasinadh=8000;
		int c;
		System.out.println("****************************");
		
		System.out.println("                              WELCOME TO ABC BANK ATM");
		System.out.println("****************************");
		
		System.out.println("                     Enter a number between 1 to 25");
		int number1to25=scan.nextInt();
		if (number1to25<=25&&number1to25>=1)
		{
		
		System.out.println();
		System.out.println("                     Enter 1 for cardless transcation");
		System.out.println("                     Enter 2 for card transcation");
		System.out.println("--------------------------------------------------------------------------------");
	
		int a=scan.nextInt();
		switch (a)
		{
		
		case 1: 
			{
			System.out.println("                     Enter your Account Number");
			int accountnumber1=scan.nextInt();
			
			if (accountnumber1==accountnumber)
			{
			System.out.println();
			System.out.println("                    WELCOME Mr.SRINIVAS");
			System.out.println("=================================================================================");
			System.out.println("                     Enter 1 for cash deposite");
			System.out.println("                     Enter 2 for cash Withdrawal");
			System.out.println("                     Enter 3 for balance enquiry");
			System.out.println("                     Enter 4 for mini statement");
			System.out.println("                     Enter your choice");
			int b=scan.nextInt();
			switch (b)
			{
			case 1:
				{
				System.out.println("---------------------------------------------------------------------------------");
				
				System.out.println();
				System.out.println("Drop your money in the Diposite slot");


				System.out.println("Drop the money in the multiples of 100,200,500,2000(Enter amount)");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println();
				int deposite1=scan.nextInt();
				if (deposite1%100==0)
				{
					System.out.println("                     Your Amount is Rs."+deposite1);
					System.out.println("                     Enter 1 to conform");
					int yes=scan.nextInt();
					if (yes==1)
					{
						System.out.println();
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println("                     Your amount Rs."+deposite1+" is added to your account");
						System.out.println("                     Your Account Balance is Rs."+(deposite1+amount));
						System.out.println();
						
					}
					else 
					{
					System.out.println("                     Enter valid input");
					}
				}
				}
				break;
			case 2:
				{
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("Enter Amount in the multiples of 100,200,500,2000");
				System.out.println("                     Enter Amount : ");
				int deposite2=scan.nextInt();
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("                     You have Enter Amount Rs."+deposite2);
				System.out.println("                     Enter 1 to conform");
				System.out.println("                     Enter 2 to cancel");
				int conform1=scan.nextInt();
				
				if (deposite2<=amount&&deposite2%100==0)
				{
				
				if (conform1==1)
				{
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("                     Please collect Your cash Rs."+deposite2);
					System.out.println("                     Your account balance is Rs."+(amount-deposite2));
					System.out.println();
				}
				
				}
				else 
					{
					System.out.println();
					System.out.println("Your account has insufficent balance or You have not entered valid amount");
					System.out.println();
					}
				}
				break;
			case 3:
				{
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("                     Your Account Balance is Rs."+amount);
				System.out.println();
				}
				break;
			case 4:
				{
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("                     Your Account balance is Rs."+amount );
				System.out.println("                     Your Transcation details: ");
				System.out.println();
				System.out.println();
				}
				break;
				default : System.out.println("                     Enter valid Input..!!!!!!!!!!!!");
			
			}
			}
			else if (accountnumber1==accountnumbernagesh)
			{System.out.println();
			System.out.println("                    WELCOME Mr.Nagesh");
			System.out.println("=================================================================================");
			System.out.println("                     Enter 1 for cash deposite");
			System.out.println("                     Enter 2 for cash Withdrawal");
			System.out.println("                     Enter 3 for balance enquiry");
			System.out.println("                     Enter 4 for mini statement");
			System.out.println("                     Enter your choice");
			int q=scan.nextInt();
			switch (q)
			{
			case 1:
				{
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("Drop your money in the Diposite slot");


				
				System.out.println("Drop the money in the multiples of 100,200,500,2000(Enter amount)");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println();
				int deposite13=scan.nextInt();
				if (deposite13%100==0)
				{
					System.out.println("                     Your Amount is Rs."+deposite13);
					System.out.println("                     Enter 1 to conform");
					int yes=scan.nextInt();
					if (yes==1)
					{
						System.out.println();
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println("                     Your amount Rs."+deposite13+" is added to your account");
						System.out.println("                     Your Account Balance is Rs."+(deposite13+amountnagesh));
						System.out.println();
						
					}
					else 
					{
					System.out.println("                     Enter valid input");
					}
				}
				}
				break;
			case 2:
				{
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("Enter Amount in the multiples of 100,200,500,2000");
				System.out.println("                     Enter Amount : ");
				int deposite23=scan.nextInt();
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("                     You have Enter Amount Rs."+deposite23);
				System.out.println("                     Enter 1 to conform");
				System.out.println("                     Enter 2 to cancel");
				int conform1=scan.nextInt();
				
				if (deposite23<=amountnagesh&&deposite23%100==0)
				{
				
				if (conform1==1)
				{
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("                     Please collect Your cash Rs."+deposite23);
					System.out.println("                     Your account balance is Rs."+(amountnagesh-deposite23));
					System.out.println();
				}
				
				}
				else 
					{
					System.out.println();
					System.out.println("Your account has insufficent balance or You have not entered valid amount");
					System.out.println();
					}
				}
				break;
			case 3:
				{
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("                     Your Account Balance is Rs."+amountnagesh);
				System.out.println();
				}
				break;
			case 4:
				{
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("                     Your Account balance is Rs."+amountnagesh );
				System.out.println("                     Your Transcation details: ");
				System.out.println();
				System.out.println();
				}
				break;
				default : System.out.println("                     Enter valid Input..!!!!!!!!!!!!");
			
			}
			

			}
			else if (accountnumber1==accountnumberkasinadh)
			{System.out.println();
			System.out.println("                    WELCOME Mr.Kasinadh");
			System.out.println("=================================================================================");
			System.out.println("                     Enter 1 for cash deposite");
			System.out.println("                     Enter 2 for cash Withdrawal");
			System.out.println("                     Enter 3 for balance enquiry");
			System.out.println("                     Enter 4 for mini statement");
			System.out.println("                     Enter your choice");
			int p=scan.nextInt();
			switch (p)
			{
			case 1:
				{
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("Drop your money in the Diposite slot");


				System.out.println("Drop the money in the multiples of 100,200,500,2000(Enter amount)");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println();
				int deposite12=scan.nextInt();
				if (deposite12%100==0)
				{
					System.out.println("                     Your Amount is Rs."+deposite12);
					System.out.println("                     Enter 1 to conform");
					int yes=scan.nextInt();
					if (yes==1)
					{
						System.out.println();
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println("                     Your amount Rs."+deposite12+" is added to your account");
						System.out.println("                     Your Account Balance is Rs."+(deposite12+amountkasinadh));
						System.out.println();
						
					}
					else 
					{
					System.out.println("                     Enter valid input");
					}
				}
				}
				break;
			case 2:
				{
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("Enter Amount in the multiples of 100,200,500,2000");
				System.out.println("                     Enter Amount : ");
				int deposite22=scan.nextInt();
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("                     You have Enter Amount Rs."+deposite22);
				System.out.println("                     Enter 1 to conform");
				System.out.println("                     Enter 2 to cancel");
				int conform1=scan.nextInt();
				
				if (deposite22<=amountkasinadh&&deposite22%100==0)
				{
				
				if (conform1==1)
				{
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("                     Please collect Your cash Rs."+deposite22);
					System.out.println("                     Your account balance is Rs."+(amountkasinadh-deposite22));
					System.out.println();
				}
				
				}
				else 
					{
					System.out.println();
					System.out.println("Your account has insufficent balance or You have not entered valid amount");
					System.out.println();
					}
				}
				break;
			case 3:
				{
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("                     Your Account Balance is Rs."+amountkasinadh);
				System.out.println();
				}
				break;
			case 4:
				{
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("                     Your Account balance is Rs."+amountkasinadh );
				System.out.println("                     Your Transcation details: ");
				System.out.println();
				System.out.println();
				}
				break;
				default : System.out.println("                     Enter valid Input..!!!!!!!!!!!!");
			
			}
			
			}
			else 
				{
				System.out.println("                     Enter valid input..!!!!!!!!!");
				}
			}
			break;

		case 2:
			{
			System.out.println("                     please insert your card (enter 1)");
				c=scan.nextInt();
			if (c==1)
			{
				System.out.println("                     Dont remove yourcard until transcation complete ");
				System.out.println("                     Please enter your PIN");
				int d=scan.nextInt();
				if (d==pin)
				{
					System.out.println();
					System.out.println("                    WELCOME Mr.SRINIVAS");
			System.out.println("=================================================================================");
					System.out.println("                     Enter 1 for balance enquiry");
					System.out.println("                     Enter 2 for cash withdrawal");
					System.out.println("                     Enter 3 for cash deposite");
					System.out.println("                     Enter 4 for mini statement");
					System.out.println("                     Enter 5 for PIN change");
					System.out.println("                     Enter your choice");
					int e=scan.nextInt();
					switch (e)
					{
					case 1:
						{
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("                     Your Account balance is ");
						System.out.println("                     Rs. "+amount);
						System.out.println();
						}
						break;
					case 2:
						{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Enter the amount");
						System.out.println("Enter amount in multiples of 100,200,500,2000");
						System.out.println("--------------------------------------------------------------------------------");
						int notes=scan.nextInt();
						if (notes%100==0&&notes<=amount)
						{
							System.out.println("---------------------------------------------------------------------------------");
							System.out.println();
							System.out.println(notes);
							System.out.println("                     Enter 1 for conform");
							System.out.println("                     Enter 2 for cancel");
							int conform=scan.nextInt();
							if (conform==1)
							{
								System.out.println();
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println("                     Please collect your cash  "+(notes));
								System.out.println("                     Your Account balance is Rs."+(amount-notes));
								System.out.println();
							}
							else
							{
							System.out.println();
							System.out.println("Your account has insufficient balance or you have entered invalid Amount");
							System.out.println();
							}
						}

						}
						break;
					case 3:
						{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Drop your money in the multiples of 100,200,500,2000");
						
						System.out.println("Please drop your money in the deposite slot(Enter the amount)");
						System.out.println("--------------------------------------------------------------------------------");
						int deposite=scan.nextInt();
						if (deposite%100==0)
						{
							System.out.println("---------------------------------------------------------------------------------");
							System.out.println();
							System.out.println("                     Your amount is Rs. "+deposite);
							System.out.println("                     Enter 1 to conform");
							System.out.println("                     Enter 2 to cancel");
							System.out.println();
							int f=scan.nextInt();
							if (f==1)
							{
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println();
								System.out.println("Your Amount Rs."+deposite+" is deposited in your account"  );
								System.out.println("Your Account balance is Rs."+(deposite+amount));
								System.out.println();
							}
						}
						}
						break;
					case 4:
						{
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Your account balance is Rs."+amount);
						System.out.println("Recent transcations are : ");
						System.out.println();

						}
						break;
					case 5:
						{
						System.out.println();
						System.out.println("                     Enter your old pin ");
						int pinchange=scan.nextInt();
						if (pinchange==pin);
						{
							System.out.println();
							System.out.println("                     Enter new pin");
							int newpin1=scan.nextInt();
							System.out.println("                     Re-Enter new Pin");
							int newpin2=scan.nextInt();
							if (newpin1==newpin2)
							{
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println();
								System.out.println("You PIN number suessfully changed......");
								System.out.println();
							}
							else
							{
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println();
								System.out.println("Re- entered new pin and new pin doesnot match");
								System.out.println("Your transcation Failed");
								System.out.println();
							}
						}
						
							
						}
						break;
						default : System.out.println("Enter valid input");
					}
				}
				else if (d==pinnagesh)
				{
					System.out.println();
					System.out.println("                    WELCOME Mr.Nagesh");
			System.out.println("=================================================================================");
					System.out.println("                     Enter 1 for balance enquiry");
					System.out.println("                     Enter 2 for cash withdrawal");
					System.out.println("                     Enter 3 for cash deposite");
					System.out.println("                     Enter 4 for mini statement");
					System.out.println("                     Enter 5 for PIN change");
					System.out.println("                     Enter your choice");
					int r=scan.nextInt();
					switch (r)
					{
					case 1:
						{
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("                     Your Account balance is ");
						System.out.println("                     Rs. "+amountnagesh);
						System.out.println();
						}
						break;
					case 2:
						{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Enter the amount");
						System.out.println("Enter amount in multiples of 100,200,500,2000");
						System.out.println("--------------------------------------------------------------------------------");
						int notes5=scan.nextInt();
						if (notes5%100==0&&notes5<=amountnagesh)
						{
							System.out.println("---------------------------------------------------------------------------------");
							System.out.println();
							System.out.println(notes5);
							System.out.println("                     Enter 1 for conform");
							System.out.println("                     Enter 2 for cancel");
							int conform=scan.nextInt();
							if (conform==1)
							{
								System.out.println();
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println("                     Please collect your cash  "+(notes5));
								System.out.println("                     Your Account balance is Rs."+(amountnagesh-notes5));
								System.out.println();
							}
							else
							{
							System.out.println();
							System.out.println("Your account has insufficient balance or you have entered invalid Amount");
							System.out.println();
							}
						}

						}
						break;
					case 3:
						{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Drop your money in the multiples of 100,200,500,2000");
						System.out.println("Please drop your money in the deposite slot(Enter the amount)");
						System.out.println("--------------------------------------------------------------------------------");
						int deposite5=scan.nextInt();
						if (deposite5%100==0)
						{
							System.out.println("---------------------------------------------------------------------------------");
							System.out.println();
							System.out.println("                     Your amount is Rs. "+deposite5);
							System.out.println("                     Enter 1 to conform");
							System.out.println("                     Enter 2 to cancel");
							System.out.println();
							int f=scan.nextInt();
							if (f==1)
							{
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println();
								System.out.println("Your Amount Rs."+deposite5+" is deposited in your account"  );
								System.out.println("Your Account balance is Rs."+(deposite5+amountnagesh));
								System.out.println();
							}
						}
						}
						break;
					case 4:
						{
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Your account balance is Rs."+amountnagesh);
						System.out.println("Recent transcations are : ");
						System.out.println();

						}
						break;
					case 5:
						{
						System.out.println();
						System.out.println("                     Enter your old pin ");
						int pinchange=scan.nextInt();
						if (pinchange==pinnagesh);
						{
							System.out.println();
							System.out.println("                     Enter new pin");
							int newpin1=scan.nextInt();
							System.out.println("                     Re-Enter new Pin");
							int newpin2=scan.nextInt();
							if (newpin1==newpin2)
							{
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println();
								System.out.println("You PIN number suessfully changed......");
								System.out.println();
							}
							else
							{
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println();
								System.out.println("Re- entered new pin and new pin doesnot match");
								System.out.println("Your transcation Failed");
								System.out.println();
							}
						}
						
							
						}
						break;
						default : System.out.println("Enter valid input");
					}
				}
				else if (d==pinkasinadh)
				{
					System.out.println();
					System.out.println("                    WELCOME Mr.Kasinadh");
			System.out.println("=================================================================================");
					System.out.println("                     Enter 1 for balance enquiry");
					System.out.println("                     Enter 2 for cash withdrawal");
					System.out.println("                     Enter 3 for cash deposite");
					System.out.println("                     Enter 4 for mini statement");
					System.out.println("                     Enter 5 for PIN change");
					System.out.println("                     Enter your choice");
					int e=scan.nextInt();
					switch (e)
					{
					case 1:
						{
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("                     Your Account balance is ");
						System.out.println("                     Rs. "+amountkasinadh);
						System.out.println();
						}
						break;
					case 2:
						{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Enter the amount");
						System.out.println("Enter amount in multiples of 100,200,500,2000");
						System.out.println("--------------------------------------------------------------------------------");
						int notes1=scan.nextInt();
						if (notes1%100==0&&notes1<=amountkasinadh)
						{
							System.out.println("---------------------------------------------------------------------------------");
							System.out.println();
							System.out.println(notes1);
							System.out.println("                     Enter 1 for conform");
							System.out.println("                     Enter 2 for cancel");
							int conform=scan.nextInt();
							if (conform==1)
							{
								System.out.println();
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println("                     Please collect your cash  "+(notes1));
								System.out.println("                     Your Account balance is Rs."+(amountkasinadh-notes1));
								System.out.println();
							}
							else
							{
							System.out.println();
							System.out.println("Your account has insufficient balance or you have entered invalid Amount");
							System.out.println();
							}
						}

						}
						break;
					case 3:
						{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Drop your money in the multiples of 100,200,500,2000");
						System.out.println("Please drop your money in the deposite slot(Enter the amount)");
						System.out.println("--------------------------------------------------------------------------------");
						int deposite4=scan.nextInt();
						if (deposite4%100==0)
						{
							System.out.println("---------------------------------------------------------------------------------");
							System.out.println();
							System.out.println("                     Your amount is Rs. "+deposite4);
							System.out.println("                     Enter 1 to conform");
							System.out.println("                     Enter 2 to cancel");
							System.out.println();
							int f=scan.nextInt();
							if (f==1)
							{
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println();
								System.out.println("Your Amount Rs."+deposite4+" is deposited in your account"  );
								System.out.println("Your Account balance is Rs."+(deposite4+amountkasinadh));
								System.out.println();
							}
						}
						}
						break;
					case 4:
						{
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Your account balance is Rs."+amountkasinadh);
						System.out.println("Recent transcations are : ");
						System.out.println();

						}
						break;
					case 5:
						{
						System.out.println();
						System.out.println("                     Enter your old pin ");
						int pinchange=scan.nextInt();
						if (pinchange==pinkasinadh);
						{
							System.out.println();
							System.out.println("                     Enter new pin");
							int newpin1=scan.nextInt();
							System.out.println("                     Re-Enter new Pin");
							int newpin2=scan.nextInt();
							if (newpin1==newpin2)
							{
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println();
								System.out.println("You PIN number suessfully changed......");
								System.out.println();
							}
							else
							{
								System.out.println("---------------------------------------------------------------------------------");
								System.out.println();
								System.out.println("Re- entered new pin and new pin doesnot match");
								System.out.println("Your transcation Failed");
								System.out.println();
							}
						}
						
							
						}
						break;
						default : System.out.println("Enter valid input");
					}
				}
				else
				{
				System.out.println();
				System.out.println("Enter valid Pin");
				System.out.println("Your transcation cancled");
				System.out.println();
				}
			}
			}
			break;
			default: System.out.println("Enter valid input");
		}
		}
		else 
		{
		 System.out.println();
		 System.out.println("Enter valid input");
		 System.out.println("Your transcation cancled");
		 System.out.println();
		 }
		
		System.out.println();
		System.out.println("****************************");
		
		System.out.println("                              Thank you for Using ABC bank ATM");
		System.out.println("****************************");
		System.out.println();
		
	}
}