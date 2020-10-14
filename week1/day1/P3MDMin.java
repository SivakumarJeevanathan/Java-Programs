package week1.day1;

import week1.day1.P3MobileDetail;
public class P3MDMin
{
	public static void main(String[] args) 
	{
	
	P3MDMin obj = new P3MDMin(); // Object Created
	
	int ModelNo = obj.MobileModelNo();
	System.out.println("The Model no of mobile is:" +ModelNo);
	
	String MColor = obj.MobileColor();
	System.out.println("The Color of mobile is:" +MColor);
	
	Float MPrice = obj.Price();
	System.out.println("The MRP Price of mobile is:" +MPrice);
	
	obj.Msg();
	
	/*Float Mdiscount = obj.discount(Mdiscount);
	System.out.println("The Price of mobile after discount is:" +Mdiscount1 );
	*/
	}

}
