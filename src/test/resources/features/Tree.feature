@Tree
Feature: This feature file contain scenario for the tree module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is successfully logged in

  @Tree
  Scenario: verify tree module homepage
    Given user is on homepage
    When user clicks on get started button in tree module
    Then user is navigated to tree homepage

  @OverviewofTrees
  Scenario: verify Overview of Trees
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Overview of Trees link
    Then user is on Overview of Trees homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @Terminologies
  Scenario: verify Terminologies
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Terminologies link
    Then user is on Terminologies homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @TypesofTrees
  Scenario: verify Types of Trees
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Types of Trees link
    Then user is on Types of Trees homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @TreeTraversals
  Scenario: verify Types of Trees
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Tree Traversals link
    Then user is on Tree Traversals homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @Traversals-Illustration
  Scenario: verify Traversals-Illustration
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Traversals-Illustration link
    Then user is on Traversals-Illustration homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @BinaryTrees
  Scenario: verify Binary Trees
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Binary Trees link
    Then user is on Binary Trees homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @TypesofBinaryTrees
  Scenario: verify Types of Binary Trees
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Types of Binary Trees link
    Then user is on Types of Binary Trees homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @ImplementationinPython
  Scenario: verify Implementation in Python
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Implementation in Python link
    Then user is on Implementation in Python homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @BinaryTreeTraversals
  Scenario: verify Binary Tree Traversals
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Binary Tree Traversals link
    Then user is on Binary Tree Traversals homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @ImplementationofBinaryTrees
  Scenario: verify Implementation of Binary Trees
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Implementation of Binary Trees link
    Then user is on Implementation of Binary Trees homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @ApplicationsofBinarytrees
  Scenario: verify Applications of Binary trees
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Applications of Binary trees link
    Then user is on Applications of Binary trees homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @BinarySearchTrees
  Scenario: verify Binary Search Trees
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Binary Search Trees link
    Then user is on Binary Search Trees homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @ImplementationOfBST
  Scenario: verify Implementation Of BST
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Implementation Of BST link
    Then user is on Implementation Of BST homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
