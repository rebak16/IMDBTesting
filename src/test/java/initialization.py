import unittest

from selenium import webdriver


class Initialization(unittest.TestCase):

    def init(self):
        self.driver = webdriver.Chrome("/home/rebak/Codecool/Codecool Rooms/Test Automation/Jobhunt/IMDBTesting/src/test/java/chromedriver.exe")
        self.driver.maximize_window()

    def teardown(self):
        self.driver.quit()
