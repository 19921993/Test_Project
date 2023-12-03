# Resolver_Project

The provided information describes a basic Cucumber BDD (Behavior-Driven Development) framework used for running automation tests on IntelliJ. Here's a breakdown of the different components and features mentioned:

1. Running Locally:
   - To run the tests locally and generate HTML reports, you need to use the Maven goal `verify`. This will trigger the execution of the Cucumber tests, and the HTML reports will be generated in the `target/cucumber-html-reports` directory.

2. Tags:
   - Tags are used to categorize and selectively run specific scenarios or features. The framework supports custom tags such as `@smoke`, `@regression`, `@test01`, etc. You can pass these tags using the `CukesRunner` Java class to execute specific test scenarios.

3. Browsers:
   - The framework supports different browsers for test execution, which can be configured using the `config.properties` file. Available browser options include `chrome`, `firefox`, and `headless-chrome`.

4. POM (Page Object Model):
   - The framework implements the Page Object Model design pattern. Under the `pages` package, you'll find the `Test_Page` Java class. This class contains the definition and methods related to locating web elements on the page. It also provides dynamic methods to interact with and return web elements.

5. Features:
   - The automation scripts for all test cases are defined in the feature files. These feature files are written in Gherkin language, which is a human-readable format that can be understood by both technical and non-technical stakeholders.

6. StepDefs:
   - The StepDefs package contains the Selenium code for the test cases. It includes the step definitions that map the Gherkin steps to the corresponding automation actions. Additionally, there is a `Hooks` Java class that helps set up the driver before each step and close it after each step. It also captures screenshots in case of errors or defects, which can be viewed in the HTML reports.

7. Utility:
   - The Utility package includes a `Driver` class responsible for creating a web driver instance for each step. It ensures that a new driver is used for each test scenario. Additionally, there is a `ConfigurationReader` class that reads configurations from the `config.properties` file.

Overall, this framework provides a structured approach to writing and executing Cucumber-based BDD tests using Selenium for web automation. It incorporates best practices like the Page Object Model for better maintainability and reusability of code. The HTML reports and screenshot capturing enhance the test reporting and debugging capabilities.
