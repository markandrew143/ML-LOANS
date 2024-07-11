package application.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utilities.Driver.DriverManager.getDriver;

public class Pending_PageObject {
    public WebElement Pending_Page() {
        return getDriver().findElement(By.xpath("//p[@class='pending_loans_link']"));
    }

    // Pending Create KYC
    public WebElement PcreateKYC_Page() {
        return getDriver().findElement(By.xpath("//span[@class='btn btn-success']"));
    }

    //Input KYC Info
    public WebElement PKYCLname_Page() {
        return getDriver().findElement(By.xpath("//input[@placeholder='Last Name']"));
    }

    public WebElement PKYCFname_Page() {
        return getDriver().findElement(By.xpath("//input[@placeholder='First Name']"));
    }

    public WebElement PClickSearch_Page() {

        return getDriver().findElement(By.xpath("(//button[@type='button'])[1]"));
    }

    //Original Branch with dropdown
    public WebElement POrigBranch_dropdown() {
        return getDriver().findElement(By.xpath("(//div[@class=' css-6j8wv5-Input'])[1]"));
    }


    //Original Branch get Value
    public WebElement POrigBranch_Value() {
        return getDriver().findElement(By.xpath("(//div[@class=' css-qc6sy-singleValue'])[1]"));
    }


    //ORIGINATION BRANCH
    public WebElement ClickOptionOrigb() {
        return getDriver().findElement(By.xpath("//div[contains(text(), 'BRANCH AUTOMATION LOANS')]"));
    }

    public WebElement Loan_Type() {
        return getDriver().findElement(By.xpath("(//div[@class=' css-6j8wv5-Input'])[3]"));
    }

    public WebElement LoanType_Value() {
        return getDriver().findElement(By.xpath("//div[contains(text(), 'Car Loan')]"));
    }
    //Successfully Updated Loan Transaction
    public WebElement LoanReference(){
        return getDriver().findElement(By.cssSelector("[placeholder='Loan Reference #']"));
    }

    //  CHATTEL FEE
    public WebElement ChattelFee() {
        return getDriver().findElement(By.xpath("//input[@name='chattel_fee']"));
    }

    public WebElement AppraisalFee() {
        return getDriver().findElement(By.xpath("//input[@name='appraisal_fee']"));
    }

    public WebElement NotarialFee() {
        return getDriver().findElement(By.xpath("//input[@name='notarial_fee']"));
    }

    public WebElement DSTFee() {
        return getDriver().findElement(By.xpath("//input[@name='dst_custom']"));
    }

    //Requirements (Per Selection)
    public WebElement Selection() {
        return getDriver().findElement(By.xpath("(//div[@class=' css-6j8wv5-Input'])[4]"));
    }

    public WebElement Selection_Value() {
        return getDriver().findElement(By.xpath("//div[contains(text(), 'For Business')]"));
    }

    //UploadFile
    public WebElement BankStatement() {
        return getDriver().findElement(By.xpath("//input[@name='bank_book_statement']"));
    }

    public WebElement Mayors_Permit() {
        return getDriver().findElement(By.xpath("//input[@name='mayors_permit\t']"));
    }

    public WebElement audit_fin_statements() {
        return getDriver().findElement(By.xpath("//input[@name='audit_fin_statements\t']"));
    }

    public WebElement LatestITR() {
        return getDriver().findElement(By.xpath("//input[@name='itr_2316']"));
    }

    public WebElement BillingStatement() {
        return getDriver().findElement(By.xpath("//input[@name='billing_statement']"));
    }


    //CollateralDetails
    public WebElement CollateralDetails() {
        return getDriver().findElement(By.xpath("//button[@class='p-2 btn btn-sm btn-primary']"));
    }


    //CollateralDetails Unit
    public WebElement CollateralUnit() {
        return getDriver().findElement(By.xpath("((//select)[3])"));
    }

    public WebElement CollateralVehicle() {
        return getDriver().findElement(By.xpath("(//input[@type='text'])[37]"));
    }


    public WebElement CollateralPrincipalAmount() {
        return getDriver().findElement(By.xpath("(//input[@type='number'])[4]"));
    }

    public WebElement CollateralAppraisedAmount() {
        return getDriver().findElement(By.xpath("(//input[@type='number'])[5]"));
    }

    public WebElement CollateralpicOdometer_Upload() {
        return getDriver().findElement(By.xpath("(//input[@type='file'])[3]"));
    }

    public WebElement Remarks() {
        return getDriver().findElement(By.xpath("//textarea[@placeholder='Remarks']"));
    }

    public WebElement collateralDetails(){
        return getDriver().findElement(By.xpath("//div[@class='jsgrid-grid-body']"));
    }
    public List<WebElement> collateralInputFile(){
        return getDriver().findElements(By.xpath("//td[@class='jsgrid-cell']/div/input"));
    }

    public WebElement saveButton(){
        return getDriver().findElement(By.xpath("//button[contains(text(), 'Save')]"));
    }
    public WebElement insertIcon(){return getDriver().findElement(By.cssSelector("[title='Insert']"));}

    public WebElement savePrompt_msg(){
        return getDriver().findElement(By.cssSelector("[class='swal2-title']"));
    }
    public WebElement yes_btn(){
        return getDriver().findElement(By.cssSelector("[class='swal2-confirm swal2-styled swal2-default-outline']"));
    }

    public WebElement success_msg() {
        return getDriver().findElement(By.xpath("//*[contains(text(), 'Successfully created loan transaction')]"));
    }
    public WebElement firstPendingLoanRef(){
        return getDriver().findElement(By.xpath("(//tr[@level='0']/td[1])[1]"));
    }
    //
}