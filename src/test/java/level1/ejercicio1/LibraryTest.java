package level1.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void libraryShouldNotBeNullAfterInstantiation() {
        Library library = new Library();

        assertNotNull(library.getBooks());
    }
    @Test
    void sizeShouldBeCorrectAfterAddingSeveralBooks() {
        Library library = new Library();

        library.addBook("1984");
        library.addBook("Dune");
        library.addBook("The Hobbit");

        assertEquals(3, library.getBooks().size());
    }

    @Test
    void booksShouldBeInCorrectPositionAfterAdding() {
        Library library = new Library();

        library.addBook("1984");
        library.addBook("Dune");
        library.addBook("The Hobbit");

        assertEquals("1984", library.getBookByPosition(0));
        assertEquals("Dune", library.getBookByPosition(1));
        assertEquals("The Hobbit", library.getBookByPosition(2));
    }
    @Test
    void getBookByPositionShouldReturnCorrectTitleWhenPositionIsValid() {
        Library library = new Library();

        library.addBook("1984");
        library.addBook("Dune");

        String book = library.getBookByPosition(1);

        assertEquals("Dune", book);
    }

    @Test
    void getBookByPositionShouldThrowExceptionWhenPositionIsInvalid() {
        Library library = new Library();

        library.addBook("1984");
        library.addBook("Dune");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            library.getBookByPosition(5);
        });
    }
    @Test
    void addBookAtPositionShouldInsertBookInCorrectPosition() {
        Library library = new Library();

        library.addBook("1984");
        library.addBook("Dune");

        boolean result = library.addBookAtPosition("The Hobbit", 1);

        assertTrue(result);
        assertEquals(3, library.getBooks().size());
        assertEquals("1984", library.getBookByPosition(0));
        assertEquals("The Hobbit", library.getBookByPosition(1));
        assertEquals("Dune", library.getBookByPosition(2));
    }
    @Test
    void removeBookShouldReduceSizeWhenBookExists() {
        Library library = new Library();

        library.addBook("1984");
        library.addBook("Dune");
        library.addBook("The Hobbit");

        boolean result = library.removeBook("Dune");

        assertTrue(result);
        assertEquals(2, library.getBooks().size());
        assertEquals("1984", library.getBookByPosition(0));
        assertEquals("The Hobbit", library.getBookByPosition(1));
    }
    @Test
    void addBookShouldNotAllowDuplicates() {
        Library library = new Library();

        library.addBook("1984");
        library.addBook("1984");

        assertEquals(1, library.getBooks().size());
    }
    @Test
    void getSortedBooksShouldReturnAlphabeticallySortedListWithoutModifyingOriginal() {
        Library library = new Library();

        library.addBook("Dune");
        library.addBook("1984");
        library.addBook("The Hobbit");

        var sortedBooks = library.getSortedBooks();

        // Comprobamos que está ordenada
        assertEquals("1984", sortedBooks.get(0));
        assertEquals("Dune", sortedBooks.get(1));
        assertEquals("The Hobbit", sortedBooks.get(2));

        // Comprobamos que la original NO cambió
        assertEquals("Dune", library.getBookByPosition(0));
        assertEquals("1984", library.getBookByPosition(1));
        assertEquals("The Hobbit", library.getBookByPosition(2));
    }
}