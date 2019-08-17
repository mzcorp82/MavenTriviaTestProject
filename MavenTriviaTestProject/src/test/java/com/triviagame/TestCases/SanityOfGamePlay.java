package com.triviagame.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.triviagame.Pages.GameButtons;
import com.triviagame.Pages.InGameChoices;
import com.triviagame.Pages.QuestionsAndAnswers;
import com.triviagame.base.TestBase;
import com.triviagame.utility.BrowserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SanityOfGamePlay extends TestBase {
	
	QuestionsAndAnswers QnA;
	GameButtons GB;
	InGameChoices IGC;
	
	@Test
	public void ChromeGameSanity() {
		
		driver = BrowserFactory.startApplication(driver, "chrome", "https://svcollegetest.000webhostapp.com/");
		
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
		
		driver.quit();
						
	}
	
	@Test
	public void FirefoxGameSanity() {
		
		driver = BrowserFactory.startApplication(driver, "firefox", "https://svcollegetest.000webhostapp.com/");
		
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
		
		driver.quit();
						
	}
}
