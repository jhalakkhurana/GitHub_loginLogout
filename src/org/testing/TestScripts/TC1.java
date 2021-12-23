package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.BaseClass;
import org.testing.Logs.CaptureLogs;

import org.testing.screenshots.CaptureScreenshots;
import org.testng.annotations.Test;


public class TC1 extends BaseClass{
	
@Test
public void tc1() throws InterruptedException, IOException
	{
	d.findElement(By.id("login_field")).sendKeys("jhalakkhurana1991@gmail.com");
	
	d.findElement(By.id("password")).sendKeys("jhalak56789");
	
	
	d.findElement(By.name("commit")).click();
	

CaptureScreenshots.takeScreenshot(d, "C:\\Users\\Ishan\\Desktop\\LoginSc.png");	


d.findElement(By.cssSelector("body > div.position-relative.js-header-wrapper > header > div.Header-item.position-relative.mr-0.d-none.d-md-flex > details > summary > img")).click();

Thread.sleep(1000);
    
d.findElement(By.cssSelector("body > div.position-relative.js-header-wrapper > header > div.Header-item.position-relative.mr-0.d-none.d-md-flex > details > details-menu > form > button")).click();
CaptureLogs.takeLogs("TC1", "Sucessfully Login to Git Hub");

	}
}
