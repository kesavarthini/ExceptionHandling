import java.io.*;
	class A{
		public void abc() throws IOException,NullPointerException,ArithmeticException,UserException
		{
			int a=50;
			for(int i=1;i<=20;i++){
				System.out.println(i);
				int result=i/(i-1);
				if(i==120)
				{
					throw new IOException();

				}
				if(i==150)
				{
					throw new NullPointerException();
					
				}
				if(i==100)
				{
					return;
					
				}
				if(i==80)
				{
				    throw new UserException("When i is 8");
				}
				if(i==6)
				{
						throw new UserException("when i is 6");
						
				}
					
	
			}
			}
		
		

		public void xyz()throws IOException,ArithmeticException,UserException
		{
			abc();

			}
		
		
		public void atoz()throws IOException,ArithmeticException,UserException
		{
			xyz();
			
		}
	}
		class UserException extends Exception{
		public UserException(){}
		public UserException(String msg){
			super(msg);
		}	}


  public class ExceptionDemo
 
 {
 	public static void main(String args[]){
 		try{
 			A e = new A();
 			e.atoz(); 		}
 			catch (IOException e){
 				System.out.println("IO Exception handler");
 			}
 				catch (NullPointerException e){
 				System.out.println("NullPointerExceptionhandler");
 			}
 				catch (UserException e){
 				System.out.println("User Exception handler");
 				e.printStackTrace();
 				System.out.println("Reason: "+e.getMessage());
 			}
 			catch (Exception e){
 				System.out.println("Exception handler");
 			}
 			finally
 			{
 				System.out.println("Thanks");
 			}
 			System.out.println("Program continues");

 	}
 }
	
	

