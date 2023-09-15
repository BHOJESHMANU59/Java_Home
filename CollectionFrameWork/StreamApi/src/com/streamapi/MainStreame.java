package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class MainStreame {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,3,1,4,5,6,7,9,8,10,1,2);
		List<Integer> list1=Arrays.asList(11,12,13,14,15,21,22,23,24,25,31,32,33,34,35,40);
		List<String> str=Arrays.asList("Srinath","Bhojesh","Manu","ShivRaj","Dhanush","Sandy","Sharanu","Yogesh","Soma");
		
		int[] ar= {34,54,6,67,91,97,30};
		
		//Filter is used to eliminate the elements based on condition
		
		System.out.println("Print Even List Elements\n");
		
		List<Integer> equalList=list.stream()
				                    .filter((x)->x%2==0)
				                    .collect(Collectors.toList());
		
		System.out.println(equalList);
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Print List Elements Ends With 3\n");
		
		List<Integer> endwith3=list1.stream()
				                    .filter(x->x%10==3)
				                    .toList();
		
		System.out.println(endwith3);
		
		System.out.println("-----------------------------------------------------------------");
		
		//Map is used to Update the elements based on condition
		
		System.out.println("Convert the List to Set and Squar It\n");
		
		Set<Integer> Squarset=list.stream()
				                  .map(x->x*x)
				                  .collect(Collectors.toSet());
		
		System.out.println(Squarset);
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Double the Value of Even List Elements\n");
		
		List<Integer> evenDouble=list.stream()
				                     .filter(x->x%2==0)
				                     .map(x->x+x)
				                     .collect(Collectors.toList());
		
		System.out.println(evenDouble);
		
		System.out.println("-----------------------------------------------------------------");
		
		
		// Removing Duplicated in List
		
		System.out.println("Removing duplicate elements in List\n");   
		
		List<Integer> unique=list.stream()
				                 .distinct()
				                 .sorted()
				                 .toList();
		
		System.out.println(unique);
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("List elements Starts With S\n");
		
		List<String> s_name=str.stream()
				               .filter(x->x.charAt(0)=='S')
				               .sorted()
				               .collect(Collectors.toList());
		
		System.out.println(s_name);
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("List Contains Name in S\n");
		
		List<String> s_contain=str.stream()
				                  .filter(s->s.toLowerCase().contains("s"))
				                  .toList();
	   
		System.out.println(s_contain);
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Sum Of Elements In List\n");
		
		int sum=list.stream()
				    .reduce(0, (Sum,i)->Sum+i);
		
		System.out.println(sum);
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Even Elements In List Itiration\n");
		
		list.stream()
		    .filter(x->x%2==0)
		    .forEach(y->System.out.println(y));
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("\nArray Itiration\n");
		
		Arrays.stream(ar)
		      .forEach(x->System.out.println(x));
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("It returns the count of elements in this stream. This is a special case of a reduction.\n"); 
		
		long count=list.stream()
				       .count();
		
		System.out.println(count);
		

		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("The findAny() method returns an Optional object that may contain an element if it exists in the stream, or an empty Optional if the stream is empty.\n");
		
		Optional<Integer> anyEle=list.stream()
				                     .findAny();
		if(anyEle.isPresent())
		{
			System.out.println("Any Elements In List is ="+anyEle.get());
		}
		else
		{
			System.out.println("Empty");
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("It will Return the Arrays or collection upto Given range in limit method");
		
		
		List<Integer> limit=list.stream()
				                .limit(5)
				                .toList();
		
		System.out.println(limit);
		
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("It Return the Length of Each String in given Collection\n");
		
		List<Integer> nameLength=str.stream()
				                    .map(String::length)
				                    .toList();
		
		System.out.println(nameLength);

		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Max() is Used To Find The Maximun Element in The Give Collection/Array\n");
		
		Optional<Integer> maxNo=list.stream().max(Integer::compare);
		
		if(maxNo.isPresent())
		{
			System.out.println("Maximum Element In The Collection/ Array Is= "+maxNo.get());
		}
		else
		{
			System.out.println("No Max Element Found");
		}
		
		System.out.println("-----------------------------------------------------------------");
		
        System.out.println("Min() is Used To Find The Maximun Element in The Give Collection/Array\n");
		
		Optional<Integer> minNo=list.stream().min(Integer::compare);
		
		if(maxNo.isPresent())
		{
			System.out.println("Minimum Element In The Collection/ Array Is= "+minNo.get());
		}
		else
		{
			System.out.println("No Min Element Found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
