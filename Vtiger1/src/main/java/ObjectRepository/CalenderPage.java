package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalenderPage {
   @FindBy(xpath="//input[text()='calender']")
   private WebElement calenderlink;

public WebElement getCalenderlink() {
	return calenderlink;
}
}
