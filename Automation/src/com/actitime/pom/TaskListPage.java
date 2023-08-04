package com.actitime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNameTbx;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement DescriptionTbx;
	@FindBy(xpath = "//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement CustomerDropdown;
	@FindBy(xpath = "//div[text()='Big Bang Company' and @class='text']")
	private WebElement SelectBigBank;
	@FindBy(xpath ="//div[text()='Create Customer']")
	private WebElement  CreateCustomerBtn;
	

}
