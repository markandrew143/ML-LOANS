package application.test_steps;

import utilities.ReusableComponents.GeneralMethod;
import utilities.PropertyReader.propertyReader;
import application.page_objects.*;
import utilities.FileUtils.FilePathUtils;

public abstract class Base_Steps extends GeneralMethod {

    Login_PageObjects loginPageObjects = new Login_PageObjects();
    public String getFilePath(){
        final String filepath;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            filepath = "src\\test\\java\\resources\\testData.properties";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            filepath = "src/test/java/resources/testData.properties";
        } else {
            filepath = "";
        }
        return filepath;
    }
    final String imgName = "testImage.jpg";

    propertyReader propertyReader = new propertyReader(getFilePath());
    FilePathUtils filePathUtils = new FilePathUtils(imgName);

//    final String filepath2 = "src\\test\\java\\resources\\bankstatesample.jpg";
//
//    propertyReader propertyReader2 = new propertyReader(filepath2);
//    final String imgName2 = "bankstatesample.jpg";
//    FilePathUtils filePathUtils2 = new FilePathUtils(imgName2);

    Pending_PageObject pendingPageObject = new Pending_PageObject();

}