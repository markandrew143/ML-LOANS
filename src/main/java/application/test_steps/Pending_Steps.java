package application.test_steps;

import org.openqa.selenium.By;

public class Pending_Steps extends Base_Steps{


    public void ClickPendingLoans(){
        click(pendingPageObject.Pending_Page(), "Go to Pending Loans");
        System.out.println("Pending Loans");
        waitSleep(5000);
        switchToNextTab();
        waitSleep(5000);
    }

    public void ClickCreateKYC(){
        click(pendingPageObject.PcreateKYC_Page(), "Click Pending Create KYC");
        System.out.println("Pending Create KYC");
        switchToNextTab();
        waitSleep(5000);
    }

    //// Pending Create KYC
    public void PKYCINFO (String role) throws Exception {
        type(pendingPageObject.PKYCLname_Page(), "Input Pending LNAME", reader.getKYCLastname(role));
        System.out.println("Input Pending Lastname");
        type(pendingPageObject.PKYCFname_Page(), "Input Pending FNAME", reader.getKYCfirstname(role));
        System.out.println("Input Pending Firstname");
        click(pendingPageObject.PClickSearch_Page(), "Click KYC Search");
        System.out.println("Pending Click KYC Search");
        waitSleep(5000);
        scrollToElement(pendingPageObject.Pending_Page());
        waitSleep(3000);
    }


    //    Pending Original Branch Dropdown
    public void OrigBranch_Dropdown() {
        click(pendingPageObject.POrigBranch_dropdown(), "Option");
        scrollVertically(By.cssSelector("[class=' css-4ljt47-MenuList']"),1000);
        System.out.println("Scroll_down");
        waitSleep(5000);
        click(pendingPageObject.ClickOptionOrigb(), "BRANCH AUTOMATION LOANS");
        System.out.println("Click Orig");
        waitSleep(5000);
    }
    public void LoanType_Dropdown(){
        click(pendingPageObject.Loan_Type(), "Loan Type Option");
        waitSleep(2000);
        click(pendingPageObject.LoanType_Value(), "Car Loan");
        waitSleep(5000);
        scrollToElement(pendingPageObject.DSTFee());
        waitSleep(3000);
    }

    //CHATTEL FEE
    public void ChattelFee_Input (String role){
        type(pendingPageObject.ChattelFee(), "INPUT Chattel Fee", reader.Chattel_fee(role));
        System.out.println("Input Chattel fee");
        type(pendingPageObject.AppraisalFee(), "INPUT Appraisal Fee", reader.Appraisal_fee(role));
        System.out.println("Input Appraisal fee");
        type(pendingPageObject.NotarialFee(), "INPUT Notarial Fee", reader.Notarial_fee(role));
        System.out.println("Input Notarial fee");
        type(pendingPageObject.DSTFee(),"INPUT DST Fee", reader.DST_fee(role));
        System.out.println("Input DST fee");
        scrollToElement(pendingPageObject.Selection());
        waitSleep(2000);
    }

    public void Selection_Dropdown (){
        click(pendingPageObject.Selection(),"Click Selection");
        System.out.println("Click Selection");
        waitSleep(2000);
        click(pendingPageObject.Selection_Value(), "Click Selection Value");
        System.out.println("Click Selection For Business");
        waitSleep(2000);
        scrollToElement(pendingPageObject.BankStatement());
        waitSleep(2000);
    }

    public void BankStatement_Upload(){
        uploadFile(pendingPageObject.BankStatement(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload BankStatement");
        waitSleep(2000);
    }

    public void MayorsPermit_Upload(){
        uploadFile(pendingPageObject.Mayors_Permit(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload Mayors Permit");
        waitSleep(2000);
    }

    public void AuditFinStatement_Upload(){
        uploadFile(pendingPageObject.audit_fin_statements(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  AuditFinStatement");
        waitSleep(2000);
    }

    public void LatestITR_Upload(){
        uploadFile(pendingPageObject.LatestITR(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  LatestITR");
        waitSleep(2000);
    }

    public void BillingStatement_Upload(){
        uploadFile(pendingPageObject.BillingStatement(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  Billing Statement");
        waitSleep(2000);
        scrollToElement(pendingPageObject.CollateralDetails());
        waitSleep(1500);
    }
    public void CollateralDetails(){
        click(pendingPageObject.CollateralDetails(),"Collateral Details Add row");
        System.out.println("Click Collateral Details Add Row");
        waitSleep(2000);
        scrollToElement(pendingPageObject.Remarks());
        waitSleep(2000);
    }

    public void CollateralUnit_Dropdown(){
        selectByVisibleText(pendingPageObject.CollateralUnit(),"China");
        System.out.println("Click Collateral Details Unit China");
        waitSleep(2000);
    }

    public void CollateralVehicle(){
        type(pendingPageObject.CollateralVehicle(), "Type Vehicle","Test Only");
        System.out.println("Input Vehicle");
        type(pendingPageObject.CollateralPrincipalAmount(), "Type Principal Amount", "120");
        System.out.println("Input Principal Amount");
        type(pendingPageObject.CollateralAppraisedAmount(), "Type Appraised Amount", "150");
        System.out.println("Input Principal Amount");
        waitSleep(2000);

    }

    public void CollateralOdometer_Upload(){
        uploadFile(pendingPageObject.CollateralpicOdometer_Upload(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  Vehicle Odometer");
        waitSleep(5000);
    }

    public void Remarks(){
        type(pendingPageObject.Remarks(), "Input Remarks", "Test Only");
        System.out.println("Input Remarks");
        waitSleep(2000);
    }

    //for update
}
