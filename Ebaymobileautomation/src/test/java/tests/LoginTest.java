package tests;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

import com.basesetup.BaseSetup;

import pages.BasePage;
import pages.LoginPage;

public class LoginTest extends BaseSetup {
	BasePage bp;
	LoginPage lp;

	
	@Test
		
	public void login()throws Exception
	{
		
		File f=new File("E:\\Projects\\Ebaymobileautomation\\excelfile\\eBaycredentials.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0); //0 for Sh
		int nour=rsh.getRows();
		int nouc=rsh.getColumns();
		//Open same excel file for results writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//read data from excel sheet
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
	   // lp.loginBtn.isEnabled();
	    lp.loginBtn.click();
				
		
	    if (bp.signInBtn.isDisplayed()) {
	    	//System.out.println("login failed");
	    	Label lf=new Label(2,1,"Failed");
	    	wsh.addCell(lf);
	    	wwb.write();
	    	wwb.close();
		}else{
			//System.out.println("login pass");
			
			Label pa=new Label(2,1,"Passed");
	    	wsh.addCell(pa);
	    	wwb.write();
	    	wwb.close();
			
		}
	}
}

/*File f=new File("E:\\Projects\\gmailpom\\gmailtestdata.xls");
Workbook rwb=Workbook.getWorkbook(f);
Sheet rsh=rwb.getSheet(0); //0 for Sh

*/