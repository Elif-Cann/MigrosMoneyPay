package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.MainPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Given("Accept cookies")   //en soldaki cookie kapatır
    public void clickAcceptCookies()   //11 ve 12 aynı olmalı
    {mainPage.clickAcceptCookies();}

    @And("Accept advert")      //en sağdaki  reklamı  kapatır
    public void clickAcceptAdvert()
    {mainPage.clickAcceptAdvert();}

    @And("Close popup")          //yukarıdaki  mavi şeyi  kapatır
    public void clickClosePopup()
    {mainPage.clickClosePopup();}

    @And("Click Pet Shop")          //pet shop tıklar
    public void clickCategory()
    {mainPage.clickCategory();}


    @And("Scroll page {}")
    public void scrollPage(int i)
    {
        mainPage.scrollPage(i);
    }

    @And("Assert {}")
    public void assetText(String searchListPageAssert)
    {
        mainPage.searchListPageAssert(searchListPageAssert);
    }

    @And("Click onerilen")
    public void clickOnerilen()
    {mainPage.clickOnerilen();}

    @And("Click en dusuk")
    public void clickEndDusuk()
    {mainPage.clickEndDusuk();}
}
