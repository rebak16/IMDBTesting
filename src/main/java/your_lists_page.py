from selenium.webdriver.common.by import By

from base_page import BasePage


class YourListsPage(BasePage):

    megunhatatlan = (By.XPATH, "//*[text()='Megunhatatlan']")
    check_movie = (By.XPATH, "//*[text()='Inglourious Basterds']")

    def __init__(self, driver):
        super().__init__(driver)

    def click_on_megunhatatlan(self):
        self.driver.find_element(*self.megunhatatlan).click()
