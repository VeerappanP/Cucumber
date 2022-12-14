package com.nopcommerce.step;

import org.junit.Assert;

import com.base.Browser;
import com.nopcommerce.pom.ThankYouNopCommerce;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClassNopCommerce extends ThankYouNopCommerce {
   
	@Given("user launch the browser")
	public void userLaunchTheBrowser() {
	    browserLaunch(Browser.CHROME);
	}
	
	@Given("user should navigate to nopcommerce url {string}")
	public void userShouldNavigateToNopcommerceUrl(String string) {
	    url(string);
	}
	@Given("user click on register option")
	public void userClickOnRegisterOption() {
	    click(getRegisterHead());
	    
	}
	@Given("user click on male radio button")
	public void userClickOnMaleRadioButton() {
	    click(getMaleRadioButtonRM());
	    
	}
	@Given("user enter first name as {string}")
	public void userEnterFirstNameAs(String string) {
	    sendkeys(getFirstNameRM(), string);
	    
	}
	@Given("user enter last name as {string}")
	public void userEnterLastNameAs(String string) {
	    sendkeys(getLastNameRM(), string);
	    
	}
	@Given("user select date of birth day")
	public void userSelectDateOfBirthDay() {
	    selectByValue(getDateOfBirthDayRM(), "5");
	    
	}
	@Given("user select date of birth month")
	public void userSelectDateOfBirthMonth() {
	    selectByValue(getDateOfBirthMonthRM(), "2");
	    
	}
	@Given("user select date of birth year")
	public void userSelectDateOfBirthYear() {
	    selectByValue(getDateOfBirthYearRM(), "1997");
	    
	}
	@Given("user enter email as {string}")
	public void userEnterEmailAs(String string) {
	    sendkeys(getEmailRM(), string);
	    
	}
	@Given("user enter company name as {string}")
	public void userEnterCompanyNameAs(String string) {
	    sendkeys(getCompanyRM(), string);
	    
	}
	@Given("user enter new password as {string}")
	public void userEnterNewPasswordAs(String string) {
	    sendkeys(getPasswordRegisterRM(), string);
	    
	}
	@Given("user enter confirm password {string}")
	public void userEnterConfirmPassword(String string) {
	    sendkeys(getConfirmPasswordRM(), string);
	    
	}
	@Given("user click on register button")
	public void userClickOnRegisterButton() {
	    click(getRegisterButtonRM());
	    
	}
	@Given("user click on continue button")
	public void userClickOnContinueButton() {
	    click(getContinueButtonAfterRegistrationRM());
	    
	}
	@Given("user mouse hover on computers option")
	public void userMouseHoverOnComputersOption() {
	    actionsMoveToTargetedWebElement(getComputersHead());
	    
	}
	@Given("user click on desktops")
	public void userClickOnDesktops() {
	    actionsClickOnWebElement(getDesktops());
	    
	}
	@Given("user click on Build your own computer")
	public void userClickOnBuildYourOwnComputer() {
	    click(getBuildYourOwnComputer());
	    
	}
	@Given("user select processor type")
	public void userSelectProcessorType() {
	    selectByValue(getProcessor(), "2");
	    
	}
	@Given("user select RAM")
	public void userSelectRAM() {
	    selectByValue(getRam(), "4");
	    
	}
	@Given("user click on HDD radio button")
	public void userClickOnHDDRadioButton() {
	    click(getHdd400gb());
	    
	}
	@Given("user click on os radio button")
	public void userClickOnOsRadioButton() {
	    click(getOsVistaPremium());
	    
	}
	@Given("user click on software radio button")
	public void userClickOnSoftwareRadioButton() {
	    click(getSoftwareMicrosoftOffice());
	    
	}
	@Given("user clear the quantity")
	public void userClearTheQuantity() {
	    clear(getQuantity());
	    
	}
	@Given("user enter quantity of the product as {string}")
	public void userEnterQuantityOfTheProductAs(String string) {
	    sendkeys(getQuantity(), string);
	    
	}
	@Given("user click on add to cart button")
	public void userClickOnAddToCartButton() {
	    click(getAddToCart());
	    
	}
	@Given("user click on shopping cart in the span option")
	public void userClickOnShoppingCartInTheSpanOption() {
	    click(getSpanShoppingCart());
	    
	}
	@Given("user select gift wrapping type")
	public void userSelectGiftWrappingType() {
	    selectByValue(getGiftWrapping(), "2");
	    
	}
	@Given("user click on terms and condition radio button")
	public void userClickOnTermsAndConditionRadioButton() {
	    click(getTermsAndCondition());
	    
	}
	@Given("user click on checkout button")
	public void userClickOnCheckoutButton() {
	    click(getCheckOutButton());
	    
	}
	@Given("user click on Ship to the same address")
	public void userClickOnShipToTheSameAddress() {
	    click(getShipToSameAddressRadioBox());
	    
	}
	@Given("user select country")
	public void userSelectCountry() {
	    selectByValue(getCountry(), "1");
	    
	}
	@Given("user select state")
	public void userSelectState() {
	    selectByValue(getState(), "1");
	    
	}
	@Given("user enter the city as {string}")
	public void userEnterTheCityAs(String string) {
	    
	    sendkeys(getCity(), string);
	}
	@Given("user enter the address1 as {string}")
	public void userEnterTheAddress1As(String string) {
	    sendkeys(getAddress1(), string);
	    
	}
	@Given("user enter the zipcode as {string}")
	public void userEnterTheZipcodeAs(String string) {
	    sendkeys(getZipCode(), string);
	    
	}
	@Given("user enter the phone number as {string}")
	public void userEnterThePhoneNumberAs(String string) {
	    sendkeys(getPhoneNumber(), string);
	    
	}
	@Given("user click on Billing address continue button")
	public void userClickOnBillingAddressContinueButton() {
	    click(getContinueButtonBillingAddress());
		
	}
	
	@Given("user Select a shipping address from your address book or enter a new address")
	public void userSelectAShippingAddressFromYourAddressBookOrEnterANewAddress() {
	    selectByIndex(getSelectShippingAddress(), 0);
	    
	}
	@Given("user click on Shipping address continue button")
	public void userClickOnShippingAddressContinueButton() {
	    click(getContinueButtonShippingAddress());
	    
	}
	@Given("user click on Shipping method continue button")
	public void userClickOnShippingMethodContinueButton() {
	    click(getContinueButtonShipMethode());
	    
	}
	@Given("user click on Payment method continue button")
	public void userClickOnPaymentMethodContinueButton() {
	    click(getContinueButtonPaymentMethode());
	    
	}
	@Given("user click on Payment information continue button")
	public void userClickOnPaymentInformationContinueButton() {
	    click(getContinueButtonPaymentInformation());
	    
	}
	@When("user click on confirm button")
	public void userClickOnConfirmButton() {
	    click(getConfirmButton());
	    
	}
	@Then("the order placing is successfull")
	public void theOrderPlacingIsSuccessfull() {
	    String text = getTextOrderSuccess().getText();
	    Assert.assertEquals(text, "Your order has been successfully processed!");
	    quit();
	}
}
