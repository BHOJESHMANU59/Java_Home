package com.arrayds;

class ArrayImplementation
{
	int size;
	int ar[];
	int k=0;
	
	public  void create(int size)
	{
		this.size=size;
		ar=new int[size];
		System.out.println("Array Created with size: " + size);
	}
	
	public void insert(int ele)
	{
	
		if(k<=size)
		{
			ar[k++]=ele;
			System.out.println("Element is added at index: " + k);	
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Array Is Full");
		}
	}
	
	public void insertAtStart(int value)
	{
		for(int i=k-1;i>0;i--)
		{
			ar[i]=ar[i-1];
		}
		ar[0]=value;
	}
	
	public void add(int index,int ele)
	{
		for(int i=ar.length-1;i>index;i--)
		{
			ar[i]=ar[i-1];

		}
		ar[index]=ele;
	}
	
	public void set(int index,int ele)
	{
		for(int i=ar.length-1;i>=0;i--)
		{
			if(i==index)
			{
				ar[i]=ele;
			}

		}
	
	}
	
	
	public void deleteEnd()
	{
		if(ar.length<=0)
		{
			return;
		}
		k--;
		
    }
	
	
	public void remove(int ele) 
	{
		int index = -1;
		for (int i = 0; i < size; i++)
		{
			if (ar[i] == ele) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			for (int i = index; i < size - 1; i++) {
				ar[i] = ar[i + 1];
			}
			ar[size - 1] = 0;
			System.out.println("Element is removed at index: " + index);
			size--;
		} else {
			System.out.println("Invalid Input");
		}
	}

	
	public void display()
	{
		for(int i=0;i<k;i++)
		{
			System.out.println(ar[i]);
		}
		
	}
}



public class ArraysDSA 
{
	public static void main(String[] args) 
	{
		ArrayImplementation a=new ArrayImplementation();
		a.create(5);
		
		System.out.println("-----------------------");
		a.insert(10);
		a.insert(20);
		a.insert(30);
		a.insert(40);
		a.insert(50);
		
		System.out.println("----------------------");
		a.display();
//		System.out.println("-------------------");
//		a.insertAtStart(90);
//		a.insertAtStart(70);
//		a.display();
//		
//		System.out.println("-------------------");
//		a.add(3, 100);
//		a.set(3, 300);
//		a.display();
		
//		System.out.println("-------------------");
//	    a.deleteEnd();
//	    a.deleteEnd();
//		a.display();
		
		System.out.println("-------------------");
	    a.remove(50);
		a.display();
		
		
	}

}
