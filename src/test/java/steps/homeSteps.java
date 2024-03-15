package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.MoviePage;
import pages.basePage;
import core.Driver;

import java.util.Map;


public class homeSteps extends basePage {
    HomePage homePage = new HomePage();
    MoviePage moviePage = new MoviePage();

    String movie = null;
    String cinemaLocation = null;
    @Given("user is on hoyts home page")
    public void userIsOnHoytsHomePage() {
        Driver.getDriver();
        waitForElementToBeClickable(homePage.getImageLogo());
        clickElement(homePage.getImageLogo());
    }

    @When("user has searched the word {string}")
    public void userHasSearchedTheWord(String string) {
        movie = string;
        waitForElementToBeClickable(homePage.getImageLogo());
        typeTextByElement(homePage.getSearchField(), movie);
        clickElement(homePage.getSearchField());
    }

    @Then("should show the movie that was inserted previously")
    public void shouldShowTheMovieThatWasInsertedPreviously() {
        waitForElementToBeClickable(homePage.getSearchResults());
        Assert.assertEquals(movie, getTextElement(homePage.getSearchResults()));

    }

    @When("user click at Add Cinemas button")
    public void userClickAtAddCinemasButton() throws InterruptedException {
        scrollToElement(homePage.getCinemaButton());
        waitForElementToBeClickable(homePage.getCinemaButton());
        clickElement(homePage.getCinemaButton());
    }

    @And("select and save the following cinemas")
    public void selectAndSaveTheFollowingCinemas(DataTable dataTable) throws InterruptedException {
        Map<String, String> map = dataTable.asMap();
        cinemaLocation = map.get("CinemaLocation");

        waitForElementToBeVisible(Driver.getDriver().findElement(By.xpath("//label[text()=\""+cinemaLocation+" \"]")));
        Driver.getDriver().findElement(By.xpath("//label[text()=\""+cinemaLocation+ " \"]")).click();

        clickElement(homePage.getSaveButton());
    }


    @Then("the location should show up in the section on Now showing section")
    public void theLocationShouldShowUpInTheSectionOnNowShowingSection() {
        Assert.assertEquals(cinemaLocation, getTextElement(homePage.getCinemaLocation()));
        System.out.println(getTextElement(homePage.getCinemaLocation()));
    }

    @When("user click at the first movie option")
    public void userClickAtTheFirstMovieOption() throws InterruptedException {
        scrollToElement(homePage.getMovieInfo());
        waitForElementToBeClickable(homePage.getMovieInfo());
        clickElement(homePage.getMovieInfo());
    }
    @Then("the user should be redirected to the movie page")
    public void theUserShouldBeRedirectedToTheMoviePage() {
        waitForElementToBeClickable(moviePage.getTimeTicket());
        Assert.assertEquals("Times & Tickets", getTextElement( moviePage.getTimeTicket()));
        Assert.assertEquals("Trailer",getTextElement(moviePage.getTrailerLink()));
        Assert.assertEquals("Watchlist",getTextElement(moviePage.getWatchlistLink()));
        Assert.assertEquals("Synopsis",getTextElement(moviePage.getSynopsisSection()));
        Assert.assertEquals("Details",getTextElement(moviePage.getDetailsSection()));
    }



    @After
    public void tearDown(){
        Driver.killDriver();
    }

}
