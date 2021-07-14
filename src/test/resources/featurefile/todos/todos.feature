@IMDB_Top_Rated_show
Feature: verify the Top Rated show_Functionality


Scenario: Verify Todos text box should be enabled and allow to enter data's
   Given open the valid url in todos application
   Then  Enter the valid search name in search field "Test1"
   Then  Verify todos data is displayed "Test1"
    
Scenario: Verify Completed button should be displayed in Todos screen
   Given open the valid url in todos application
   Then  Enter the valid search name in search field "Test1"
   Then  click completed icon in todos screen
   
  Scenario: verify clear completed should be displayed in Todos screen
   Given open the valid url in todos application
   Then  Enter the valid search name in search field "Test1"
   Then  click clear completed icon in todos screen
   
     Scenario: verify Active should be working properly in Todos screen
   Given open the valid url in todos application
   Then  Enter the valid search name in search field "Test1"
   Then  click the Active button in todos screen
   Then  Verify todos data is displayed "Test1"
   
     Scenario: verify Active should be working properly in Todos screen
   Given open the valid url in todos application
   Then  Enter the valid search name in search field "Test1"
   Then  click the All button in todos screen
   Then  Verify todos data is displayed "Test1"
   
   
   Scenario: Enter Multiple Data in Todos list
   Given open the valid url in todos application
   Then  Enter the valid search name in search field "Test1"
   Then  click the All button in todos screen
   Then  Verify todos data is displayed "Test1"
   Then  Enter the valid search name in search field "Test1"
   Then  click the All button in todos screen
   Then  Verify todos data is displayed "Test1"
   
   
    Scenario Outline: Verify the  characters ,number and special character allowed to be entered into the search box.
    Given open the valid url in todos application
    Then  Enter the Data in search text field "<SearchNames>"
   
   Examples: 
   | SearchNames          |                   
   | New  Test   |
   | 012345678901         |
   | !@%^&&*(**           |
   | ABCSDSDSD2342343242  |
   
    
   #
 #Scenario: Verify Todos text box should be enabled and allow to enter data's
   #Given open the valid url in todos application
   #Then  Enter the valid search name in search field "Test1"
   #Then  Verify todos data is displayed "Test1"

 #Scenario: Verify the Top Rated show icon
    #Given open the valid url in IMDb application 
    #Then  Verify Top Rated shows screen is displayed "Top Rated TV Showss"
    #Then  Verify todos text box  is displayed "What needs to be done?"
   #
   #
  #Scenario: Verify the Top Rated show icon
    #Given open the valid url in IMDb application
    #Then  click the Menu icon in IMDb screen
  #  Then  click the Top Rated Shows icon 
    #Then  Verify Top Rated shows screen is displayed "Top Rated TV Showss"
   #
   #
  #Scenario: Verify Search for ‘Game of thrones’ and select ‘Game of Thrones
    #Given open the valid url in IMDb application
    #Then  Enter the valid search name in search field "Game of thrones"
    #Then click the Game of Thrones The Last Watch link
    #
    #Scenario: Verify Title of the selected episode 
    #Given open the valid url in IMDb application
    #Then  Enter the valid search name in search field "Game of thrones"
    #Then  click the Game of Thrones The Last Watch link
    #Then  Verify the Title of the selected episode "Game of Thrones: The Last Watch (2019)"
    #
    #Scenario: Verify Number of review in Game of Thrones 
    #Given open the valid url in IMDb application
    #Then  Enter the valid search name in search field "Game of thrones"
    #Then  click the Game of Thrones The Last Watch link
    #Then  Verify the number of review in Game of Thrones
    #
    