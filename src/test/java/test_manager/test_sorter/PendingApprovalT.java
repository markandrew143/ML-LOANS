package test_manager.test_sorter;

import org.testng.annotations.Test;
import test_manager.base_test.BaseTest;

public class PendingApprovalT extends BaseTest {

    @Test(priority = 0, description = "Validate Login as User")
    public void login() throws Exception{
        loginSteps.clicklogintokpx();
        loginSteps.clickLoginGoogle();
        loginSteps.TypeLoginG_account("admin");
        loginSteps.TypeKPX_User("kpx_user");
        loginSteps.TypeKPX_Pass("kpx_user");
    }

    @Test(priority = 1, dependsOnMethods ="login", description = "To verify update loan functionality of ML Loan")
    public void createLoan()throws Exception{
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
        PendingCreateKYC.clickSaveAndYes();
        PendingCreateKYC.verifyLoanRef_PendingLoansTab();
    }
}
