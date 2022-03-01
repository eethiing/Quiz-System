/*
1. One ques by one ques
2. Structured/MCQ questions only have one answer
3. Other than the answers, everything else is wrong -- "Wrong! Please answer again!", 
	learner need to try until correct
4. Q1,2,3,4,7 - Structured
	Q5,6,8 - MCQ
5. each ques separatee methods
*/

import java.util.*; //to import Scanner

class Quiz{
	public static void main (String[] args){
		Scanner name = new Scanner(System.in);
		String user_name;
		System.out.println("What is your name?");
		user_name = name.nextLine();
		System.out.println("Hi, " + user_name);
		System.out.println();
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		
		System.out.println("All Done!");
	}	
	
	//STRUCTURED

	
	public static void q1(){
		boolean a = false;
		do {
			System.out.println("Q1. What is the language used in this OOP course?");
			System.out.println("Answer : ");
			Scanner obj1 = new Scanner(System.in);
			String ans;
			
			ans = obj1.nextLine();
			String answer = "Java";

			if (ans.equalsIgnoreCase(answer)){
				a = true;
				System.out.println("Correct!!");
				System.out.println();
			}else{
				System.out.println("Wrong! Please answer again!");
				System.out.println();
			}

		}while(a == false);
	}
	
	public static void q2(){
		boolean a = false;
		do {
			System.out.println("Q2. What is the command to print an output?");
			System.out.println("Answer : ");
			Scanner obj1 = new Scanner(System.in);
			String ans;
			
			ans = obj1.nextLine();
			String answer1 = "System.out.printf()";
			String answer2 = "System.out.print()";
			String answer3 = "System.out.println()";

			if (ans.equals(answer1) || ans.equals(answer2) || ans.equals(answer3)){
				a = true;
				System.out.println("Correct!!");
				System.out.println();
			}else{
				System.out.println("Wrong! Please answer again!");
				System.out.println();
			}

		}while(a == false);
	}

	public static void q3(){
		boolean a = false;
		do {
			System.out.println("Q3. How to compile Test.java using command prompt?");
			System.out.println("Answer : ");
			Scanner obj1 = new Scanner(System.in);
			String ans;
			
			ans = obj1.nextLine();
			String answer = "javac Test.java";

			if (ans.equals(answer)){
				a = true;
				System.out.println("Correct!!");
				System.out.println();
			}else{
				System.out.println("Wrong! Please answer again!");
				System.out.println();
			}

		}while(a == false);
	}

	public static void q4(){
		boolean a = false;
		do {
			System.out.println("Q4. How to run Test.java using command prompt?");
			System.out.println("Answer : ");
			Scanner obj1 = new Scanner(System.in);
			String ans;
			
			ans = obj1.nextLine();
			String answer = "java Test";

			if (ans.equals(answer)){
				a = true;
				System.out.println("Correct!!");
				System.out.println();
			}else{
				System.out.println("Wrong! Please answer again!");
				System.out.println();
			}

		}while(a == false);
	}

	
	public static void q5(){
		boolean a = false;
		do {
			System.out.println("Q5. Which of the package contains mathematical functions?");
			System.out.println("A.import java.lang*   	|   B.import java.awt*;");
			System.out.println("C. import java.util.Scanner;   |   D. import java.util.ArrayList");
			System.out.println("Answer (A/B/C/D) : ");
			char[] options = {'A','B','C','D'};
			Scanner obj5 = new Scanner(System.in);
			char ans;
			
			ans = obj5.next().charAt(0);

			if (ans == options[0]){
				a = true;
				System.out.println("Correct!!");
				System.out.println();
				obj5.reset();
			}else if(ans == options[1] || ans == options[2] || ans == options[3]){
				System.out.println("Wrong! Please answer again!");
				System.out.println();
			}else{
				System.out.println("Invalid Option!");
				System.out.println();
			}
			obj5.reset();
		}while(a == false);
	}
	
	public static void q6(){
		boolean a = false;
		do {
			System.out.println("Q6. Where does a java program start executing instructions from?");
			System.out.println("A. class   	 |   B. source file");
			System.out.println("C. main method   |   D. object");
			System.out.println("Answer (A/B/C/D) : ");
			char[] options = {'A','B','C','D'};
			Scanner obj6 = new Scanner(System.in);
			//System.out.println(obj6);
			char ans;
			
			ans = obj6.next().charAt(0);

			if (ans == options[2]){
				a = true;
				System.out.println("Correct!!");
				System.out.println();
				obj6.reset();
			}else if(ans == options[0] || ans == options[1] || ans == options[3]){
				System.out.println("Wrong! Please answer again!");
				System.out.println();
			}else{
				System.out.println("Invalid Option!");
				System.out.println();
			}
			obj6.reset();
		}while(a == false);
	}

	public static void q7(){
		boolean a = false;
		do {
			System.out.println("Q7. What is the output of the following coding?");
			System.out.println("public class Product");
			System.out.println("\t public static void main(String[] args) {");
			System.out.println("\t\t num1 = 8, num2 = 10, product;");
			System.out.println("\t\t product = num1 * num2;");
			System.out.println("\t\t System.out.println(+ product );");
			System.out.println("\t }");
			System.out.println("}");
			System.out.println("Answer : ");
			
			Scanner obj1 = new Scanner(System.in);
			String ans;
			
			ans = obj1.nextLine();
			String answer1 = "Error";
			String answer2 = "Compilation Error";

			if (ans.equalsIgnoreCase(answer1) || ans.equalsIgnoreCase(answer2)){
				a = true;
				System.out.println("Correct!!");
				System.out.println();
			}else{
				System.out.println("Wrong! Please answer again!");
				System.out.println();
			}

		}while(a == false);
	}

	public static void q8(){
		boolean a = false;
		do {
			System.out.println("Q8. What is the output of the following coding?");
			System.out.println("public class MyFirstJavaProgram {");
			System.out.println("\t static void main(String []args) {");
			System.out.println("\t\t System.out.println('My First Java Program');");
			System.out.println("\t }");
			System.out.println("}");
			System.out.println("A. My First Java Program   |   B. String");
			System.out.println("C. MyFirstJavProgram   	   |   D. compilation error");
			System.out.println("Answer (A/B/C/D) : ");
			char[] options = {'A','B','C','D'};
			Scanner obj8 = new Scanner(System.in);
			char ans;
			
			ans = obj8.next().charAt(0);

			if (ans == options[3]){
				a = true;
				System.out.println("Correct!!");
				System.out.println();
				obj8.reset();
			}else if(ans == options[0] || ans == options[1] || ans == options[2]){
				System.out.println("Wrong! Please answer again!");
				System.out.println();
			}else{
				System.out.println("Invalid Option!");
				System.out.println();
			}
			obj8.reset();

		}while(a == false);
	}
}
