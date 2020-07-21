from selenium.webdriver.common.by import By

from base_page import BasePage

class AdvancedTitleSearchPage(BasePage):

    feature_film = (By.XPATH, "//*[text()='Feature Film']")
    TV_movie = (By.XPATH, "//*[text()='TV Movie']")
    release_date_min = (By.XPATH, "//*[@name='release_date-min']")
    release_date_max = (By.XPATH, "//*[@name='release_date-max']")
    user_rating_min = (By.XPATH, "//*[@name='user_rating-min']")
    user_rating_max = (By.XPATH, "//*[@name='user_rating-max']")
    voting_number_min = (By.XPATH, "//*[@name='num_votes-min']")
    voting_number_max = (By.XPATH, "//*[@name='num_votes-max']")
    select_countries = (By.XPATH, "//*[@name='countries']")
    exclude_my_ratings = (By.XPATH, "//*[@id='my_ratings|exclude']")
    exclude_your_watchlist_and_megunhatatlan = (By.XPATH, "//*[@name='!lists']")
    search_count = (By.XPATH, "//*[@id='search-count']")
    sort = (By.XPATH, "//*[@name='sort']")
    search_button = (By.XPATH, "//*[text()='Search']")



    def __init__(self, driver):
        super().__init__(driver)

    def select_film_and_movie(self):
        self.driver.find_element(*self.feature_film).click()
        self.driver.find_element(*self.TV_movie).click()

    def fill_release_date_min_and_max(self):
        self.driver.find_element(*self.release_date_min).send_keys()
        self.driver.find_element(*self.release_date_max).send_keys()

    public Select selectMinRating(){
        wait.until(ExpectedConditions.elementToBeClickable(userRatingMin));
        return new Select(userRatingMin);
    }

    public Select selectMaxRating(){
        wait.until(ExpectedConditions.elementToBeClickable(userRatingMax));
        return new Select(userRatingMax);
    }

    public void setUserRatingMinOption(String minRatingPar){
        selectMinRating().selectByVisibleText(minRatingPar);
    }

    public void setUserRatingMaxOption(String maxRatingPar){
        selectMaxRating().selectByVisibleText(maxRatingPar);
    }

    public void fillVotes(String votingNumberMinPar, String votingNumberMaxPar){
        wait.until(ExpectedConditions.elementToBeClickable(votingNumberMin));
        votingNumberMin.sendKeys(votingNumberMinPar);
        votingNumberMax.sendKeys(votingNumberMaxPar);
    }

    public Select selectCountries(){
        return new Select(selectCountries);
    }

    public void setSelectCountries(){
        selectCountries().selectByVisibleText("United States");
    }

    public void deselectMyRatingsMovies(){
        excludeMyRatings.click();
    }

    public Select selectYourWatchlist(){
        return new Select(excludeYourWatchlistAndMegunhatatlan);
    }

    public void setSelectYourWatchlistAndMegunhatatlan(){
        selectYourWatchlist().selectByVisibleText("Your Watchlist");
        selectYourWatchlist().selectByVisibleText("Megunhatatlan");
    }

    public Select selectTitlesPerPage(){
        return new Select(searchCount);
    }

    public void setTitlePerPage(){
        selectTitlesPerPage().selectByVisibleText("250 per page");
    }

    public Select selectSort(){
        return new Select(sort);
    }

    public void setSorting(){
        selectSort().selectByVisibleText(" Release Date Ascending");
    }

    public void clickOnSearch(){
        searchButton.click();
    }

}
