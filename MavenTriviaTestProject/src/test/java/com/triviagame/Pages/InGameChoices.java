package com.triviagame.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InGameChoices {
	
	WebDriver driver;
	
	By qonefirstgameradiobutton = By.xpath("//*[@id=\"2\"]/input[1]");
	
	By qonesecondgameradiobutton = By.xpath("//*[@id=\"2\"]/input[2]");
	
	By qonethirdgameradiobutton = By.xpath("//*[@id=\"2\"]/input[3]");
	
	By qoneforthgameradiobutton = By.xpath("//*[@id=\"2\"]/input[4]");
	
	By qtwofirstgameradiobutton = By.xpath("//*[@id=\"1\"]/input[1]");
	
	By qtwosecondgameradiobutton = By.xpath("//*[@id=\"1\"]/input[2]");
	
	By qtwothirdgameradiobutton = By.xpath("//*[@id=\"1\"]/input[3]");
	
	By qtwoforthgameradiobutton = By.xpath("//*[@id=\"1\"]/input[4]");
	
	By qthreefirstgameradiobutton = By.xpath("//*[@id=\"0\"]/input[1]");
	
	By qthreesecondgameradiobutton = By.xpath("//*[@id=\"0\"]/input[2]");
	
	By qthreethirdgameradiobutton = By.xpath("//*[@id=\"0\"]/input[3]");
	
	By qthreeforthgameradiobutton = By.xpath("//*[@id=\"0\"]/input[4]");
	
	//Contractor
	
	public InGameChoices(WebDriver driver) {
		this.driver = driver;
	}
	

	public void forQoneClickOnFirstRadioButton() {
		driver.findElement(qonefirstgameradiobutton).click();
	}
	
	public void forQoneClickOnSecondRadioButton() {
		driver.findElement(qonesecondgameradiobutton).click();
	}
	
	public void forQoneClickOnThirdRadioButton() {
		driver.findElement(qonethirdgameradiobutton).click();
	}
	
	public void forQoneClickOnForthRadioButton() {
		driver.findElement(qoneforthgameradiobutton).click();
	}
	
	public void forQtwoClickOnFirstRadioButton() {
		driver.findElement(qtwofirstgameradiobutton).click();
	}
	
	public void forQtwoClickOnSecondRadioButton() {
		driver.findElement(qtwosecondgameradiobutton).click();
	}
	
	public void forQtwoClickOnThirdRadioButton() {
		driver.findElement(qtwothirdgameradiobutton).click();
	}
	
	public void forQtwoClickOnForthRadioButton() {
		driver.findElement(qtwoforthgameradiobutton).click();
	}
	
	public void forQthreeClickOnFirstRadioButton() {
		driver.findElement(qthreefirstgameradiobutton).click();
	}
	
	public void forQthreeClickOnSecondRadioButton() {
		driver.findElement(qthreesecondgameradiobutton).click();
	}
	
	public void forQthreeClickOnThirdRadioButton() {
		driver.findElement(qthreethirdgameradiobutton).click();
	}
	
	public void forQthreeClickOnForthRadioButton() {
		driver.findElement(qthreeforthgameradiobutton).click();
	}
	
	

}
