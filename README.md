
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Olivia Freund              |
| Date         | 10/03/2026                 |
| Course       | Fall CS665     	    |
| Assignment # | 1                          |

# Assignment Overview
The objective of this assignment is to design and implement a fully automated beverage vending machine capable of preparing several types of coffee and tea beverages. The system must support Espresso, Americano, Latte Macchiato, Black Tea, Green Tea, and Yellow Tea while allowing customers to customize their beverages with milk and sugar, but no more than three of each. The use of a graphical interface is bypassed, the functionality of the system instead demonstrated and verified through JUnit tests.

The implementation of this application focuses on creating a well-structured, maintainable, and easily extensible code base. Special attention was given to organizing responsibilities among classes, minimizing code duplication, and providing clear documentation to improve readability and future maintenance.

### Assumptions

Several assumptions were made during the design and implementation of the beverage vending machine:

- Every beverage has a predefined base price.
- Milk and sugar may be added to any beverage type.
- Customers may add between 0 and 3 units of milk to a beverage.
- Customers may add between 0 and 3 units of sugar to a beverage.
- Requests that exceed the maximum condiment limits result in an IllegalArgumentException.
- The system does not include a graphical user interface or command-line menu because the assignment specifies that functionality can be demonstrated through JUnit tests.
- Each unit of milk or sugar increases the beverage price by $0.50.
- Beverage creation and customization are handled by the vending machine controller class, which is responsible for enforcing all business rules.

# GitHub Repository Link:
https://github.com/livfreund/cs-665-assignment-1

# Implementation Description 

For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.
--> The implementation was designed with flexibility in mind by separating beverage creation from beverage behavior. The abstract Beverage class contains properties and methods that are shared among all beverage types, while the Coffee and Tea classes extend this functionality through inheritance. New beverage types can be added in the future by updating the BeverageType enumeration and adding the appropriate creation logic within the BeverageMachine class. Existing beverage types can also be removed with minimal impact on the overall system because the beverage creation process is centralized in one location. This approach reduces the amount of code that must be modified when requirements change and allows the application to evolve more easily over time.

- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.
--> The implementation was designed to be simple and easy to understand by giving each class a single, clearly defined responsibility. The Beverage class stores beverage information and common functionality, while the Coffee and Tea classes represent beverage categories. The BeverageMachine class is responsible for creating beverages and validating condiment quantities. The use of meaningful class names, method names, and documentation in the form of clearly defined DocBlocks makes the code easier to read and maintain. Because the responsibilities are clearly separated, future developers can quickly identify where modifications should be made without needing to understand the entire system.

- Describe how you have avoided duplicated code and why it is important.
--> Duplicate code was minimized through the use of inheritance. Common attributes such as beverage name, base price, milk units, and sugar units are stored in the abstract Beverage class rather than being repeated in multiple classes. The Beverage class was created as an abstract class because it serves as a template or blueprint for the subclasses, therefore effectivley reducing the amount of code that is duplicated in this implementation. Similarly, common methods such as addMilk(), addSugar(), and getPrice() are implemented once in the parent class and reused by all beverage types. Avoiding duplicate code is important because it improves maintainability, reduces the likelihood of introducing bugs, and makes updates easier. If a common behavior needs to be changed in the future, the modification can be made in a single location rather than in multiple classes throughout the application.

- If applicable, mention any design patterns you have used and explain why they were
chosen. 
--> N/A

## UML Diagram and Description

The UML diagram for this assignment is included in the submitted zip file. 

The UML diagram represents a simple object-oriented design for a beverage vending machine. The Main class serves as the entry point of the application and interacts with the BeverageMachine class. The BeverageMachine acts as the controller of the system, handling beverage creation and validating that milk and sugar quantities do not exceed the assignment limits. To determine which drink to create, the machine uses the BeverageType enumeration, which contains all supported beverage options: Espresso, Americano, Latte Macchiato, Black Tea, Green Tea, and Yellow Tea.

The abstract Beverage class stores all properties and behaviors that are shared among beverages, including the beverage name, base price, milk units, sugar units, pricing calculations, and condiment methods. The Coffee and Tea classes inherit from Beverage, meaning they automatically receive these shared attributes and methods without duplicating code. This inheritance relationship promotes code reuse and makes the system easier to maintain. If new beverage categories are added in the future, they can extend the Beverage class and reuse the existing functionality, making the design flexible and easy to expand.

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




