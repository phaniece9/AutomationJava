package tests;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.LoginPage;
import setup.BaseSetup;


public class LoginTest extends BaseSetup{

	BasePage bp;
LoginPage lp;

/*File f=new File("E:\\Projects\\gmailpom\\gmailtestdata.xls");
Workbook rwb=Workbook.getWorkbook(f);
Sheet rsh=rwb.getSheet(0); //0 for Sh

*/
//String Username="phani9kumar@gmail.com";
//String Password="kumarv@123";
@Test
public void login()throws Exception
{
	try
	{
		
		//read username and password from excel sheet
	File f=new File("E:\\Projects\\ebayautopom\\eBaycredentials.xls");
	Workbook rwb=Workbook.getWorkbook(f);
	Sheet rsh=rwb.getSheet(0); //0 for Sh
	int nour=rsh.getRows();
	int nouc=rsh.getColumns();
	//Open same excel file for results writing
	WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
	WritableSheet wsh=wwb.getSheet(0);
	
	String username=rsh.getCell(0,1).getContents();
	String password=rsh.getCell(1,1).getContents();
	
	bp.signInBtn.isDisplayed();
    bp.signInBtn.click();
    lp.userNameFld.clear();
   Thread.sleep(1000);
    lp.userNameFld.sendKeys(username);
    Thread.sleep(1000);
    lp.passwordFld.clear();
    Thread.sleep(1000);
    lp.passwordFld.sendKeys(password);
    lp.loginBtn.isEnabled();
    lp.loginBtn.click();
	}
	catch(Exception e)
	{
		
		e.printStackTrace();
	}
	//if link accounts page is displayed click no thanks
    if(lp.linkaccounts.isDisplayed())
    {
    	lp.Nothanks.click();
    }
    /*if (bp.signInBtn.isDisplayed()) {
    	System.out.println("login failed");
	}else{
		System.out.println("login pass");
	}*/
    
}
}
