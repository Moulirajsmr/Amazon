Feature:Validate A product Booking Functionality In Amazon Booking Application

Scenario:Login Amazon
Given User Launch The Amazon Url "https://www.amazon.in/"
When User Navigate To Account And List Field
And User Click The Signin button
And User Enter The Username "+918056367469" In The Username Field
And User Click The Continue button
And User Enter The Password "mouliSMR@07" In the Password Field
Then user Click The Signin Button And It Navigate To Search Page

Scenario:Search Amazon
When User Enter The Fresh In The Menu Tab
And User Click On The Search button
And User Click On The School Bags In The Menu Category 
And User Click On The  American Tourister
And User Click On The preferred Bag
And User Click On The Add To Cart button