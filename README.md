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
