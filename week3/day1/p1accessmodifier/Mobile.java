package week3.day1.p1accessmodifier;

public class Mobile
{
	public static void main(String[] args) 
	{
		Mobile_SmartPhone obj_Smartphone = new Mobile_SmartPhone();
		System.out.println("\t* * * RESULTS * * * \n Accessing the data from Mobile_SmartPhone Class");
		obj_Smartphone.VideoCall();
		obj_Smartphone.WhatsApp();
		
		Mobile_Android obj_Android = new Mobile_Android();
		System.out.println("\nAccessing the data from Mobile_Android Class");
		obj_Android.GooglePlayStore();
		System.out.println("Accessing the data of Mobile_SmartPhone Class through Mobile_Android Class object");
		obj_Android.WhatsApp();
		obj_Android.VideoCall();
		
		Mobile_iOS obj_iOS = new Mobile_iOS();
		System.out.println("\nAccessing the data from Mobile_iOS Class");
		obj_iOS.AppleStore();
		System.out.println("Accessing the data of Mobile_SmartPhone Class through Mobile_iOS Class object");
		obj_Android.WhatsApp();
		obj_Android.VideoCall();

	}
}
