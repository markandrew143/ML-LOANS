package test_manager.test_sorter;

import org.testng.annotations.Test;
import test_manager.base_test.BaseTest;

public class LoginT extends BaseTest {

    @Test(priority = 0, description = "Validate Login as User")
    public void login() throws Exception{
        loginSteps.clicklogintokpx();
        loginSteps.clickLoginGoogle();
        loginSteps.TypeLoginG_account("admin");
//        loginSteps.TypeLoginG_account("AccessKey");
//        loginSteps.clickLoginTryAnotherWay();
        loginSteps.TypeKPX_User("kpx_user");
        loginSteps.TypeKPX_Pass("kpx_user");
        pendingSteps.ClickPendingLoans();
        PendingCreateKYC.ClickCreateKYC();
        PendingCreateKYC.PKYCINFO("Pending_KYC_Info");
        PendingCreateKYC.OrigBranch_Dropdown();
        PendingCreateKYC.LoanType_Dropdown();
        PendingCreateKYC.ChattelFee_Input("Fee");
        PendingCreateKYC.Selection_Dropdown();
        PendingCreateKYC.BankStatement_Upload();
        PendingCreateKYC.MayorsPermit_Upload();
        PendingCreateKYC.AuditFinStatement_Upload();
        PendingCreateKYC.LatestITR_Upload();
        PendingCreateKYC.BillingStatement_Upload();
        PendingCreateKYC.CollateralDetails();
        PendingCreateKYC.CollateralUnit_Dropdown();
        PendingCreateKYC.CollateralVehicle();
        PendingCreateKYC.CollateralOdometer_Upload();
        PendingCreateKYC.Remarks();
    }

    @Test(priority = 1, dependsOnMethods ="login", description = "Validate Login as User")
    public void createLoan(){

    }

    @Test(priority = 2, dependsOnMethods ="createLoan", description = "Validate Login as User")
    public void approvedLoan(){

    }

















//     @Test(priority = 1, description = "To validate Pending Loan.")
//     public void Pendingloan() throws Exception{
//        pendingSteps.ClickPendingLoans();
//     }
    // @Test(priority = 2, description = "To Validate One time pin prompt display on login page")
    // public  void LOGIN_otpPrompt() throws Exception{
    //     loginSteps.otpPrompt();
    // }
    // @Test(priority = 3, description = "To validate the login functionality using an unregistered phone number")
    // public  void LOGIN_loginUnRegisteredMobileNumber() throws Exception{
    //     loginSteps.otpPrompt();
    // }
    // @Test(priority = 4, description = "To Validate proceed button in the \"account not found\" modal redirects to registration page")
    // public  void LOGIN_accountNotFound_Modal() throws Exception{
    //     loginSteps.accountNotFound_Modal();
    // }
    // @Test(priority = 5, description = "To Validate cancel button in the \"account not found \"modal redirects to login page")
    // public  void LOGIN_cancelAccountNotFound_Modal() throws Exception{
    //     loginSteps.cancelAccountNotFound_Modal();
    // }

    // @Test(priority = 6, description = "To Validate Error field messages are present")
    // public  void LOGIN_errorFieldMessages_registration() throws Exception{
    //     loginSteps.errorFieldMessages_registration();
    // }

    // @Test(priority = 7, description = "To Validate One time pin prompt display after clicking register")
    // public  void LOGIN_otpPromptAfterRegister() throws Exception{
    //     loginSteps.otpPromptAfterRegister();
    // }

}