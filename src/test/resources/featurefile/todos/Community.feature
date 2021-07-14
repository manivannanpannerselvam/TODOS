@IMDB_Create_account
Feature: verify the account by filling the registration

   Scenario: Verify Todos text box should be enabled and allow to enter data's
   Given open the valid url in todos application
   Then  Verify Twitter data is displayed "Twitter"
   Then  I click Twitter icon in Community Screen
  
   Scenario: Verify Todos text box should be enabled and allow to enter data's
   Given open the valid url in todos application
   Then  Verify Gitter channel data is displayed "Gitter Channel"
   Then  I click Gitter channel icon in Community Screen
   
   Scenario: Verify Todos text box should be enabled and allow to enter data's
   Given open the valid url in todos application
   Then  Verify Discussion on github data is displayed "Discussions on GitHub"
   Then  I click Discussionn github icon in Community Screen
   