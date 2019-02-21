package fileReadandWrite;
/**********
 * Purpose of this program are: 
 *  read data from a file(Student.txt)
 *  Create a student object and populate student object variable with the data read from files
 *  Write data to a file with final output
 */
import java.io.*;
import java.util.Scanner;

public class FileStremMain {

	//Main method
	public static void main(String[] args) throws FileNotFoundException {
		
		//Path to student file to read
		String inputFile="./student.txt";
		
		//Path to student file to write
		String outFile="./studentOut.txt";
		
		//Initializing Student array of object
		Student stArray[] = new Student[5]; 
		
		//Read student.txt file
		readFileInClassObject(inputFile);
		
		//read student.txt and populate student object
		readFileInClassObject(stArray,inputFile);
		
		//write to the file and console output
		printDataFromArray(stArray,outFile);
		
		

	}
	
	//Reading student.txt file and printing it on the console as it is
	public static void readFileInClassObject(String inf) throws FileNotFoundException{
		System.out.println("\n\nOutput of file using the scanner object");
		File inputFile = new File(inf);
		
		Scanner sc = new Scanner(inputFile);
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println(line);
			
		}
		sc.close();
		System.out.println();
	}
	
	//This method read data from files and set the Student object variable for each object of the array
	public static void readFileInClassObject(Student[] st, String inf)throws FileNotFoundException{
		
		File inputFile = new File(inf);
		//PrintWriter output = new PrintWriter(of);
		Scanner sc = new Scanner(inputFile);
		String line = sc.nextLine();
		//output.println(line);
		int count = 0;
		
		//Looping through the file by reading each line and populating array of student
		while(sc.hasNextLine()){
			st[count] = new Student();
			line = sc.nextLine();
			
			//Holding each line to String array which is split by a comma
			String[] words = line.split(",");
			
			//Setting student variable for each array object
			st[count].setFirstName(words[0]);
			st[count].setLastName(words[1]);
			st[count].setSSN(words[2]);
			st[count].setTest1(Integer.parseInt(words[3]));
			st[count].setTest2(Integer.parseInt(words[4]));
			st[count].setTest3(Integer.parseInt(words[5]));
			st[count].setTest4(Integer.parseInt(words[6]));
			
			//calculating finalgrade
			st[count].setFinalGrade((st[count].getTest1()+st[count].getTest2()+st[count].getTest3()+st[count].getTest4())/4);
			count++;
		}
		sc.close();
		
	}

	//Writing data to studentout.txt file from the array of student object and printing it to console
	public static void printDataFromArray(Student[] stArray,String of) throws FileNotFoundException{
		
		//Initializing Writer class with out file path
		PrintWriter output = new PrintWriter(of);
		
		//Printing header to studentout.txt and console
		System.out.println("This is what is being written on studentOut.txt file with final grade included\n");
		System.out.format("%-15s%-15s%-10s%4s%6s%8s%9s%11s\n","First Name", "Last Name","SSN","Test1","Test2","Test3","Test4","FinalGrade");
		output.format("%-15s%-15s%-10s%4s%6s%8s%9s%11s\n","First Name", "Last Name","SSN","Test1","Test2","Test3","Test4","FinalGrade");
		output.println();
		
		//Looping through each object and writing and printing each variable of the object to studentout.txt and console
		for(int i = 0; i<4; i++)
		{
			
			System.out.format("%-15s%-10s%-15s%4d%6d%8d%9d%11d\n",stArray[i].getFirstName(),stArray[i].getLastName(),stArray[i].getSSN()
					,stArray[i].getTest1(),stArray[i].getTest2(),stArray[i].getTest3(),stArray[i].getTest4(),stArray[i].getFinalGrade());
			output.format("%-15s%-10s%-15s%4d%6d%8d%9d%11d",stArray[i].getFirstName(),stArray[i].getLastName(),stArray[i].getSSN()
					,stArray[i].getTest1(),stArray[i].getTest2(),stArray[i].getTest3(),stArray[i].getTest4(),stArray[i].getFinalGrade());
			output.println();
		}
		
		output.close();
	}

}
