Feature: Placing order

  Scenario: Placing order should be successful
    Given user launch the browser
    And user should navigate to nopcommerce url "https://demo.nopcommerce.com/"
    And user click on register option
    And user click on male radio button
    And user enter first name as "Jack"
    And user enter last name as "J"
    And user select date of birth day
    And user select date of birth month
    And user select date of birth year
    And user enter email as "jack7836@gmail.com"
    And user enter company name as "HJ company"
    And user enter new password as "Jack098"
    And user enter confirm password "Jack098"
    And user click on register button
    And user click on continue button
    And user mouse hover on computers option
    And user click on desktops
    And user click on Build your own computer
    And user select processor type
    And user select RAM
    And user click on HDD radio button
    And user click on os radio button
    And user click on software radio button
    And user clear the quantity
    And user enter quantity of the product as "2"
    And user click on add to cart button
    And user click on shopping cart in the span option
    And user select gift wrapping type
    And user click on terms and condition radio button
    And user click on checkout button
    And user click on Ship to the same address
    And user select country
    And user select state
    And user enter the city as "Canada"
    And user enter the address1 as "HU street"
    And user enter the zipcode as "876545"
    And user enter the phone number as "8965778767"
    And user click on Billing address continue button
    And user Select a shipping address from your address book or enter a new address
    And user click on Shipping address continue button
    And user click on Shipping method continue button
    And user click on Payment method continue button
    And user click on Payment information continue button
    When user click on confirm button
    Then the order placing is successfull
