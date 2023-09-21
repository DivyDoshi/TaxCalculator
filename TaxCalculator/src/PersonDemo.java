

import java.util.Scanner;

public class PersonDemo 

{
	public static void main(String[] args) {
//	Scanner ob = new Scanner(System.in);
//	
//	String name;
//	System.out.println("Enter Person Name:");
//
//	name = ob.next();
//	System.out.println("Enter age:");
//	
//	int age = ob.nextInt();
//	System.out.println("Enter gender: ");
//	
//	String gender = ob.next();
//	System.out.println("Enter Taxable income: ");
//	
//	int income = ob.nextInt();
//	
//	Person person = new Person();
//	person.setName(name);
//	person.setAge(age);
//	person.setGender(gender);
//	person.setIncome(income);
//	
//	System.out.println(person);
//	
//	TaxCalculator calc = new TaxCalculator();
//	calc.calculateTax(person);
//	System.out.println("After Calculating tax: ");
//	System.out.println(person);
//	
//	ob.close();
	Student std = new Student();
	
	std.setName("Divy");
	std.setAge(20);
	std.setEnrollno(7026);
	std.setResult(88);
	std.setGender("Male");
	System.out.println(std.getName() + std.getAge() + std.getGender() + std.toString());
	
}
	
	
	

}
