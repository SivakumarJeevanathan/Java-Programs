package week1.day1;//Package Name should begin with Lower case

public class P2Mobile
{
	public void sendSMS()	{ 	System.out.println("Send SMS"); } 
	public void MakeCalls()	{	System.out.println("Send MakeCalls"); }
	public void TakeShots()	{	System.out.println("Send TakeShots");	}

public static void main(String[] args)

{
	P2Mobile Mbl = new P2Mobile();
	Mbl.sendSMS();
	Mbl.TakeShots();
	Mbl.MakeCalls();
}
}

