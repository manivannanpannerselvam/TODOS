$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/IMDB/Top_Rated_shows.feature");
formatter.feature({
  "line": 2,
  "name": "verify the Top Rated show_Functionality",
  "description": "",
  "id": "verify-the-top-rated-show-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@IMDB_Top_Rated_show"
    }
  ]
});
formatter.before({
  "duration": 6695634700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify the Top Rated show icon",
  "description": "",
  "id": "verify-the-top-rated-show-functionality;verify-the-top-rated-show-icon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "open the valid url in IMDb application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click the Menu icon in IMDb screen",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click the Top Rated Shows icon",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify Top Rated shows screen is displayed \"Top Rated TV Showss\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search_Test_step.open_the_valid_url_in_IMDb_application()"
});
formatter.result({
  "duration": 6222568900,
  "status": "passed"
});
formatter.match({
  "location": "Top_Rated_movie_step.click_the_Menu_icon_in_IMDb_screen()"
});
formatter.result({
  "duration": 340866000,
  "status": "passed"
});
formatter.match({
  "location": "Top_Rated_movie_step.click_the_Top_Rated_Shows_icon()"
});
formatter.result({
  "duration": 13627368900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Top Rated TV Showss",
      "offset": 44
    }
  ],
  "location": "Top_Rated_movie_step.verify_Top_Rated_shows_screen_is_displayed(String)"
});
formatter.result({
  "duration": 46602000,
  "error_message": "java.lang.AssertionError: Top_Rated_movie_step is fail expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat com.cucumber.framework.stepdefinition.IMDb_step.Top_Rated_movie_step.verify_Top_Rated_shows_screen_is_displayed(Top_Rated_movie_step.java:45)\r\n\tat ✽.Then Verify Top Rated shows screen is displayed \"Top Rated TV Showss\"(featurefile/IMDB/Top_Rated_shows.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4825448000,
  "status": "passed"
});
});