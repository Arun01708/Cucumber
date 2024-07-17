package stepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CustomerSteps {
	
WebDriver driver;

//  method-1	
@Given("^user navigate browser$")
public void launchbrowser() throws Throwable {
	driver = FunctionLibrary.startBrowser();
 }

// method-2	
@When("^user launch url$")
public void launchurl() throws Throwable {
    FunctionLibrary.openUrl();
 	}
// method-3
@When("^user wait for username with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_wait_for_username_with_and(String LocatorType, String LocatorValue) throws Throwable {
    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}
// method-4
@When("^user enter username with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_username_with_and_and(String LocatorType,String LocatorValue, String TestData) throws Throwable {
   FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
}
// method-5
@When("^user enter password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_password_with_and_and(String LocatorType,String LocatorValue, String TestData) throws Throwable {
   FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
}
// method-6
@When("^user clicklogin button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_clicklogin_button_with_and(String LocatorType,String LocatorValue) throws Throwable {
  FunctionLibrary.clickAction(LocatorType, LocatorValue);   
}
// method-7
@When("^user Wait for customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_Wait_for_customer_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}
// method-8
@When("^user click customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_click_customer_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}
// method-9
@When("^user wait add icon with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_wait_add_icon_with_and(String LocatorType, String LocatorValue) throws Throwable {
   FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}
// method-10
@When("^user click add icon with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_click_add_icon_with_and(String LocatorType, String LocatorValue) throws Throwable {
   FunctionLibrary.clickAction(LocatorType, LocatorValue);
}
// method-11
@When("^user wait for customer number with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_wait_for_customer_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
   FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}
// method-12
@When("^user capture customer number with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_capture_customer_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.captureCus(LocatorType, LocatorValue);
	}
// method-13
@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_in_with_and(String TestData, String LocatorType, String LocatorValue) throws Throwable {
    FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
}	
// method-14
@When("User Click Add button with {string} and {string}")
public void user_click_add_button_with_and(String LocatorType, String LocatorValue) {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

// method-15
@When("^Wait for confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_confirm_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}
// method-16
@When("^click confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_confirm_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}
// method-17	
@When("^Wait for alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_alert_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}
// method-18
@When("^click alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_alert_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}
// method-19
@When("^Validate Customer table$")
public void validate_Customer_table() throws Throwable {
   FunctionLibrary.customerTable();
}
// method-20
@When("^Click logout link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_logout_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}
// method-21
@When("^close application browser$")
public void close_application_browser() throws Throwable {
	FunctionLibrary.closeBrowser();
}


}
