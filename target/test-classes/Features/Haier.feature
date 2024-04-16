Feature: Haier Chat Flow


  Background: Whataspp Chat flow with haier customer button and registrated Number
    Given Whatsapp should be open
    And Send Hi and search Haier in the Searchbox
    
     Scenario: Haier Customer with Demo/Installation Chat Flow
    And Send Haier Customer for Frist Chat flow
    And Send Demo installation for Frist Chat flow
    And Send yes for Confirm below details for Frist Chat flow
    And Send Again yes for registered details correct  for Frist Chat flow
    And Select Refrigerator from the Drop down for Frist Chat Flow
    And Again Select Direct Cool from drop down for Frist Chat Flow
    When Again Send Yes  for Frist Chat Flow
    Then Send Exit  For the Frist Chat flow
