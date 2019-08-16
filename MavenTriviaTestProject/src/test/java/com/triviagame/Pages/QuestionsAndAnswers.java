package com.triviagame.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuestionsAndAnswers {

	WebDriver driver;

	By questiontextfield = By.name("question");

	By firstanswertextfield = By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input");

	By secondanswertextfield = By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input");

	By thirdanswertextfield = By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input");

	By forthanswertextfield = By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input");

	By firstradioanswer = By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input");

	By secondradioanswer = By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input");

	By thirdradioanswer = By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input");

	By forthadioanswer = By.xpath("//*[@id=\"answers\"]/div[4]/div[1]/input");

	//Contractor
	public QuestionsAndAnswers(WebDriver driver) {
		this.driver = driver;
	}


	public void typeTheQuestion(String uq) {
		driver.findElement(questiontextfield).sendKeys(uq);
	}

	public void typeFirstAnswer(String ua) {
		driver.findElement(firstanswertextfield).sendKeys(ua);
	}

	public void typeSecondAnswer(String ua) {
		driver.findElement(secondanswertextfield).sendKeys(ua);
	}

	public void typeThirdAnswer(String ua) {
		driver.findElement(thirdanswertextfield).sendKeys(ua);
	}

	public void typeForthAnswer(String ua) {
		driver.findElement(forthanswertextfield).sendKeys(ua);
	}

	public void clickFirstRadioButton() {
		driver.findElement(firstradioanswer).click();
	}

	public void clickSecondRadioButton() {
		driver.findElement(secondradioanswer).click();
	}

	public void clickThirdRadioButton() {
		driver.findElement(thirdradioanswer).click();
	}

	public void clickForthRadioButton() {
		driver.findElement(forthadioanswer).click();
	}


}
