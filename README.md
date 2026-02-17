# S1-Tasca4 – Unit Testing with JUnit 5

## Overview

This repository contains the exercises for S1-Tasca4, focused on automated testing using JUnit 5 and dependency management with Maven.

The project is organized by levels and exercises.

---

# Level 1

## Exercise 1 – Unit Tests with JUnit

### Original Statement

Create a Java class that manages a collection of books in a library.  
The class must provide the following functionalities:

- Add books to the collection.
- Retrieve the full list of books (in insertion order).
- Get the title of a book by its position.
- Add a book at a specific position in the collection.
- Remove a book by its title.
- Return a copy of the list sorted alphabetically.
- Duplicate titles must not be allowed.

Additionally, implement unit tests using JUnit 5 to validate the behavior of the class.

The tests must cover at least:

- The collection must not be null after instantiating the class.
- The collection size is correct after adding several books.
- Books are stored in the expected position.
- Getting a book by position returns the correct title.
- Adding a book at a specific position modifies the collection correctly.
- Removing a book reduces the collection size.
- The sorted list returns books in alphabetical order without modifying the original collection.
- Duplicate book titles are not allowed.

---

## Implementation

A `Library` class was implemented following clean code principles and good OOP practices.

Features implemented:

- Book storage using `ArrayList<String>`
- Encapsulation through defensive copies when returning collections
- Prevention of duplicate titles
- Position validation with `IndexOutOfBoundsException`
- Alphabetical sorting without modifying the original list
- Consistent API design using boolean returns for business rules and exceptions for invalid usage

---

## Unit Testing

Comprehensive unit tests were implemented in `LibraryTest`.

Tested scenarios include:

- Library initialization
- Collection size validation
- Insertion order correctness
- Valid and invalid access by position
- Insert book at a specific position
- Remove book by title
- Duplicate prevention
- Alphabetical sorting without modifying the original collection

All tests pass successfully.

---
