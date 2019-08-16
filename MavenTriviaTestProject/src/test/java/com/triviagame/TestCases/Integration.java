package com.triviagame.TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.triviagame.Pages.GameButtons;
import com.triviagame.Pages.InGameChoices;
import com.triviagame.Pages.QuestionsAndAnswers;
import com.triviagame.utility.BrowserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Integration {
	
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
		GB.clickToShareOnFacebook();

		assertEquals(true, driver.getPageSource().contains("facebook")==true);
	}

}
