package test_manager.test_sorter;

import org.testng.annotations.Test;
import test_manager.base_test.BaseTest;

public class PendingApprovalT extends BaseTest {

    @Test(priority = 0, description = "Validate Login as User")
    public void login() throws Exception {
        loginSteps.clicklogintokpx();
        loginSteps.clickLoginGoogle();
        loginSteps.TypeLoginG_account("admin");
        loginSteps.TypeKPX_User("kpx_user");
        loginSteps.TypeKPX_Pass("kpx_user");
    }

    @Test(priority = 1, dependsOnMethods = "login", description = "To verify update loan functionality of ML Loan")
    public void createLoan() throws Exception {
        PendingCreateKYC.ClickPendingLoans();
//        pendingSteps.ClickPendingLoans();
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

    @Test(priority = 2, dependsOnMethods = "createLoan", description = "To verify update loan functionality of ML Loan")
    public void createmotorLoan() throws Exception {
        PendingCreateKYC.ClickPendingLoansMotor();
//        pendingSteps.ClickPendingLoans();
        PendingCreateKYC.ClickCreateKYCmotor();
        PendingCreateKYC.PKYCINFOmotor("Pending_KYC_Info");
        PendingCreateKYC.OrigBranch_Dropdownmotor();
        PendingCreateKYC.LoanType_Dropdownmotor();
//        PendingCreateKYC.ChattelFee_Inputmotor("Fee");
        PendingCreateKYC.Selection_Dropdownmotor();
        PendingCreateKYC.BankStatement_Uploadmotor();
        PendingCreateKYC.MayorsPermit_Uploadmotor();
        PendingCreateKYC.DTI_Uploadmotor();
        PendingCreateKYC.DTI_Uploadmotor();
        PendingCreateKYC.AuditFinStatement_Uploadmotor();
        PendingCreateKYC.LatestITR_Uploadmotor();
        PendingCreateKYC.BillingStatement_Uploadmotor();
        PendingCreateKYC.CollateralDetailsmotor();
        PendingCreateKYC.CollateralVehiclemotor();
        PendingCreateKYC.CollateralOdometer_Uploadmotor();
        PendingCreateKYC.Remarksmotor();
        PendingCreateKYC.clickSaveAndYesmotor();
        PendingCreateKYC.verifyLoanRef_PendingLoansTabmotor();
    }

    @Test(priority = 3, dependsOnMethods = "createmotorLoan", description = "To verify update loan functionality of ML Loan")
    public void createestateLoan() throws Exception {
        PendingCreateKYC.ClickPendingLoansestate();
//        pendingSteps.ClickPendingLoans();
        PendingCreateKYC.ClickCreateKYCestate();
        PendingCreateKYC.PKYCINFOestate("Pending_KYC_Info");
        PendingCreateKYC.OrigBranch_Dropdownestate();
        PendingCreateKYC.LoanType_DropdownEstate();
        PendingCreateKYC.RequirementsFEE_Estate();
        PendingCreateKYC.Selection_Dropdownestate();
        PendingCreateKYC.BankStatement_Uploadestate();
        PendingCreateKYC.MayorsPermit_Uploadestate();
        PendingCreateKYC.DTI_Uploadestate();
        PendingCreateKYC.AuditFinStatement_Uploadestate();
        PendingCreateKYC.LatestITR_Uploadestate();
        PendingCreateKYC.BillingStatement_Uploadestate();
        PendingCreateKYC.CollateralDetailsestate();
        PendingCreateKYC.CollaterDetAddrowEstate();
        PendingCreateKYC.CollateralOdometer_Uploadestate();
        PendingCreateKYC.Remarksestate();
        PendingCreateKYC.clickSaveAndYesestate();
        PendingCreateKYC.PreprocessFee();
        PendingCreateKYC.verifyLoanRef_PendingLoansTabestate();
    }
}
