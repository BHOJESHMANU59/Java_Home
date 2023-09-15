package com.arrayds;

import java.util.Arrays;

interface Array {
	public void create(int size);

	public void add(Object ele);

	public void remove(Object ele);

	public void set(int index, Object ele);

	public int search(int ele);

	public Object get(int index);

	public void traversal();

	public void sort();

	public void clear();
}

class ArrayClass implements Array {
	public int k = 0;
	private Object[] ar;
	private int size;

	@Override
	public void create(int size) {
		this.size = size;
		ar = new Object[size];
		System.out.println("Array Created with size: " + size);
	}

	@Override
	public void add(Object ele) {
		if (k <=size) 
		{
			ar[k] = ele;
			System.out.println("Element is added at index: " + k);
			k++;
		} 
		else
		{
			throw new ArrayIndexOutOfBoundsException("Array Is Full");
		}
	}

	@Override
	public void remove(Object ele) 
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

	@Override
	public void set(int index, Object ele)
	{
		if (index < size && index >= 0) 
		{
			ar[index] = ele;
			System.out.println("Element is inserted at index: " + index);
		} 
		else 
		{
			System.out.println("Invalid Index");
		}
	}

	@Override
	public int search(int ele) 
	{
		return ele;
		//return search(ar,ele,0,ar.length-1);
	}
/*  public int search(int[] a,int ele,int low,int high)
	{
		
		if(low>high)
		{
			
			return -1;
		}
		int mid=(low+high)/2;
		if(a[mid]==ele)
		{
			
			return mid;
		}
		else if(ele>ar[mid])
		{
			return search(a,ele,mid+1,high);
		}
		else
		{
			return search(a,ele,low,mid-1);
		}*/
		
	


	@Override
	public Object get(int index) 
	{
		if (index < size && index >= 0) 
		{
			return ar[index];
		} 
		else
		{
			System.out.println("Invalid index. Returning 0.");
			return 0;
		}
	}

	@Override
	public void traversal() {
		for (int i = 0; i < size; i++) {
			System.out.println(ar[i]);
		}
	}

	@Override
	public void sort() {
		Arrays.sort(ar);
		for (int i = 0; i < size; i++) {
			System.out.println(ar[i]);
		}
	}

	@Override
	public void clear() 
	{
		Arrays.fill(ar, 0);
		for (int j = 0; j < size; j++)
		{
			System.out.print(ar[j] + " ");
		}
	}
}

public class ArrayDS {
	public static void main(String[] args) {
		Array ar = new ArrayClass();
		ar.create(6);
		ar.add(60);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(10);

		ar.traversal();
		System.out.println("The given ele found at:"+ar.search(10));
		ar.search(20);
		ar.search(30);
		ar.search(40);
		ar.search(50);
		ar.search(60);
		
		System.out.println("-------------------------------");
		ar.traversal();
	}
}
