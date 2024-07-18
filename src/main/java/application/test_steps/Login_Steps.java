package application.test_steps;


import utilities.ReusableComponents.TOTPGenerator;

public class Login_Steps extends Base_Steps{

    public void clicklogintokpx()
    {
        click(loginPageObjects.LOGINKPX_button(), "Login to KPX");
        System.out.println("LOGIN TO KPX QWERTY");
        waitSleep(5000);
//        getWebDriver().navigate().refresh();
    }

    public void clickLoginGoogle()
    {
        click(loginPageObjects.LOGINGOOGLE_button2(), "Login to Google");
        System.out.println("LOGIN TO google");
        waitSleep(5000);
        switchToNextTab();
    }

    public void TypeLoginG_account(String role) throws Exception{
        typeEnter(loginPageObjects.LogGAccount_EnterEmail(), "Gmail Account", reader.getEmailByRole(role));
        waitSleep(5000);
        typeEnter(loginPageObjects.LogGAccount_EnterPass(), "Gmail PassAccount", reader.getPasswordByRole(role));
        waitSleep(5000);
        click(loginPageObjects.clickverification(),"Verification");
        System.out.println("KPX LOGIN");
        typeEnter(loginPageObjects.LoginOTP_Account(), "Gmail OTP", TOTPGenerator.getTwoFactorCode());
        switchToNextTab();
        waitSleep(10000);
        System.out.println("KPX LOGIN");
    }
    public void clickLoginTryAnotherWay() throws Exception{
        click(loginPageObjects.LoginTryAnother_Account(),"Try Another Way ");
        System.out.println(" Click Try Another Way");
        waitSleep(2000);
    }

    public void TypeKPX_User (String role) throws Exception{
        type(loginPageObjects.TypeKPX_User(), "Input KPX USer", reader.getKpxUsername(role));
        System.out.println(" Input Username");
    }

    public void TypeKPX_Pass (String role) throws Exception{
        typeEnter(loginPageObjects.TypeKPX_Pass(), "Input KPX Pass", reader.getKpxPassword(role));
        System.out.println(" Input Password");
        waitSleep(5000);
        switchToNextTab();
        waitSleep(5000);
    }

//      public boolean isInHomePage(){
//        waitSleep(10000);
//        if (isVisible(loginPageObjects.LoginKpx_Account(), "Search KPC Field")) {
//            LoggingUtils.info("Successfully directed to the Homepage");
//            return true;
//        } else {
//            LoggingUtils.error("Failed directed to the Homepage");
//            ExtentReporter.logFail("!isInHomePage", "Failed directed to the Homepage ");
//            return false;
//        }
//    }
}