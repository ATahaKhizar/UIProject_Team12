package pages;


import  org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class userHomepage {
    public userHomepage(){

        PageFactory.initElements(Driver.getdriver(),this);
    }

    //Anasayfa Kullanıcı kayıt linki
    @FindBy(xpath = "//*[text()='Registration']")
    WebElement registrationlink;

    //Registration Name Textbox


    //Home-->Destination/Bangkok experience


}
