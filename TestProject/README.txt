//Project Name: Hudl Website Login Testing with Selenium Webdriver and Page Object Model

//Introduction
//This project demonstrates how to test the login functionality of the Hudl website using
Selenium Webdriver with Page Object Model design pattern on both Windows and Mac platforms.
The project shows how to create a maintainable and scalable test automation framework using
Selenium Webdriver and Page Object Model design pattern.

//Requirements
//In order to use this project, you need to have the following installed:

1. Java Development Kit (JDK) 8 or higher
2. Intellij IDEA
3. Selenium Webdriver Java client library
4. TestNG testing framework
5. ChromeDriver (for Windows and Mac)

//Setup

1. Clone or download the project to your local machine.
2. Open Intellij IDEA and import the project as a Maven project.
3. Download the ChromeDriver executable for Windows or Mac, depending on your platform,
and add it to your system path.
4. Update the ChromeDriver path in the Setup.java file.
5. Run the HomePage.java file to execute the test cases.

//Project Structure
The project follows the Page Object Model design pattern, which separates the test code
from the page code. The project has the following directory structure:
- src/main/java/pages: This directory contains the page classes which represent the web pages
in the application. Each page class has a set of methods that interact with the elements on the page.
- src/main/java/setup: This directory contains the setup class which is responsible for setting up
the driver and other necessary configurations.
- resources/drivers: This directory contains the ChromeDriver executable file for Windows and Mac platforms.
- pom.xml: This is the Maven configuration file which contains the dependencies and build configurations.
- testng.xml: This is the TestNG configuration file which specifies the test suite and test cases.

//Running the Tests
To run the tests, simply run the HomeTest.java file. The tests will be executed on the browser
specified in the Setup.java file, which is Google Chrome by default. You can modify the browser type
and other configurations in the Setup.java file. Total test suite can also be run from the testRunner.xml file.

//Test Cases

Test Case 1 steps:
-Insert the url https://www.hudl.com/en_gb/
- Opens the Hudl website.
-Clicks on the login button.

Expected result : Opens the dropdown menu clicking on the login button.

Test Case 2 steps:
- Clicking on Hudl from the dropdown menu
- Opens the window in a new tab

Expected result: Landing on the Login page.

Test Case 3 steps:
-Enter valid email address
-Enter invalid password
- click login

Expected result: Fail to login

Test Case 4 steps:
-Enter invalid email address
-Enter valid password
- click login

Expected result: Fail to login

Test Case 5 steps:
-Enter valid email address
-Enter valid password
- click login

Expected result: Successfully login to the website.

//Conclusion
This project demonstrates how to create a scalable and maintainable test automation framework
using Selenium Webdriver with Page Object Model design pattern to test the login functionality
of the Hudl website on both Windows and Mac platforms using Intellij with maven repository.
With this framework, you can easily add new test cases and modify existing ones without having
to change the page code.