package Files;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
class Operations{
	Scanner sc=new Scanner(System.in);
	String path="C:\\Assessment\\";

	void DisplayFile() {
     	System.out.println("The Files are");
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
	}
	void AddFiles() throws IOException {
		System.out.println("enter the filename");
		String filename1=sc.next();
		String finalpath=path+filename1;
		File f1=new File(finalpath);
		//create a new file
		boolean b=f1.createNewFile();
		if(b!=true) {
			System.out.println("file not created");
		}
		else {
			System.out.println("file created");
		}

		
	}
	void DeleteFile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename2=sc.next();
		String finalpath1=path+filename2;
		File f=new File(finalpath1);
		//delete operation
		f.delete();
		System.out.println("file gets deleted");
		

	}
	void Search() {
		System.out.println("enter the filename to search");
		String filename3=sc.next();
		File f=new File(path);
		//display operation
		int flag=0;
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			if(ff.getName().equals(filename3)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		
		}
		
		
		if(flag==1) {
			System.out.println("file is found");
		}
		else {
			System.out.println("file is not found");

	}
}}

public class Files {


public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	String path="C:\\Assessment\\";
	Operations O=new Operations();
	A:
	while(true) {
	System.out.println("Choose which operation has to be done!!"+"\n"+"1. Display the files"+"\n"+"2. Add or Delete the file"+"\n"+"3. close the application");
	int choice=sc.nextInt();
		switch(choice) {
		case 1:
			O.DisplayFile();
			break;
		case 2:
		{
			System.out.println("choose the operation"+"\n"+"1. Add files"+"\n"+"2.  Delete file"+"\n"+"3. Search file"+"\n"+"4. Return to the main menu");
			int C=sc.nextInt();
			switch(C) {
			case 1:
				O.AddFiles();
				break;

			case 2:
				O.DeleteFile();
				break;
				

			case 3:
                O.Search();
				
				break;

			case 4:
				continue A;
			}
		}
		case 3:
			System.exit(0);
			break;
		
	}
}}}

