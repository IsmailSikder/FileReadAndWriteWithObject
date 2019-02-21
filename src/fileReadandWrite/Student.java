package fileReadandWrite;
/*
 * Student object with variable first and last name
 * SSN, 4 different test and final grade with only settar and gettar method
 * to set the value and get the value respectively
 * */
public class Student {

	String firstName;
	
	String lastName;
	String SSN;
	int test1;
	int test2;
	int test3;
	int test4;
	int finalGrade;
	
	public void setFirstName(String fname){
		firstName =fname;
	}
	public void setLastName(String lname){
		lastName =lname;
	}
	public void setSSN(String ssn){
		SSN =ssn;
	}
	public void setTest1(int test){
		test1=test;
		
	}
   public void setTest2(int test){
	   test2=test;
		
	}
   public void setTest3(int test){
	   test3=test;
		
	}
   public void setTest4(int test){
	   test4=test;
		
	}
	public void setFinalGrade(int fgrade){
		finalGrade =fgrade;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSSN() {
		return SSN;
	}
	public int getFinalGrade() {
		return finalGrade;
	}
	public int getTest1(){
		return test1;	
	}
	
	public int getTest2(){
		return test2;	
	}
	public int getTest3(){
		return test3;	
	}
	public int getTest4(){
		return test4;	
	}
	
}
