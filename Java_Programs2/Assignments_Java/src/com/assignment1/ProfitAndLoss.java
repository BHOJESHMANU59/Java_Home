package com.assignment1;

public class ProfitAndLoss {
	
	static void check(double cp,double sp)
	{
		if(sp>cp)
		{
			System.out.println("Profit "+(sp-cp));
		}
		else if(sp<cp)
		{
			System.out.println("loss " + (cp=sp));
		}
		else
		{
			System.out.println("NEUTRAL");
		}
	}
	public static void main(String[] args) {
		check(20,30);
		check(50, 20);
	}

}
