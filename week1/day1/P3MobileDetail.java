package week1.day1;

public class P3MobileDetail
{
	private int Model=10;
	private String Color="Black";
	private Float Price=9000f;
	//private double IME = 16754237677.89D;
	public float discount,DisRate;

	public int MobileModelNo() {  return Model; }
	
	public String MobileColor() { return Color; }
	
	public Float Price() { return Price;	}
	
	public void Msg() { System.out.println("* * * You got a better offer * * *"); 	}
	
	//public float discount(float DisRate) 
	public float discount() 
	{
		if (Price<= 10000)
		{	discount = Price * (-20/100); 
			DisRate = Price - discount;
		}
		/*else 
		{	discount = Price * (-2/100); 
			DisRate = Price - discount;
		}
		*/
		return DisRate;			
	}
	
}
