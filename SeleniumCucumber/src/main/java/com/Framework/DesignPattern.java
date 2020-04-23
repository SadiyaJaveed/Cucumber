package com.Framework;

public class DesignPattern {

	/*
	 * Helper Classes: Singleton design pattern is used in this framework to create
	 * helpers 1. Create private variables 2. Create a private Constructor
	 * (Constructor should be private-so that no other class can create object of
	 * this class) 3. Create a getInstance() method which will give the object of
	 * this class 4. Create custom methods to perform actions
	 */

	/*
	 * Driver Service Class: 1. This class will have the code for launching the
	 * browser as well as creating the instance of Helper class We will create
	 * getter Methods that will return different helper instance 2. This class will
	 * be injected in the Hook class as well as StepDfn class (using Dependency
	 * Injection) 3. In the Hook class we will use the injected object for closing
	 * the webdriver 4. In the Stepdfn class we will use the injected object for
	 * performing actions
	 */

	/*
	 * Page Object Model(POM) classes: 1. For every WebPage in UI create a mapping
	 * class in framework ie., Page class 2. This class is divided in 3 sections:
	 * WebElements: to uniquely identify elements in the page Actions: to perform
	 * actions on those web elements Navigation: to navigate to the next page based
	 * on the action performed 3. Use PageFactory to initialize webelements in the
	 * page 4. Navigate among the pages via creating objects of the page classes
	 */

	/*
	 * Runner class: Make sure to only import TestNG libraries for features, provide
	 * the "path of the Package" for glue, provide the "name of the Package" for
	 * tags, add tag expressions dependency and use 'and' , 'or' , 'not' to run
	 * multiple tags
	 */

	/*
	 * features: to define the feature file path glue: to define the step definition
	 * package tags: to specify the tags to be run plugin: to generate reports..3
	 * types of reports can be generated...html, json, junit dryRun: to scan for
	 * missing implementations without running the tests monochrome: to avoid
	 * unwanted characters in output strict: to run in strict mode ie., if anything
	 * wrong in the program or missing steps then everything will fail and nothing
	 * will be executed
	 */

	/*
	 * Shortcuts: ctrl+shift+o ---shortcut to resolve imports
	 * rightclick>Refactor>Rename ---renames everywhere 
	 * ctrl+space ---shortcut to create constructor etc.. 
	 * ctrl+shift+F ---shortcut to quick format 
	 * F5---shortcut for refresh
	 */

	/*
	 * Maven build phases: 
	 * 1. clean: cmd mvn clean ---this will clean the mvn project and delete everything in target folder 
	 * 2. complie: cmd mvn compile---this will start a fresh compilation 
	 * 3. test: cmd mvn test ---this will run the tests
	 */

	/*
	 * Parallel execution using Maven: Tests and runner need to be present in
	 * src/test/java tests will run parallely in different sessions but on same
	 * browser type add the configuration in maven-surefire-plugin in pom.xml 1.
	 * forkCount - Number of VM to create and run in parallel 2. reuseForks - true:
	 * use any VM that is up for the test false: create a new VM for every test 3.
	 * testFailureIgnore - true: continue the execution despote of failure false:
	 * stop the execution if a test failed 4. includes - to specify the
	 * filename(runner file)
	 */

}
