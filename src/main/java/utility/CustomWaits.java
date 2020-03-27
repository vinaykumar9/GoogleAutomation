package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class CustomWaits extends BasePage {
	
	
	
	public void implicitWait(int wait){
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}
	

	
}
