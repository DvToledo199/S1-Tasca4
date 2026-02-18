# S1-Tasca4 – Unit Testing with JUnit 5

## Overview

This repository contains the exercises for S1-Tasca4, focused on automated testing using JUnit 5 and dependency management with Maven.

The project is organized by levels and exercises.

---

# Level 1

## Exercise 1 – Unit Tests with JUnit

### Enunciat original

Crea una classe Java que gestioni una col·lecció de llibres d’una biblioteca. Aquesta classe ha d’oferir les funcionalitats següents:

- Afegir llibres a la col·lecció.
- Recuperar la llista completa de llibres (seguint l’ordre d’inserció).
- Obtenir el títol d’un llibre a partir de la seva posició.
- Afegir un llibre en una posició específica dins la col·lecció.
- Eliminar un llibre pel seu títol.
- Retornar una còpia de la llista ordenada alfabèticament.
- No s’han de permetre llibres amb títols duplicats.

Implementa tests unitaris amb JUnit 5 per validar el comportament de la classe.

Els tests han de cobrir com a mínim:

- La col·lecció no ha de ser nul·la després d’instanciar la classe.
- La mida de la col·lecció és correcta després d’afegir diversos llibres.
- Els llibres es troben a la posició esperada un cop afegits.
- El mètode per obtenir un llibre per posició retorna el títol correcte.
- Afegir un llibre en una posició concreta modifica correctament la col·lecció.
- Eliminar un llibre pel títol redueix la mida de la col·lecció.
- La llista ordenada retorna els llibres en ordre alfabètic sense modificar la col·lecció original.
- No s’han de permetre llibres amb títols duplicats.

---

### Implementation

A `Library` class was implemented following clean code principles and good OOP practices.

Features implemented:

- Book storage using `ArrayList<String>`
- Encapsulation through defensive copies when returning collections
- Prevention of duplicate titles
- Position validation with `IndexOutOfBoundsException`
- Alphabetical sorting without modifying the original list
- Consistent API design using boolean returns for business rules and exceptions for invalid usage

---

### Unit Testing

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

## Exercise 2 – Parameterized Test

### Enunciat original

Crea una classe anomenada `CalculateDNI` que contingui un mètode públic per calcular la lletra corresponent d’un DNI, donat el número (sense lletra).

Crea una classe de test amb JUnit 5 que parametritzi una sèrie de proves per validar el comportament correcte del càlcul.

El test ha de comprovar com a mínim 10 casos de números de DNI diferents amb la seva lletra corresponent, validant que el resultat del mètode coincideix amb el valor esperat.

També s'ha de validar valors invàlids, com números negatius o massa grans, per comprovar que el mètode gestiona correctament aquestes situacions (per exemple, llençant una excepció).

---

### Implementation

A utility class `CalculateDNI` was implemented with:

- A static constant containing the official DNI letter table
- A public static method `calculateDniLetter(int dniNumber)`
- Input validation (negative and out-of-range values)
- `IllegalArgumentException` for invalid inputs

---

### Unit Testing

The test class includes:

- A `@ParameterizedTest` with 10 valid DNI cases
- Validation of expected letters
- A separate test verifying that invalid values throw `IllegalArgumentException`

All tests pass successfully.

---

# Level 2 – AssertJ

This level focuses on writing more expressive and readable assertions using the **AssertJ** library instead of traditional JUnit assertions.

AssertJ provides a fluent API that improves test readability and clarity.

---

## Exercise 1 – Integer Equality and Inequality

### Enunciat original

Una asserció que demostri que el valor de dos objectes sencers és igual, i una altra que indiqui que no ho és.

### Implementation

A test class was created to demonstrate value comparison using AssertJ.

Two `Integer` objects with the same value were compared using:

- `isEqualTo()` to verify equality
- `isNotEqualTo()` to verify inequality

This exercise demonstrates how AssertJ compares object values instead of references.

---

## Exercise 2 – Object Reference Comparison

### Enunciat original

Una asserció que demostri que la referència a un objecte és la mateixa que una altra, i una altra que indiqui que és diferent.

### Implementation

This exercise focuses on reference comparison instead of value comparison.

The following methods were used:

- `isSameAs()` to verify that two variables reference the same object in memory.
- `isNotSameAs()` to verify that two variables reference different objects.

This demonstrates the difference between comparing object references and comparing object values.

---

## Exercise 3 – Array Equality

### Enunciat original

Una asserció que indiqui que dos arrays d'enters són idèntics.

### Implementation

Two integer arrays with identical values and order were created.

The method `isEqualTo()` was used to verify:

- Same size
- Same order
- Same values in each position

AssertJ correctly compares array contents rather than memory references.

---

## Exercise 4 – ArrayList Assertions

### Enunciat original

Crea un ArrayList contenidor de diversos tipus d'objectes. Escriu assercions per verificar:

- L'ordre dels objectes segons inserció
- Que conté els objectes en qualsevol ordre
- Que un objecte apareix només una vegada
- Que no conté un element no afegit

### Implementation

An `ArrayList<Object>` was created containing different types (`String`, `Integer`, `Double`).

The following assertions were used:

- `containsExactly()` to verify exact order
- `containsExactlyInAnyOrder()` to verify elements regardless of order
- `containsOnlyOnce()` to ensure an element appears only once
- `doesNotContain()` to verify absence of a specific element

This exercise demonstrates advanced collection assertions with AssertJ.

---

## Exercise 5 – Map Key Verification

### Enunciat original

Crea un map i verifica que conté una de les key que li afegeix.

### Implementation

A `HashMap<String, Integer>` was created with several key-value pairs.

The method `containsKey()` was used to verify that a specific key exists in the map.

This demonstrates how AssertJ simplifies map validations.

---

## Exercise 6 – Exception Assertion with AssertJ

### Enunciat original

Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol i valida que l'excepció és llançada quan correspon.

### Implementation

An invalid array index access was intentionally triggered.

The method `assertThatThrownBy()` was used to verify that:

- An exception is thrown
- The exception is of type `ArrayIndexOutOfBoundsException`

This shows how AssertJ provides fluent and readable exception validation.

---

## Exercise 7 – Optional Empty Validation

### Enunciat original

Crea un objecte Optional buit i escriu l'asserció correcta per verificar que està buit.

### Implementation

An empty `Optional<String>` was created using `Optional.empty()`.

The method `isEmpty()` was used to verify that the Optional contains no value.

This demonstrates AssertJ's built-in support for Optional validation.

---

## Status

All Level 2 exercises were successfully implemented using AssertJ.

All tests pass correctly.
