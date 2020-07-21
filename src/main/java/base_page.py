from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait


class BasePage(object):

    def __init__(self, driver=webdriver.Chrome):
        self.driver = driver
        self.base_url = "https://www.imdb.com/"
        self.TIMEOUT = 10
        self.wait = WebDriverWait(self.driver, self.TIMEOUT)

    def navigate_to(self):
        self.driver.get(self.base_url)
