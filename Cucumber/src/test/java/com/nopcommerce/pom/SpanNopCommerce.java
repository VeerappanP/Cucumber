package com.nopcommerce.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpanNopCommerce extends ShoppingCartNopCommerce {
	
	@FindBy(xpath = "//span[@title='Close']")
	private WebElement closeSpan;
	
	@FindBy(xpath = "//a[.='shopping cart']")
	private WebElement spanShoppingCart;

	public WebElement getSpanShoppingCart() {
		return spanShoppingCart;
	}

	public WebElement getCloseSpan() {
		return closeSpan;
	}

}
