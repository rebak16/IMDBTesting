import unittest

import ddt as ddt

from your_lists_page import YourListsPage
from initialization import Initialization

@ddt
class ListTest(Initialization):

    def setup(self):
        super().setUp()
        self.yourListsPage = YourListsPage(self.driver)
        self.yourListsPage.navigate_to()
        #signInPage.loginWithValidData()


if __name__ == "__main__":
    unittest.main()
