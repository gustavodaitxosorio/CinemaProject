package pages;

import core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//a[@class=\"dash__logo-link\"]")
    private WebElement imageLogo;
    @FindBy(how = How.XPATH, using = "//input[@class=\"header__search-input\"]")
    private WebElement searchField;
    @FindBy(how = How.XPATH, using = "//a[@class=\"header__search-title\"]")
    private WebElement searchResults;
    @FindBy(how = How.XPATH, using = "//button/span[text()=\"Add cinemas\"]")
    private WebElement cinemaButton;
    @FindBy(how = How.XPATH, using = "//button[text()=\"Save & Browse\"]")
    private WebElement saveButton;
    @FindBy(how = How.XPATH, using = "//span[@class=\"widget__subheading-overflow\"]")
    private WebElement cinemaLocation;
    @FindBy(how = How.XPATH, using = "(//a/img[@class=\"movie-slide__image\"])[1]")
    private WebElement movieInfo;


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getImageLogo() {
    return imageLogo;
    }

    public WebElement getSearchField() {
        return searchField;
    }
    public WebElement getSearchResults() {
        return searchResults;
    }

    public WebElement getCinemaButton() {
        return cinemaButton;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getCinemaLocation() {
        return cinemaLocation;
    }

    public WebElement getMovieInfo() {
    return movieInfo;
    }
}
