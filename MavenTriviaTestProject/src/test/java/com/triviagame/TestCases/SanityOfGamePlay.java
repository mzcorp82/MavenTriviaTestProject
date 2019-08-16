package com.triviagame.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.triviagame.Pages.GameButtons;
import com.triviagame.Pages.InGameChoices;
import com.triviagame.Pages.QuestionsAndAnswers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SanityOfGamePlay {
	
	@Test
	public void ChromeGameSanity() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://svcollegetest.000webhostapp.com/");
		
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
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://svcollegetest.000webhostapp.com/");
		
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
	
//	@Test
//	public void EdgeGameSanity() {
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://svcollegetest.000webhostapp.com/");
//		
//		QuestionsAndAnswers QnA = new QuestionsAndAnswers (driver);
//		GameButtons GB = new GameButtons(driver);
//		InGameChoices IGC = new InGameChoices(driver);
//		
//		GB.clickStartButton();
//		QnA.typeTheQuestion("a");
//		GB.clickNextButton();
//		QnA.typeFirstAnswer("a");
//		QnA.typeSecondAnswer("b");
//		QnA.typeThirdAnswer("c");
//		QnA.typeForthAnswer("d");
//		QnA.clickFirstRadioButton();
//		GB.clickNextButton();
//		QnA.typeTheQuestion("b");
//		GB.clickNextButton();
//		QnA.typeFirstAnswer("g");
//		QnA.typeSecondAnswer("b");
//		QnA.typeThirdAnswer("r");
//		QnA.typeForthAnswer("u");
//		QnA.clickSecondRadioButton();
//		GB.clickNextButton();
//		QnA.typeTheQuestion("c");
//		GB.clickNextButton();
//		QnA.typeFirstAnswer("w");
//		QnA.typeSecondAnswer("j");
//		QnA.typeThirdAnswer("c");
//		QnA.typeForthAnswer("q");
//		QnA.clickThirdRadioButton();
//		GB.clickNextButton();
//		GB.clickPlayButton();
//		IGC.forQoneClickOnThirdRadioButton();
//		GB.clickGameNextButton();
//		IGC.forQtwoClickOnSecondRadioButton();
//		GB.clickGameNextButton();
//		IGC.forQthreeClickOnFirstRadioButton();
//		
//		driver.quit();
//						
//	}
}
