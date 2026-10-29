
# Drag-and-Drop Test Automation Using Selenium Actions Class

## Project Overview
This project automates drag-and-drop functionality on a web page using Selenium WebDriver and the Actions class in Java.

## Objectives
- Automate drag-and-drop operations.
- Verify that the element is dropped into the correct target.
- Display test results in the terminal.

## Technologies Used
- Java
- Selenium WebDriver
- Maven
- Google Chrome
- Git and GitHub
- Visual Studio Code

## Test Scenario
1. Open the jQuery UI draggable and droppable demo page.
2. Locate the draggable element.
3. Locate the drop target.
4. Perform drag-and-drop using Selenium Actions.
5. Verify that the target displays "Dropped!".

## Run the Project
Compile the project:

    mvn clean compile

Run the Java program:

    mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java "-Dexec.mainClass=com.selenium.DragAndDropTest"

## Expected Result
    Drop result: Dropped!
    TEST PASSED

## Demo Website
https://jqueryui.com/resources/demos/droppable/default.html
