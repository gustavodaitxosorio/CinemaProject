package pages;

import core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MoviePage {

    @FindBy(how = How.XPATH, using = "//h2[text()=\"Times & Tickets\"]")
    private WebElement timeTicket;
    @FindBy(how = How.XPATH, using = "//span[text()=\"Trailer\"]")
    private WebElement trailerLink;
    @FindBy(how = How.XPATH, using = "//span[text()=\"Watchlist\"]")
    private WebElement watchlistLink;
    @FindBy(how = How.XPATH, using = "//span[text()=\"Synopsis\"]")
    private WebElement synopsisSection;
    @FindBy(how = How.XPATH, using = "//span[text()=\"Details\"]")
    private WebElement detailsSection;

    public MoviePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getTimeTicket() { return timeTicket;}


    public WebElement getTrailerLink() {
        return trailerLink;
    }

    public WebElement getWatchlistLink() {
        return watchlistLink;
    }

    public WebElement getSynopsisSection() {
        return synopsisSection;
    }

    public WebElement getDetailsSection() {
        return detailsSection;
    }
}
