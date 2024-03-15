#@automated
Feature: Site hoyts Scenario

  Rule: Computer Scenarios
    Background:
      Given user is on hoyts home page

    @automated
    Scenario: Search functionality must match word entered
      When user has searched the word "Wonka"
      Then should show the movie that was inserted previously

    @automated
    Scenario Outline: Add cinemas must match selected locations on Now showing section
      When user click at Add Cinemas button
      And select and save the following cinemas
        | Field          | Value            |
        | CinemaLocation | <CINEMALOCATION> |
      Then the location should show up in the section on Now showing section
      Examples:
        | Example    | CINEMALOCATION |
        | Scenario 1 | Ormiston       |

    @automated
    Scenario: Now showing section option must open movie page
      When user click at the first movie option
      Then the user should be redirected to the movie page

  Rule: Mobile Scenarios
    Background:
      Given user is on hoyts mobile web page

    Scenario: Mobile - Chatbot simple phrase
      When user tap at the chat button
      And type the following sentence "Hello"
      Then the chatbot should answer "Hello, how can I help you ?"

    Scenario: Mobile - Tap and hold up should scroll down the page
      When user tap and hold on the screen
      And swipe up on the screen
      Then the site should respond by swiping down
