import java.util.*;
public class ArrayImplementation
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in); //scanner object creation
        System.out.println("Enter the size:"); //output statement
        int size=s.nextInt(); //to get the user input
        int[] array1=new int[size]; //array declaration
        System.out.println("Enter"+size+"numbers");
        for(int i=0;i<size;i++){
            array1[i]=s.nextInt(); //to insert the element in an array
        }
        System.out.println("Array elements are:");
        for(int i=0;i<size;i++){
            System.out.println(array1[i]);
        }
    }
}


import java.util.*;
public class ArrayImplementation
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in); //scanner object creation
        System.out.println("Enter the size:"); //output statement
        int size=s.nextInt(); //to get the user input
		int[] arr1=new int[size];  //array creation
		for(int i=0;i<size;i++){
			arr1[i]=s.nextInt();  //input statement
		}
		int largest=arr1[0];
		for(int i=0;i<size;i++){
			if(arr1[i]>largest){
			largest=arr1[i];}
		}
		System.out.println("The largest elements are:"+largest);
    }
}

import java.util.*;
public class ArrayImplementation
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
		System.out.println("Enter size:"); 
        int size=scan.nextInt();
		int[] a1=new int[size];
		System.out.println("Enter element:");
		for(int i=0;i<size;i++){
			a1[i]=scan.nextInt();
		}
		int  sum=0;
		for(int i=0;i<size;i++){
		sum+=a1[i];
		}
	float average=(float)sum/size;
	System.out.println("Sum="+sum);
	System.out.println("Average="+average);
	}
}
