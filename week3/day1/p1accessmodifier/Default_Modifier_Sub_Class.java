package week3.day1.p1accessmodifier;

public class Default_Modifier_Sub_Class 
{
	void DefaultModifierSubClass()
	{
		System.out.println("This Message is called from Sub-Class where ACCESS MODIFIER is 'DEFAULT' ");
		
		DefaultClass obj_DefaultClass = new DefaultClass();
		obj_DefaultClass.message();
	}
}
