package pages;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;

public class MainPage extends Utilities {

    public MainPage() {
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(driver), this);
    }

    //Accept Cookies
    @FindBy(css = "[id='accept-all']")
    public WebElement acceptCookies;   // yukardidaki locater buraya atanıyor 21 ve 23 ile aynı olcak 23 parantez içindeki
    public void clickAcceptCookies() {
        elementClick(acceptCookies);   // hazır elementClick methodu içersinde ilgili locatera tıklanıyor
    }

    @FindBy(xpath = "(//*[@data-icon='xmark'])[2]")
    public WebElement acceptAdvert;
    public void clickAcceptAdvert() {
        elementClick(acceptAdvert);
    }

    @FindBy(xpath = "(//*[@data-icon='xmark'])[1]")
    public WebElement closePopup;
    public void clickClosePopup() {
        elementClick(closePopup);
    }

    @FindBy(css = "[alt='Pet Shop']")
    public WebElement selectCategory;
        public void clickCategory() {
            elementClick(selectCategory);
        }

    @FindBy(css = "[class='filter__header'] h2")
    public WebElement searchListPage;
    public void searchListPageAssert(String searchListPageText)
    {
        Assert.assertEquals(searchListPageText,searchListPage.getText());
    }

    public void scrollPage(int i) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,"+i+")");
    }

    @FindBy(xpath = "(//*[@aria-haspopup='listbox'])[2]")
    public WebElement onerilenLocater;
    public void clickOnerilen() {
        elementClick(onerilenLocater);
    }

    @FindBy(xpath = "//*[@id='mat-option-5']")
    public WebElement endDusuk;
    public void clickEndDusuk() {
        elementClick(endDusuk);
    }

}

