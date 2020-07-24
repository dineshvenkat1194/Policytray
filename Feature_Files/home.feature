Feature: Testing on home page

  Background: 
    Given User on Policytray homepage

  @navbar
  Scenario: Testing links on navigation bar
    When User clicking the links in navigation bar
      | Maturity Calculator        |
      | Surrender Value Calculator |
      | PA Policy                  |
      | Spot Your Agent            |
      | Apply Online               |
    And Click the blog link
    Then Close the browser

  @widget
  Scenario: Testing links on widgets
    When User clicking the links in Widget that opening in same window
      | Home                  |
      | Amulya Jeevan         |
      | Get Vehicle Details   |
      | Apply policy          |
      | Refer Friends         |
      | Withdrawn Plans       |
      | About Us              |
      | Contact Us            |
      | New Jeevan Anand      |
      | Hiring                |
      | New Endowment Plan    |
      | Single Endowment      |
      | Jeevan Pragati        |
      | Micro Bachat          |
      | Invest 4G             |
      | New Money Back Policy |
      | New BIMA BACHAT       |
      | Jeevan Shiromani      |
      | Bima Shree            |
      | Jeevan Arogya         |
      | iSelect Term Plan     |
      | Anmol Jeevan          |
      | New Child Money Back  |
      | Jeevan Tarun          |
      | New Jeevan Nidhi      |
      | Jeevan Akshay-VI      |
      | Religare Secure PA    |
      | Employee              |
    And User clicking the links in Widget that opening in new window
      | CoverNest             |
      | HDFC Cancer Care Plan |
      | HDFC Term Plan        |
    Then Close the browser

  @container
  Scenario: Testing image links in homepage
    When User clicks personal accident policy image
    And User clicks LIC premium and maturity calculator image
    Then User clicks Life insurance Surrender value calculator
    And User clicks Life insurance loan calculator
    Then User clicks Life insurance calculator image
    And User clicks Agent locator image
    And User clicks Life insurance blog image
    Then User clicks App download link
    Then Close the browser

  @sharinngContainer
  Scenario: Testing Sharing container links
    When User click Facebook sharing
    And User clicks Twitter sharing
    And User clicks LinkedIN sharing
    Then Close the browser

  @socialmediaIcon
  Scenario: Testing on Social media Icons
    When User clicks Facebook Icon
    And User clicks Twitter Icon
    And User clicks Youtube Icon
    Then Close the browser
