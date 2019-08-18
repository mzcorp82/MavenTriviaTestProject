package com.triviagame.TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.triviagame.Pages.GameButtons;
import com.triviagame.Pages.InGameChoices;
import com.triviagame.Pages.QuestionsAndAnswers;
import com.triviagame.base.TestBase;
import com.triviagame.utility.BrowserFactory;

public class GamePlayTest extends TestBase{
	
	WebDriver driver;

	QuestionsAndAnswers QnA;
	GameButtons GB;
	InGameChoices IGC;


	@BeforeMethod
	public void startBrowser() {
		
		driver = BrowserFactory.startApplication(driver, "chrome", "https://svcollegetest.000webhostapp.com/");
	}


	@AfterMethod
	void afretAllTest() {
		driver.close();
		driver.quit();
	}

	//Functionality Test
	@Test
	void PopUpFirstMessage() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		try {
			driver.findElement(By.id("nextquest")).click();
		}	
		catch(UnhandledAlertException e) {	
			Assert.fail("Exception " + e);
		}


	}

	@Test
	void PopUpSecondMessage() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		try {
			driver.findElement(By.id("nextquest")).click();
		}	
		catch(UnhandledAlertException e) {	
			Assert.fail("Exception " + e);
		}


	}

	@Test
	void PopUpThirdMessage() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		try {
			driver.findElement(By.id("nextquest")).click();
		}	
		catch(UnhandledAlertException e) {	
			Assert.fail("Exception " + e);
		}


	}

	@Test
	void IsFirstNextButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion(" ");
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true);
	}

	@Test
	void IsFirstBackButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickBackButton();
		
		assertEquals(true, driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true);
	}

	@Test
	void IsSecondNextButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		GB.clickBackButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void IsSecondBackButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		GB.clickBackButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void IsThirdNextButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true);
	}

	@Test
	void IsThirdBackButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		GB.clickBackButton();

		assertEquals(true, driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true);
	}

	@Test
	void IsFourthNextButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void IsFourthBackButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		GB.clickBackButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void IsFifthNextButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true);
	}

	@Test
	void IsFifthBackButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		GB.clickBackButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void IsSixthNextButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void IsSixthBackButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		GB.clickBackButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void IsPlayButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();

		assertEquals(true, driver.getPageSource().contains("Test")==true);
	}

	@Test
	void IsQuitButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickQuitButton();

		assertEquals(true, driver.getPageSource().contains("Test")==true);
	}

	@Test
	void IsSeventhNextButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		GB.clickGameNextButton();

		assertEquals(true, driver.getPageSource().contains("Test")==true);
	}

	@Test
	void IsSeventhBackButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		GB.clickGameBackButton();

		assertEquals(true, driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true);
	}

	@Test
	void IsEighthNextButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		GB.clickGameNextButton();

		assertEquals(true, driver.getPageSource().contains("Test")==true);
	}

	@Test
	void IsEighthBackButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		GB.clickGameBackButton();

		assertEquals(true, driver.getPageSource().contains("Test")==true);
	}

	@Test
	void IsNinthNextButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		IGC.forQtwoClickOnSecondRadioButton();
		GB.clickGameNextButton();
		GB.clickGameNextButton();

		assertEquals(true, driver.getPageSource().contains("Test")==true);
	}

	@Test
	void IsNinthBackButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		IGC.forQtwoClickOnSecondRadioButton();
		GB.clickGameNextButton();
		GB.clickGameBackButton();

		assertEquals(true, driver.getPageSource().contains("Test")==true);
	}

	@Test
	void IsTenthNextButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		IGC.forQtwoClickOnSecondRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();

		assertEquals(true, driver.getPageSource().contains("Sucsses")==true);
	}

	@Test
	void IsTenthBackButtonClickable(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		IGC.forQtwoClickOnSecondRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameBackButton();

		assertEquals(true, driver.getPageSource().contains("Test")==true);
	}

	@Test
	void IsFirstWebPageTurn(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		if(driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
			GB.clickNextButton();
			GB.clickBackButton();
			assertEquals(true, driver.getPageSource().contains("question number: 1")==true);
		}

	}

	@Test
	void IsSecondWebPageTurn(){
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		if(driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
			QnA.typeTheQuestion("b");
			GB.clickNextButton();
			assertEquals(true, driver.getPageSource().contains("question number: 2")==true);
		}


	}

	@Test
	void IsFirstQnASaved() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickBackButton();

		if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!")==true) {
			String firstQnA = driver.findElement(By.name("answer1")).getAttribute("value");
			if (firstQnA.equalsIgnoreCase(" ")) {
				System.out.println("Answer test failed");
			}
			else {
				GB.clickBackButton();
				if(driver.getPageSource().contains("Please type here your question")==true) {
					String firstQuestion = driver.findElement(By.name("question")).getAttribute("value");

					assertEquals(!true, (firstQuestion.equalsIgnoreCase(" ")==true));
				}
			}
		}	
	}

	@Test
	void IsSecondQnASaved() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		if(!driver.getPageSource().contains("question number: 3")==true) {
			String secondQnA = driver.findElement(By.name("answer1")).getAttribute("value");
			if (secondQnA.equalsIgnoreCase(" ")) {
				System.out.println("Answer test failed");
			}
			else {
				GB.clickBackButton();
				if(!driver.getPageSource().contains("question number: 3")==true) {
					String secondQuestion = driver.findElement(By.name("question")).getAttribute("value");

					assertEquals(!true, (secondQuestion.equalsIgnoreCase(" ")==true));
				}
			}
		}
		System.out.println("The test has failed");

	}



	@Test
	void TestWithNumbers() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("1");
		QnA.typeSecondAnswer("3");
		QnA.typeThirdAnswer("7");
		QnA.typeForthAnswer("9");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("5");
		QnA.typeSecondAnswer("7");
		QnA.typeThirdAnswer("3");
		QnA.typeForthAnswer("9");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("85");
		QnA.typeSecondAnswer("78");
		QnA.typeThirdAnswer("99");
		QnA.typeForthAnswer("45");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		IGC.forQtwoClickOnSecondRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();

		assertEquals(true, driver.getPageSource().contains("Sucsses")==true);

	}

	@Test
	void FaildQuastionTest() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnForthRadioButton();
		GB.clickGameNextButton();
		IGC.forQoneClickOnForthRadioButton();
		GB.clickGameNextButton();
		IGC.forQoneClickOnForthRadioButton();
		GB.clickGameNextButton();

		assertEquals(true, driver.getPageSource().contains("Failed")==true);


	}
	@Test
	void StartNewGame() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		IGC.forQtwoClickOnSecondRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();
		GB.clickTryAgainButton();

		assertEquals(true, driver.getPageSource().contains("Test")==true);

	}

	@Test
	void CloseGame() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		IGC.forQtwoClickOnSecondRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();
		GB.clickQuitButton();

		assertEquals(true, driver.findElement(By.xpath("/html/body")).isEnabled()==true);

	}

	@Test
	void FirstRadioButtonTest() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("b");
		QnA.typeSecondAnswer("g");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("c");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("w");
		QnA.typeForthAnswer("q");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();

		assertEquals(true, driver.getPageSource().contains("Sucsses")==true);

	}

	@Test
	void SecondRadioButtonTest() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("b");
		QnA.typeSecondAnswer("a");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("j");
		QnA.typeSecondAnswer("c");
		QnA.typeThirdAnswer("w");
		QnA.typeForthAnswer("q");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();
		
		assertEquals(true, driver.getPageSource().contains("Failed")==true);

	}

	@Test
	void ThirdRadioButtonTest() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("b");
		QnA.typeSecondAnswer("c");
		QnA.typeThirdAnswer("a");
		QnA.typeForthAnswer("d");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("r");
		QnA.typeThirdAnswer("b");
		QnA.typeForthAnswer("u");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("c");
		GB.clickNextButton();
		QnA.typeFirstAnswer("j");
		QnA.typeSecondAnswer("w");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		GB.clickGameNextButton();

		assertEquals(true, driver.getPageSource().contains("Failed")==true);

	}

	@Test
	void IsPageCorrectForFirsQnA() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true) {
			QnA.typeFirstAnswer("a");
			QnA.typeSecondAnswer("b");
			QnA.typeThirdAnswer("c");
			QnA.typeForthAnswer("d");
			QnA.clickFirstRadioButton();
			GB.clickNextButton();
			if(driver.getPageSource().contains("question number: 2")==true) {
				QnA.typeTheQuestion("b");
				GB.clickNextButton();
				GB.clickBackButton();
				if(driver.getPageSource().contains("Please type here your question")==true) {
					GB.clickBackButton();
					if(driver.getPageSource().contains("question number: 1")==true) {
						assertEquals(true, (driver.getPageSource().contains("question number: 1")==true));
						System.out.println("The test for first QnA passed");
						driver.quit();
					}
				}				
			}
		}
	}

	@Test
	void IsPageCorrectForSecondQnA() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		IGC.forQtwoClickOnSecondRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		
		if(driver.getPageSource().contains("question number: 2")==true) {
			QnA.typeTheQuestion("b");
			GB.clickNextButton();
			if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true) {
				QnA.typeFirstAnswer("g");
				QnA.typeSecondAnswer("b");
				QnA.typeThirdAnswer("r");
				QnA.typeForthAnswer("u");
				QnA.clickSecondRadioButton();
				GB.clickNextButton();
				if(driver.getPageSource().contains("question number: 3")==true) {
					QnA.typeTheQuestion("c");
					GB.clickNextButton();
					if(driver.getPageSource().contains("question number: 2")==true) {
						assertEquals(true, (driver.getPageSource().contains("question number: 2")==true));
						System.out.println("The test for second QnA passed");
						driver.quit();
					}
					System.out.println("The test for second QnA has failed");
				}
			}
		}
	}

	//Error Handling
	@Test
	void IncorrectFirstQuestionOfNumbersInput() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("4");
		GB.clickNextButton();
		assertEquals(true, (driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true));
	}

	@Test
	void IncorrectFirstQuestionOfLettersInput() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("א");
		GB.clickNextButton();
		assertEquals(true, (driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true));
	}

	@Test
	void IncorrectSecondQuestionOfNumbersInput() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("6");
		GB.clickNextButton();

		assertEquals(true, (driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true));
	}

	@Test
	void IncorrectSecondQuestionOfLettersInput() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("ט");
		GB.clickNextButton();
		
		assertEquals(true, (driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true));
	}

	@Test
	void IncorrectThirdQuestionOfNumbersInput() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);
		
		
		QnA.typeFirstAnswer("w");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();
		GB.clickPlayButton();
		IGC.forQoneClickOnThirdRadioButton();
		GB.clickGameNextButton();
		IGC.forQtwoClickOnSecondRadioButton();
		GB.clickGameNextButton();
		IGC.forQthreeClickOnFirstRadioButton();
		
		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("9");
		GB.clickNextButton();

		assertEquals(true, (driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true));

	}

	@Test
	void IncorrectThirdQuestionOfLettersInput() {
		
		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("b");
		GB.clickNextButton();
		QnA.typeFirstAnswer("g");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();
		QnA.typeTheQuestion("ט");
		GB.clickNextButton();
		
		assertEquals(true, (driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true));

	}

}


