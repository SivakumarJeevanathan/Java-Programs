package week1.day1;

import week1.day1.P3MobileDetail;
public class P3MobileDetailMin
{
	public static void main(String[] args) 
	{
	
	P3MobileDetail obj = new P3MobileDetail(); // Object Created
	
	int ModelNo = obj.MobileModelNo();
	System.out.println("The Model no of mobile is:" +ModelNo);
	
	String MColor = obj.MobileColor();
	System.out.println("The Color of mobile is:" +MColor);
	
	Float MPrice = obj.Price();
	System.out.println("The MRP Price of mobile is:" +MPrice);
	
	obj.Msg();
	
	Float Mdiscount = obj.discount();
	System.out.println("The Price of mobile after discount is:" +Mdiscount );
	
	}

}
