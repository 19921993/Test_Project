# Resolver_Project

Basic cucumber BDD framework used for running automation tests on IntelliJ.

Running locally
To run locally and generate HTML reports, use this maven goal verify. HTML reports should be generated under target/cucumber-html-reports

Tags

You can pass a custom tag using CukesRunner Java class. Available tags are @smoke, @regression, @test01, @test02, @test03, @test04, @test05, @test06.

Browsers
You can pass change using config.properties file. Available browsers are chrome, firefox, headless-chrome.

POM
This framework implements Page Object Model. Under pages package there is Test_Page Java class.
This class has all the WebElements has been located and some methods it helps to create and return WebElements dynamiclly

Features
You can find the automation script for all test cases under the features file
It designs for tech-people and non tech-people

StepDefs
You can find the selenium code for the test cases under this package
There is Hooks Java class it helps to set-up the Driver before any step and close it after any step. In case if there is a error or defect it will take a screenshot for it and you can see it in the HTML report

Utility
It has driver class to create a web driver for every step. And this package has configuration Reader to read from config.properties
