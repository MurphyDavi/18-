package TestFire;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testfireLogin {
    WebDriver driver;
    @FindBy(id="LoginLink")
    WebElement signIn;

    @FindBy(id="uid")
    WebElement userName;

    @FindBy(id="passw")
    WebElement password;

    @FindBy(name="btnSubmit")
    WebElement login;

    @FindBy(xpath= "/html/body/table[2]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/span/table/tbody/tr[1]/td/h2")
//    @FindBy(id="AccountLink")
    WebElement titleText;

    public testfireLogin(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickSignIn(){
        signIn.click();
    }

    public void setUserName(String strName){
        userName.sendKeys(strName);
    }

    public void setPassword(String strPassword){
        password.sendKeys(strPassword);
    }

    public void clickLogin() {
        login.click();
    }

    public String getLoginTitle(){
        return titleText.getText();
    }

    public void loginTo(String strName,String strPassword){
        this.clickSignIn();
        this.setUserName(strName);
        this.setPassword(strPassword);
        this.clickLogin();
    }
}
