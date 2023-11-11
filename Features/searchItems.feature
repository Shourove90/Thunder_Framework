Feature: serching products

Scenario Outline: serching products in google

Given i am on the google homepage
When i enter the "<Product_name>" in the search bad
And i click on the serch button

Then i can see the search result sucessfully


Examples:

| Product_name |
| Computer     |
| Football     |
| Flower       |
