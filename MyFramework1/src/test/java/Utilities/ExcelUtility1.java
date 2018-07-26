package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import pages.Registration;

public class ExcelUtility1 {
	public void getTestdata() throws IOException
	{
		FileInputStream fin=new FileInputStream("C:\\Java Prog\\workspace\\Yash\\MyFramework1\\Resources\\MyDataInExcel1.xls");
		//XSSFWorbook x=new XSSFWorkbook();
		HSSFWorkbook x= new HSSFWorkbook(fin);
		HSSFSheet s=x.getSheet("Sheet1");
		
		int rowcount=s.getLastRowNum();
		for(int i=1;i<=rowcount;i++){
			String FirstName=s.getRow(i).getCell(0).getStringCellValue();
			String LastName=s.getRow(i).getCell(1).getStringCellValue();
			String Email=s.getRow(i).getCell(2).getStringCellValue();
			String Password= s.getRow(i).getCell(3).getStringCellValue();
			String ConfirmPassword=s.getRow(i).getCell(4).getStringCellValue();
			System.out.println(FirstName+" "+LastName+" "+Email+" "+Password+" "+ConfirmPassword);
			
			Registration.enterreg(FirstName, LastName, Email, Password, ConfirmPassword);
			
			
		}
		
		//String data=s.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(data);
		
	}

	public static void main(String[] args) throws IOException {
ExcelUtility1 e=new ExcelUtility1();
		
		e.getTestdata();
		// TODO Auto-generated method stub

	}

}
