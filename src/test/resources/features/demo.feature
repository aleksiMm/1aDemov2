
@shopTest
  Feature: Testing eshop

    Background: Start the page and accept cookies
      Given Open eshop
      Then Accept necessary cookies

    Scenario:
      Given Search MSI
      And Choose subcategory
      Then Select product
      And Add to cart
      And Go to cart
      And Press buy
      When Enter asdfrths@mmail.com and continue
      And Choose delivery method
      And Validate price
      And Fill customer name surname and phone





