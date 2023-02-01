Feature: Validate A Product Booking Functionality In The Amazon Booking Application

Scenario: Amazon Login
Given User Launch The Amazon Url "https://www.amazon.in/"
When User Navigate To Account and List Field
And User Click The Signin button
And User Enter The Username "+918056367469" In The Username Field
And User Click The Continue button
And User Enter The Password "mouliSMR@07" In The Password Field
Then User Click The Submit button And It Navigate To Amazon Search Page

Scenario: Amazon Search
When User Click On The Mobiles In The Menu Tab
And User Click On The Smarphones&Basicphones In The Menu Category
And User Click On The Ios In The Operating System Checkbox
And User Click On The Apple In The Brands Check Box
And User Click On The Feature DropDown Box
And User Click On The High To Low In The Feature Box
And User Click On The Preferred Apple Iphone
And User Click On The Add To Cart button
Then User Click on The Proceed To Checkout button