package arryLearning;

import java.util.Arrays;

public class LearningArray {

	public static void main(String[] args) {
		int a = 10;
		a = 15;
		int b = 12;
		System.out.println(b);
		b =a ;
		int A = a+b+1;
		b = b+a;
		System.out.println(A);
		
		System.out.println(b+a);
		
		String f= "Apple";
		String g="ball";
		String h = "30";
		char i = 'h';
		int j = 50;
		f = "air plane";
		int n = 3;
		System.out.println(f);
		System.out.println(f+j);
		System.out.println(f+j+n);
		System.out.println(j+n+f);
		System.out.println(f+(j+n));
		System.out.println(""+j+n+f);
		System.out.println(h+j+f+f);
		System.out.println(i+f);
		System.out.println(i+"hello");
        //Array= one identifier that holds mulltiple values
		//Symbol of an array =[];
		//Array always works with index values
		//how many you going to have,you can go with this formula.i know how many
		//but i dont know the values.
		
		
		String[] students = new String[5];//formula to create an array
		
		students [0] = "Abraham";
		students[3] = "AKHI";
		students[1] = "Amrit";
		students[4] = "Benyam";
		students[2] = "Caroline";
		System.out.println(students[1]);
		
		// one is you know the item and you put the items,i know the valus are i will put it right way.
		
		int [] grades = {80,60,90,100};
		
		char[] letters = {'a', 'v','x','y'};
		String[] words = {"hello","test"};
		//you dont know the size and values.you dont know how many you are going to have and also dont know who they are.but you knowthere will be more the one
		
		System.out.println(grades[0]);
		System.out.println(grades[0] + words[1]);
		
		//to charArray
		
		String word = "hello";
		word.toCharArray();
		char[] myArray = word.toCharArray();//'h','e','l','l',
		word.length();
		int wordlen =  word.length();
		System.out.println(myArray[wordlen-1]);//this way you can find the last latter
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		System.out.println(myArray[4]);
		System.out.println();
		
		String sentence = "today is sunday.when will this class be over?.hiwoe?";
		//Split
	   sentence.split(" ");
	   String[] wordArray = sentence.split("class");
	   System.out.println( wordArray[0]);
	   
	   String[] wordArray1 = sentence.split("\\? (?!\\?)");
	   System.out.println( wordArray1[0]);
	   
	   //to find how many items in the array.somelike string function.
	   
	   int arraySize = wordArray.length;
	   System.out.println(arraySize);
	  
	   //Arrays.sort();
	   
	   int[] grade = {80,60,50,20,1,2,5};//1,2,5,50,60,80
	   System.out.println(grade[0]);
	   Arrays.sort(grade);
	   System.out.println(grade[0]);
	   
		
		
	

}
}