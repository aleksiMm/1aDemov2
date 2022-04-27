@shopTest
Feature: Testing eshop

  Background:
    Given Open eshop
    And Accept necessary cookies

  Scenario: Search MSI choose product and go to check out
    Given Search MSI
    When Choose subcategory
    And  Select product
    And Add to cart
    And Go to cart
    And Press buy
    Then Enter asdfrths@mmail.com and continue
    And Choose pickup in store
    And Validate price
    And Put Alek Smith and 23123456





