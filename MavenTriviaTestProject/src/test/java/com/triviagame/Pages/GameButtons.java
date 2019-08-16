package com.triviagame.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GameButtons {
	
	WebDriver driver;
	
	By startbutton = By.id("startB");
	
	By nextbutton = By.id("nextquest");
	
	By backButton = By.id("backquest");
	
	By playbutton = By.xpath("//*[@id=\"secondepage\"]/center/button[1]");
	
	By quitbutton = By.xpath("//*[@id=\"secondepage\"]/center/button[2]");
	
	By gamenextbutton = By.id("btnnext");
	
	By gamebackbutton = By.id("btnback");
	
	By tryagainbutton = By.xpath("//*[@id=\"markpage\"]/center/button[1]");
	
	By shareonfacebook = By.xpath("//*[@id=\"fackBook2\"]/img");
	
	//Contractor
	public GameButtons(WebDriver driver) {		
		this.driver = driver;		
	}
	

	public void clickStartButton() {
		driver.findElement(startbutton).click();
	}
	
	public void clickNextButton() {
		driver.findElement(nextbutton).click();
	}
	
	public void clickBackButton() {
		driver.findElement(backButton).click();
	}
	
	public void clickPlayButton() {
		driver.findElement(playbutton).click();
	}
	
	public void clickQuitButton() {
		driver.findElement(quitbutton).click();
	}
	
	public void clickGameNextButton() {
		driver.findElement(gamenextbutton).click();
	}
	
	public void clickGameBackButton() {
		driver.findElement(gamebackbutton).click();
	}
	
	public void clickTryAgainButton() {
		driver.findElement(tryagainbutton).click();
	}
	
	public void clickToShareOnFacebook() {
		driver.findElement(shareonfacebook).click();
	}

}
