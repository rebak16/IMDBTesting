import unittest

from selenium import webdriver


class Initialization(unittest.TestCase):

    def init(self):
        self.driver = webdriver.Chrome("/chromedriver.exe")
        self.driver.maximize_window()

    def teardown(self):
        self.driver.quit()
