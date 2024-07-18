package application.test_steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.Collections;
import java.util.List;

public class Pending_Steps extends Base_Steps{
    private String loanRefText;

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
        waitSleep(2000);
        String loanRefText = getValue(pendingPageObject.LoanReference());
        setLoanRefText(loanRefText);
        List<String> loanRefValues = Collections.singletonList(loanRefText);
        reader.writeLoanRef(loanRefValues);
//        waitSleep(5000);
        scrollToElement(pendingPageObject.DSTFee());
        waitSleep(3000);
    }
    public String getLoanRefText() {
        return loanRefText;
    }

    public void setLoanRefText(String loanRefText) {
        this.loanRefText = loanRefText;
    }

    public String getLoanRef(String ref) {
        return ref;
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
//        waitSleep(2000);
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
//        waitSleep(2000);
    }

    public void LatestITR_Upload(){
        uploadFile(pendingPageObject.LatestITR(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  LatestITR");
//        waitSleep(2000);
    }

    public void BillingStatement_Upload(){
        uploadFile(pendingPageObject.BillingStatement(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  Billing Statement");
//        waitSleep(2000);
        scrollToElement(pendingPageObject.CollateralDetails());
        waitSleep(1500);
    }
    public void CollateralDetails(){
        click(pendingPageObject.CollateralDetails(),"Collateral Details Add row");
        System.out.println("Click Collateral Details Add Row");
//        waitSleep(2000);
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
        //scrollHorizontal(pendingPageObject.collateralDetails(), 200);


    }

    public void CollateralOdometer_Upload(){
        //uploadFile(pendingPageObject.CollateralpicOdometer_Upload(), filePathUtils.getAbsolutePath());
        for(WebElement inputFile : pendingPageObject.collateralInputFile()){
            uploadFile(inputFile, filePathUtils.getAbsolutePath());
        }
        click(pendingPageObject.collateralDetails(), "Collateral Body");
        scrollToElement(pendingPageObject.insertIcon());
//        scrollVertically(By.xpath("//div[@class='jsgrid-grid-body']"), 200);
//        for(int i=0; i < 50; i ++){
//            actions.sendKeys(Keys.ARROW_RIGHT).perform();
//            LoggingUtils.info("Arrow Key Right");
//        }
        waitSleep(800);
        click(pendingPageObject.insertIcon(), "Plus Icon");
        System.out.println("get Image Upload  Vehicle Odometer");
        waitSleep(5000);
    }

    public void Remarks(){
        scrollToBottomOfPageWEB();
        type(pendingPageObject.Remarks(), "Input Remarks", "Test Only");
        System.out.println("Input Remarks");
        waitSleep(2000);
    }

    //method for clicking save and yes btn
    public void clickSaveAndYes(){
        //scrollToBottomOfPageWEB();
//        waitSleep(1000);
        click(pendingPageObject.saveButton(), "Save Button");
        waitSleep(1000);
        isVisible(pendingPageObject.savePrompt_msg(), getText(pendingPageObject.savePrompt_msg()));
        click(pendingPageObject.yes_btn(), "Yes Button");
        waitSleep(5000);
        //isVisible(pendingPageObject.success_msg(), getText(pendingPageObject.success_msg()));
    }
    //method to verify in pending loans
    public void verifyLoanRef_PendingLoansTab(){
        if(getLoanRef(getLoanRefText()).equals(getText(pendingPageObject.firstPendingLoanRef()))){
            passTest("Loan Ref is Present or Visible: " + getLoanRef(getLoanRefText()), "Success");
        }
    }
//
//    //-------------------------------------------------------------------------------------------
//    //----------------------MOTOR LOAN ----------------------------------------------------------
//    //===========================================================================================
    public void ClickPendingLoansMotor(){
        click(pendingPageObject.Pending_Page(), "Go to Pending Loans");
        System.out.println("Pending Loans");
        waitSleep(5000);
        switchToNextTab();
        waitSleep(5000);
    }

    public void ClickCreateKYCmotor(){
        click(pendingPageObject.PcreateKYC_Page(), "Click Pending Create KYC");
        System.out.println("Pending Create KYC");
        switchToNextTab();
        waitSleep(5000);
    }

    //// Pending Create KYC
    public void PKYCINFOmotor (String role) throws Exception {
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
    public void OrigBranch_Dropdownmotor() {
        click(pendingPageObject.POrigBranch_dropdown(), "Option");
        scrollVertically(By.cssSelector("[class=' css-4ljt47-MenuList']"),1000);
        System.out.println("Scroll_down");
        waitSleep(5000);
        click(pendingPageObject.ClickOptionOrigb(), "BRANCH AUTOMATION LOANS");
        System.out.println("Click Orig");
        waitSleep(5000);
    }
    public void LoanType_Dropdownmotor(){
        click(pendingPageObject.Loan_Type(), "Loan Type Option");
        waitSleep(2000);
        click(pendingPageObject.LoanType_ValueMotor(), "Motor Loan");
        waitSleep(2000);
        String loanRefText = getValue(pendingPageObject.LoanReference());
        setLoanRefText(loanRefText);
        List<String> loanRefValues = Collections.singletonList(loanRefText);
        reader.writeLoanRef(loanRefValues);
        waitSleep(3000);
    }

//    //CHATTEL FEE
//    public void ChattelFee_Inputmotor (String role){
//        type(pendingPageObject.ChattelFee(), "INPUT Chattel Fee", reader.Chattel_fee(role));
//        System.out.println("Input Chattel fee");
//        type(pendingPageObject.AppraisalFee(), "INPUT Appraisal Fee", reader.Appraisal_fee(role));
//        System.out.println("Input Appraisal fee");
//        type(pendingPageObject.NotarialFee(), "INPUT Notarial Fee", reader.Notarial_fee(role));
//        System.out.println("Input Notarial fee");
//        type(pendingPageObject.DSTFee(),"INPUT DST Fee", reader.DST_fee(role));
//        System.out.println("Input DST fee");
//        scrollToElement(pendingPageObject.Selection());
//        waitSleep(2000);
//    }

    public void Selection_Dropdownmotor () {
        click(pendingPageObject.Selection(), "Click Selection");
        System.out.println("Click Selection");
        waitSleep(2000);
        click(pendingPageObject.Selection_Value(), "Click Selection Value");
        System.out.println("Click Selection For Business");
        waitSleep(2000);
        scrollToElement(pendingPageObject.CollateralDetails());

    }

    public void BankStatement_Uploadmotor(){
        uploadFile(pendingPageObject.BankStatement(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload BankStatement");
        waitSleep(2000);
    }

    public void MayorsPermit_Uploadmotor(){
        uploadFile(pendingPageObject.Mayors_PermitMotor(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload Mayors Permit");
        waitSleep(2000);
    }

    public void DTI_Uploadmotor(){
        uploadFile(pendingPageObject.DTI(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload DTI");
        waitSleep(2000);
    }

    public void AuditFinStatement_Uploadmotor(){
        uploadFile(pendingPageObject.audit_fin_statementsmotor(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  AuditFinStatement");
//        waitSleep(2000);
    }

    public void LatestITR_Uploadmotor(){
        uploadFile(pendingPageObject.LatestITR(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  LatestITR");
//        waitSleep(2000);
    }

    public void BillingStatement_Uploadmotor(){
        uploadFile(pendingPageObject.BillingStatement(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  Billing Statement");
//        waitSleep(2000);
        scrollToElement(pendingPageObject.CollateralDetails());
        waitSleep(1500);
    }
    public void CollateralDetailsmotor() {
        click(pendingPageObject.CollateralDetails(), "Collateral Details Add row");
        System.out.println("Click Collateral Details Add Row");
//        waitSleep(2000);
        scrollToElement(pendingPageObject.Remarks());
        waitSleep(2000);
    }
    public void CollateralVehiclemotor() {
        type(pendingPageObject.CollateralVehiclemotor(), "Type Vehicle", "Motor Test Only");
        System.out.println("Input Vehicle");
        type(pendingPageObject.CollateralPrincipalAmountmotor(), "Type Principal Amount", "100");
        System.out.println("Input Principal Amount");
        type(pendingPageObject.CollateralAppraisedAmountmotor(), "Type Appraised Amount", "110");
        System.out.println("Input Principal Amount");
        waitSleep(2000);
    }

    public void CollateralOdometer_Uploadmotor(){
        //uploadFile(pendingPageObject.CollateralpicOdometer_Upload(), filePathUtils.getAbsolutePath());
        for(WebElement inputFile : pendingPageObject.collateralInputFile()){
            uploadFile(inputFile, filePathUtils.getAbsolutePath());
        }
        click(pendingPageObject.collateralDetails(), "Collateral Body");
        scrollToElement(pendingPageObject.insertIcon());
//        scrollVertically(By.xpath("//div[@class='jsgrid-grid-body']"), 200);
//        for(int i=0; i < 50; i ++){
//            actions.sendKeys(Keys.ARROW_RIGHT).perform();
//            LoggingUtils.info("Arrow Key Right");
//        }
        waitSleep(800);
        click(pendingPageObject.insertIcon(), "Plus Icon");
        System.out.println("get Image Upload  Vehicle Odometer");
        waitSleep(5000);
        scrollToBottomOfPageWEB();
        waitSleep(2000);
    }

    public void Remarksmotor(){
        scrollToBottomOfPageWEB();
        type(pendingPageObject.Remarks(), "Input Remarks", "Test Only");
        System.out.println("Input Remarks");
        waitSleep(2000);
    }

    //method for clicking save and yes btn
    public void clickSaveAndYesmotor(){
        //scrollToBottomOfPageWEB();
//        waitSleep(1000);
        click(pendingPageObject.saveButton(), "Save Button");
        waitSleep(1000);
        isVisible(pendingPageObject.savePrompt_msg(), getText(pendingPageObject.savePrompt_msg()));
        click(pendingPageObject.yes_btn(), "Yes Button");
        waitSleep(5000);
        //isVisible(pendingPageObject.success_msg(), getText(pendingPageObject.success_msg()));
    }
    //method to verify in pending loans
    public void verifyLoanRef_PendingLoansTabmotor(){
        if(getLoanRef(getLoanRefText()).equals(getText(pendingPageObject.firstPendingLoanRef()))){
            passTest("Loan Ref is Present or Visible: " + getLoanRef(getLoanRefText()), "Success");
        }
    }

    //-------------------------------------------------------------------------------------------
//    //----------------------REAL ESTATE LOAN --------------------------------------------------
//    //=========================================================================================

    public void ClickPendingLoansestate(){
        click(pendingPageObject.Pending_Page(), "Go to Pending Loans");
        System.out.println("Pending Loans");
        waitSleep(5000);
        switchToNextTab();
        waitSleep(5000);
    }

    public void ClickCreateKYCestate(){
        click(pendingPageObject.PcreateKYC_Page(), "Click Pending Create KYC");
        System.out.println("Pending Create KYC");
        switchToNextTab();
        waitSleep(5000);
    }

    //// Pending Create KYC
    public void PKYCINFOestate (String role) throws Exception {
        type(pendingPageObject.PKYCLname_Page(), "Input Pending LNAME", reader.getKYCLastname(role));
        System.out.println("Input Pending Lastname");
        type(pendingPageObject.PKYCFname_Page(), "Input Pending FNAME", reader.getKYCfirstname(role));
        System.out.println("Input Pending Firstname");
        click(pendingPageObject.PClickSearch_Page(), "Click KYC Search");
        System.out.println("Pending Click KYC Search");
        waitSleep(5000);
//        scrollToElement(pendingPageObject.Pending_Page());
//        waitSleep(3000);
    }

    //    Pending Original Branch Dropdown
    public void OrigBranch_Dropdownestate() {
        click(pendingPageObject.POrigBranch_dropdown(), "Option");
        scrollVertically(By.cssSelector("[class=' css-4ljt47-MenuList']"),1000);
        System.out.println("Scroll_down");
        waitSleep(5000);
        click(pendingPageObject.ClickOptionOrigb(), "BRANCH AUTOMATION LOANS");
        System.out.println("Click Orig");
        waitSleep(5000);
    }

    public void LoanType_DropdownEstate(){
        click(pendingPageObject.Loan_Type(), "Loan Type Option");
        waitSleep(2000);
        click(pendingPageObject.LoanType_ValueEstate(), "Real Estate Loan");
        waitSleep(2000);
        String loanRefText = getValue(pendingPageObject.LoanReference());
        setLoanRefText(loanRefText);
        List<String> loanRefValues = Collections.singletonList(loanRefText);
        reader.writeLoanRef(loanRefValues);
//        waitSleep(5000);
        scrollToElement(pendingPageObject.DSTFee());
        waitSleep(3000);
    }

    public void RequirementsFEE_Estate(){
        scrollToElement(pendingPageObject.LoanType_ValueEstate());
        type(pendingPageObject.REMortgage_Estate(),"Input Mortgage Fees","130");
        System.out.println("Inout Mortgage FEE");
        type(pendingPageObject.MLInsurance_Estate(),"Input Insurance Fee", "140");
        System.out.println("Inout Insurance FEE");
        type(pendingPageObject.DST_Estate(),"Input DST Fee", "150");
        System.out.println("Inout DST FEE");
        waitSleep(2000);
    }

    public void Selection_Dropdownestate() {
        click(pendingPageObject.Selection(), "Click Selection");
        System.out.println("Click Selection");
        waitSleep(2000);
        click(pendingPageObject.Selection_Value(), "Click Selection Value");
        System.out.println("Click Selection For Business");
        waitSleep(2000);
        scrollToElement(pendingPageObject.CollateralDetails());

    }

    public void BankStatement_Uploadestate(){
        uploadFile(pendingPageObject.BankStatement(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload BankStatement");
        waitSleep(2000);
    }

    public void MayorsPermit_Uploadestate(){
        uploadFile(pendingPageObject.Mayors_PermitMotor(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload Mayors Permit");
        waitSleep(2000);
    }

    public void DTI_Uploadestate(){
        uploadFile(pendingPageObject.DTI(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload DTI");
        waitSleep(2000);
    }

    public void AuditFinStatement_Uploadestate(){
        uploadFile(pendingPageObject.audit_fin_statements(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  AuditFinStatement");
//        waitSleep(2000);
    }

    public void LatestITR_Uploadestate(){
        uploadFile(pendingPageObject.LatestITR(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  LatestITR");
//        waitSleep(2000);
    }

    public void BillingStatement_Uploadestate(){
        uploadFile(pendingPageObject.BillingStatement(), filePathUtils.getAbsolutePath());
        System.out.println("get Image Upload  Billing Statement");
//        waitSleep(2000);
        scrollToElement(pendingPageObject.CollateralDetails());
        waitSleep(1500);
    }

    public void CollateralDetailsestate() {
        click(pendingPageObject.CollateralDetails(), "Collateral Details Add row");
        System.out.println("Click Collateral Details Add Row");
//        waitSleep(2000);
        scrollToElement(pendingPageObject.Remarks());
        waitSleep(2000);
    }

    public void CollaterDetAddrowEstate(){
        type(pendingPageObject.TCTNumberEstate(),"Input TCT","Test123");
        System.out.println("Input TCT Estate");
        type(pendingPageObject.PropertyDescEstate(),"Input Property Description","Tester");
        System.out.println("Input Property Description");
        type(pendingPageObject.PrincipalAmountEstate(),"Input Amount","1000");
        System.out.println("Input Principal Amount");
        type(pendingPageObject.LandTitleEstate(),"Input Land Title","Test");
        System.out.println("Input Land Title");
        waitSleep(2000);
    }

    public void CollateralOdometer_Uploadestate(){
        //uploadFile(pendingPageObject.CollateralpicOdometer_Upload(), filePathUtils.getAbsolutePath());
        for(WebElement inputFile : pendingPageObject.collateralInputFile()){
            uploadFile(inputFile, filePathUtils.getAbsolutePath());
        }
        click(pendingPageObject.collateralDetails(), "Collateral Body");
        scrollToElement(pendingPageObject.insertIcon());
//        scrollVertically(By.xpath("//div[@class='jsgrid-grid-body']"), 200);
//        for(int i=0; i < 50; i ++){
//            actions.sendKeys(Keys.ARROW_RIGHT).perform();
//            LoggingUtils.info("Arrow Key Right");
//        }
        waitSleep(800);
        click(pendingPageObject.insertIcon(), "Plus Icon");
        System.out.println("get Image Upload  Vehicle Odometer");
        waitSleep(5000);
        scrollToBottomOfPageWEB();
        waitSleep(2000);
    }

    public void Remarksestate(){
        scrollToBottomOfPageWEB();
        type(pendingPageObject.Remarks(), "Input Remarks", "Test Only");
        System.out.println("Input Remarks");
        waitSleep(2000);
    }
    //method for clicking save and yes btn
    public void clickSaveAndYesestate(){
        //scrollToBottomOfPageWEB();
//        waitSleep(1000);
        click(pendingPageObject.saveButton(), "Save Button");
        waitSleep(1000);
        isVisible(pendingPageObject.savePrompt_msg(), getText(pendingPageObject.savePrompt_msg()));
        click(pendingPageObject.yes_btn(), "Yes Button");
        waitSleep(5000);
        //isVisible(pendingPageObject.success_msg(), getText(pendingPageObject.success_msg()));
    }

    public void PreprocessFee(){
        type(pendingPageObject.PreprocessingFee(),"Input Fee","1000");
        System.out.println("Input Fee");
        waitSleep(2000);
        click(pendingPageObject.PreprocessSave(),"Save Pre-process Fee");
        System.out.println("Save Pre-process Fee");
        waitSleep(5000);
    }

    //method to verify in pending loans
    public void verifyLoanRef_PendingLoansTabestate(){
        if(getLoanRef(getLoanRefText()).equals(getText(pendingPageObject.firstPendingLoanRef()))){
            passTest("Loan Ref is Present or Visible: " + getLoanRef(getLoanRefText()), "Success");
        }
    }
}
