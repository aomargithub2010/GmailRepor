package common;

import java.io.IOException;

import resources.ReadExcelFile;
import resources.WriteExcelFile;

public class commonExcelAction {
	
	public void readTheExcelFile() throws IOException {
		
		ReadExcelFile objExcelFile =new ReadExcelFile();
		 
		  //Prepare the path of excel file

	    String filePath = System.getProperty("user.dir")+".\\files";

	    //Call read file method of the class to read data

	    objExcelFile.readExcel(filePath,"data.xlsx","users");
	}
	
	public void writeTheExcelFile() throws IOException {
		 //Create an array with the data in the same order in which you expect to be filled in excel file

        String[] valueToWrite = {"Test1","Noida","name"};

        //Create an object of current class

        WriteExcelFile objExcelFile = new WriteExcelFile();

        //Write the file using file name, sheet name and the data to be filled

        objExcelFile.writeExcel(System.getProperty("user.dir")+".\\files","data.xlsx","users",valueToWrite);
		  
	}

}
