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
import com.triviagame.base.TestBase;
import com.triviagame.utility.BrowserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BoundryValuesTest extends TestBase {

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

	@Test
	void FqFirstQuestionGameBvMult5() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

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

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

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

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

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

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

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

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

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
		QnA.typeSecondAnswer("bbbbb");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqThirdAnswerGameBvMult5() {

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
		QnA.typeThirdAnswer("rrrrr");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqForthAnswerGameBvMult5() {

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
		QnA.typeForthAnswer("uuuuu");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void TqThirdQuestionGameBvMult5() {

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
		QnA.typeSecondAnswer("jjjjj");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqThirdAnswerGameBvMult5() {

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
		QnA.typeThirdAnswer("ccccc");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqForthAnswerGameBvMult5() {

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
		QnA.typeForthAnswer("qqqqq");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void FqFirstQuestionGameBvMult10() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);



		GB.clickStartButton();
		QnA.typeTheQuestion("aaaaaaaaaa");
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
	void FqFirstAnswerGameBvMult10() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("aaaaaaaaaa");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void FqSecondAnswerGameBvMult10() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("bbbbbbbbbb");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void FqThirdAnswerGameBvMult10() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("cccccccccc");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void FqForthAnswerGameBvMult10() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("dddddddddd");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqSecondQuestionGameBvMult10() {

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
		QnA.typeTheQuestion("bbbbbbbbbb");
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
	void SqFirstAnswerGameBvMult10() {

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
		QnA.typeFirstAnswer("gggggggggg");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqSecondAnswerGameBvMult10() {

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
		QnA.typeSecondAnswer("bbbbbbbbbb");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqThirdAnswerGameBvMult10() {

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
		QnA.typeThirdAnswer("rrrrrrrrrr");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqForthAnswerGameBvMult10() {

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
		QnA.typeForthAnswer("uuuuuuuuuu");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void TqThirdQuestionGameBvMult10() {

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
		QnA.typeTheQuestion("cccccccccc");
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
	void TqFirstAnswerGameBvMult10() {

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
		QnA.typeFirstAnswer("wwwwwwwwww");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqSecondAnswerGameBvMult10() {

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
		QnA.typeSecondAnswer("jjjjjjjjjj");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqThirdAnswerGameBvMult10() {

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
		QnA.typeThirdAnswer("cccccccccc");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqForthAnswerGameBvMult10() {

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
		QnA.typeForthAnswer("qqqqqqqqqq");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void FqFirstQuestionGameBvMult20() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);



		GB.clickStartButton();
		QnA.typeTheQuestion("aaaaaaaaaaaaaaaaaaaa");
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
	void FqFirstAnswerGameBvMult20() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("aaaaaaaaaaaaaaaaaaaa");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void FqSecondAnswerGameBvMult20() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("bbbbbbbbbbbbbbbbbbbb");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void FqThirdAnswerGameBvMult20() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("cccccccccccccccccccc");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void FqForthAnswerGameBvMult20() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("dddddddddddddddddddd");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqSecondQuestionGameBvMult20() {

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
		QnA.typeTheQuestion("bbbbbbbbbbbbbbbbbbbb");
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
	void SqFirstAnswerGameBvMult20() {

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
		QnA.typeFirstAnswer("gggggggggggggggggggg");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqSecondAnswerGameBvMult20() {

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
		QnA.typeSecondAnswer("bbbbbbbbbbbbbbbbbbbb");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqThirdAnswerGameBvMult20() {

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
		QnA.typeThirdAnswer("rrrrrrrrrrrrrrrrrrrr");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqForthAnswerGameBvMult20() {

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
		QnA.typeForthAnswer("uuuuuuuuuuuuuuuuuuuu");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void TqThirdQuestionGameBvMult20() {

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
		QnA.typeTheQuestion("cccccccccccccccccccc");
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
	void TqFirstAnswerGameBvMult20() {

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
		QnA.typeFirstAnswer("wwwwwwwwwwwwwwwwwwww");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqSecondAnswerGameBvMult20() {

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
		QnA.typeSecondAnswer("jjjjjjjjjjjjjjjjjjjj");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqThirdAnswerGameBvMult20() {

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
		QnA.typeThirdAnswer("cccccccccccccccccccc");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqForthAnswerGameBvMult20() {

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
		QnA.typeForthAnswer("qqqqqqqqqqqqqqqqqqqq");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void FqFirstQuestionGameBvMult40() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);



		GB.clickStartButton();
		QnA.typeTheQuestion("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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
	void FqFirstAnswerGameBvMult40() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void FqSecondAnswerGameBvMult40() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void FqThirdAnswerGameBvMult40() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("cccccccccccccccccccccccccccccccccccccccc");
		QnA.typeForthAnswer("d");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void FqForthAnswerGameBvMult40() {

		QnA = new QuestionsAndAnswers (driver);
		GB = new GameButtons(driver);
		IGC = new InGameChoices(driver);

		GB.clickStartButton();
		QnA.typeTheQuestion("a");
		GB.clickNextButton();
		QnA.typeFirstAnswer("a");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("dddddddddddddddddddddddddddddddddddddddd");
		QnA.clickFirstRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqSecondQuestionGameBvMult40() {

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
		QnA.typeTheQuestion("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
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
	void SqFirstAnswerGameBvMult40() {

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
		QnA.typeFirstAnswer("gggggggggggggggggggggggggggggggggggggggg");
		QnA.typeSecondAnswer("b");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqSecondAnswerGameBvMult40() {

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
		QnA.typeSecondAnswer("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		QnA.typeThirdAnswer("r");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqThirdAnswerGameBvMult40() {

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
		QnA.typeThirdAnswer("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
		QnA.typeForthAnswer("u");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void SqForthAnswerGameBvMult40() {

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
		QnA.typeForthAnswer("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
		QnA.clickSecondRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("Please type here your question")==true);
	}

	@Test
	void TqThirdQuestionGameBvMult40() {

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
		QnA.typeTheQuestion("cccccccccccccccccccccccccccccccccccccccc");
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
	void TqFirstAnswerGameBvMult40() {

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
		QnA.typeFirstAnswer("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
		QnA.typeSecondAnswer("j");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqSecondAnswerGameBvMult40() {

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
		QnA.typeSecondAnswer("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		QnA.typeThirdAnswer("c");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqThirdAnswerGameBvMult40() {

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
		QnA.typeThirdAnswer("cccccccccccccccccccccccccccccccccccccccc");
		QnA.typeForthAnswer("q");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

	@Test
	void TqForthAnswerGameBvMult40() {

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
		QnA.typeForthAnswer("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
		QnA.clickThirdRadioButton();
		GB.clickNextButton();

		assertEquals(true, driver.getPageSource().contains("You finished")==true);
	}

}
