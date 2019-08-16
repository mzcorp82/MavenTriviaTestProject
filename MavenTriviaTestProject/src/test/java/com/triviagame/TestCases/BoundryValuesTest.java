package com.triviagame.TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.triviagame.Pages.GameButtons;
import com.triviagame.Pages.InGameChoices;
import com.triviagame.Pages.QuestionsAndAnswers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BoundryValuesTest {

	WebDriver driver;



	@BeforeMethod
	public void startBrowser() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://svcollegetest.000webhostapp.com/");
		
		
	}



	@AfterMethod
	void afretAllTest() {
		driver.close();
		driver.quit();
	}

	@Test
	void FqFirstQuestionGameBvMult5() {
	
		QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
		GameButtons GB = new GameButtons(driver);
		InGameChoices IGC = new InGameChoices(driver);



		GB.clickStartButton();
		QnA.typeTheQuestion("aaaaa");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

		@Test
		void FqFirstAnswerGameBvMult5() {
		
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
			
			GB.clickStartButton();
			QnA.typeTheQuestion("a");
			GB.clickNextButton();
			QnA.typeFirstAnswer("aaaaa");
			QnA.typeSecondAnswer("b");
			QnA.typeThirdAnswer("c");
			QnA.typeForthAnswer("d");
			QnA.clickFirstRadioButton();
			GB.clickNextButton();
	
			assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
		}
		
		@Test
		void FqSecondAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
			GB.clickStartButton();
			QnA.typeTheQuestion("a");
			GB.clickNextButton();
			QnA.typeFirstAnswer("a");
			QnA.typeSecondAnswer("bbbbb");
			QnA.typeThirdAnswer("c");
			QnA.typeForthAnswer("d");
			QnA.clickFirstRadioButton();
			GB.clickNextButton();
	
			assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
		}
		
		@Test
		void FqThirdAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
			GB.clickStartButton();
			QnA.typeTheQuestion("a");
			GB.clickNextButton();
			QnA.typeFirstAnswer("a");
			QnA.typeSecondAnswer("b");
			QnA.typeThirdAnswer("ccccc");
			QnA.typeForthAnswer("d");
			QnA.clickFirstRadioButton();
			GB.clickNextButton();
	
			assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
		}
		
		@Test
		void FqForthAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
			GB.clickStartButton();
			QnA.typeTheQuestion("a");
			GB.clickNextButton();
			QnA.typeFirstAnswer("a");
			QnA.typeSecondAnswer("b");
			QnA.typeThirdAnswer("c");
			QnA.typeForthAnswer("ddddd");
			QnA.clickFirstRadioButton();
			GB.clickNextButton();
		
			assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
		}
		
		@Test
		void SqSecondQuestionGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
			GB.clickStartButton();
			QnA.typeTheQuestion("a");
			GB.clickNextButton();
			QnA.typeFirstAnswer("a");
			QnA.typeSecondAnswer("b");
			QnA.typeThirdAnswer("c");
			QnA.typeForthAnswer("d");
			QnA.clickFirstRadioButton();
			GB.clickNextButton();
			QnA.typeTheQuestion("bbbbb");
			GB.clickNextButton();
			QnA.typeFirstAnswer("g");
			QnA.typeSecondAnswer("b");
			QnA.typeThirdAnswer("r");
			QnA.typeForthAnswer("u");
			QnA.clickSecondRadioButton();
			GB.clickNextButton();
			
			assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
		}
		
		@Test
		void SqFirstAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
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
			QnA.typeFirstAnswer("ggggg");
			QnA.typeSecondAnswer("b");
			QnA.typeThirdAnswer("r");
			QnA.typeForthAnswer("u");
			QnA.clickSecondRadioButton();
			GB.clickNextButton();
			
			assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
		}
		
		@Test
		void SqSecondAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
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
			QnA.typeSecondAnswer("bbbbb");
			QnA.typeThirdAnswer("r");
			QnA.typeForthAnswer("u");
			QnA.clickSecondRadioButton();
			GB.clickNextButton();
			
			assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
		}
		
		@Test
		void SqThirdAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
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
			QnA.typeThirdAnswer("rrrrr");
			QnA.typeForthAnswer("u");
			QnA.clickSecondRadioButton();
			GB.clickNextButton();
			
			assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
		}
		
		@Test
		void SqForthAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
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
			QnA.typeForthAnswer("uuuuu");
			QnA.clickSecondRadioButton();
			GB.clickNextButton();
			
			assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
		}
		
		@Test
		void TqThirdQuestionGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
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
			QnA.typeTheQuestion("ccccc");
			GB.clickNextButton();
			QnA.typeFirstAnswer("w");
			QnA.typeSecondAnswer("j");
			QnA.typeThirdAnswer("c");
			QnA.typeForthAnswer("q");
			QnA.clickThirdRadioButton();
			GB.clickNextButton();
			
			assertEquals(true, driver.getPageSource().contains("You finished")==true);
		}
		
		@Test
		void TqFirstAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
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
			QnA.typeFirstAnswer("wwwww");
			QnA.typeSecondAnswer("j");
			QnA.typeThirdAnswer("c");
			QnA.typeForthAnswer("q");
			QnA.clickThirdRadioButton();
			GB.clickNextButton();
			
			assertEquals(true, driver.getPageSource().contains("You finished")==true);
		}
		
		@Test
		void TqSecondAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
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
			QnA.typeSecondAnswer("jjjjj");
			QnA.typeThirdAnswer("c");
			QnA.typeForthAnswer("q");
			QnA.clickThirdRadioButton();
			GB.clickNextButton();
			
			assertEquals(true, driver.getPageSource().contains("You finished")==true);
		}
		
		@Test
		void TqThirdAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
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
			QnA.typeThirdAnswer("ccccc");
			QnA.typeForthAnswer("q");
			QnA.clickThirdRadioButton();
			GB.clickNextButton();
			
			assertEquals(true, driver.getPageSource().contains("You finished")==true);
		}
		
		@Test
		void TqForthAnswerGameBvMult5() {
			
			QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
			GameButtons GB = new GameButtons(driver);
			InGameChoices IGC = new InGameChoices(driver);
	
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
			QnA.typeForthAnswer("qqqqq");
			QnA.clickThirdRadioButton();
			GB.clickNextButton();
			
			assertEquals(true, driver.getPageSource().contains("You finished")==true);
		}
	
}
