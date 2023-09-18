package com.sy;

//Object Implementation Layer

interface Bank {
	
	public void balance();

}
class HDFC implements Bank
{

	@Override
	public void balance() 
	{
		
		System.out.println("Balance Is 1000");
	}
	
}
class ICIC implements Bank
{

	@Override
	public void balance() 
	{
		System.out.println("Balance Is 2000");
		
	}
}
class Canara implements Bank
{

	@Override
	public void balance() 
	{
		System.out.println("Balance Is 3000");
	}
	
}

//Object Creation Layer

class ObjectCreationLayer
{
	public Bank createObject(int code)
	{
		if(code==123)
		{
			Bank b=new HDFC();
			return b;
		}
		else if(code==456)
		{
			Bank b=new ICIC();
			return b;
		}
		else if(code==789)
		{
			Bank b=new Canara();
			return b;
		}
		return null;
	}
}

public class MainBank
{
	public static void main(String[] args) {
		ObjectCreationLayer obj=new ObjectCreationLayer();
	    Bank b = obj.createObject(123);
		b.balance();
		System.out.println("-------------------------");
		Bank b1=obj.createObject(456);
		b1.balance();
		System.out.println("-------------------------");
		Bank b2=obj.createObject(789);
		b2.balance();
	}
}
