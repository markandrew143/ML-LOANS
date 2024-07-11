package application.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;

public class Login_PageObjects {


    public WebElement login_Btn(){
        return getDriver().findElement(By.cssSelector("[type='submit']"));
    }
    public WebElement mobileNumber_field(){
        return getDriver().findElement(By.id("OTP"));
    }
    public WebElement verifyMobile_Text() {
        return getDriver().findElement(By.xpath("//h3[normalize-space()='Please verify your mobile number']"));
    }
    public WebElement LOGINKPX_button(){
        return getDriver().findElement(By.xpath("//form[@method='post']") );
    }
    public WebElement LOGINGOOGLE_button2(){
        return getDriver().findElement(By.xpath("//*[@title='Button na Mag-sign in gamit ang Google']"));
    }

    public WebElement LogGAccount_EnterEmail(){
        return getDriver().findElement(By.xpath("//input[@type='email']"));
    }

    public WebElement LogGAccount_EnterPass(){
        return getDriver().findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
    }

    public WebElement LoginOTP_Account(){
        return getDriver().findElement(By.xpath("//input[@type='tel']"));
    }

    public WebElement LoginTryAnother_Account(){
        return getDriver().findElement(By.xpath(("//span[@class='VfPpkd-vQzf8d'])[2]")));
    }
    public WebElement TypeKPX_User() {
        return getDriver().findElement(By.xpath("//input[@placeholder='Username']"));
    }
    public WebElement TypeKPX_Pass(){
        return getDriver().findElement(By.xpath("//input[@placeholder='PASSWORD']"));
    }
}