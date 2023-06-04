Feature: Amazon product search 
Scenario: Login to amazon
    Given navigate to amazon website 
    When user need to select the profile and click sign in bar 
    Then enter email id "8124600449"
    Then enter the password "baparun" 
    And click enter

#Scenario: search the product 
 #   Given navigate to amazon website 
 #  When user need to select the search bar 
  #  Then enter the product name and click search 
   # And view the product 
   