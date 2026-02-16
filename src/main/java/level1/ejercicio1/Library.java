package level1.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Library {

    private ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public boolean addBook(String title) {
        if (!bookExists(title)) {
            books.add(title);
            return true;
        }
        return false;
    }

    public ArrayList<String> getBooks() {
        return new ArrayList<>(books);
    }

    public String getBookByPosition(int position) {
        if (position < 0 || position >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }
        return books.get(position);
    }

    private boolean bookExists(String title) {
        return books.contains(title);
    }

    public boolean addBookAtPosition(String title, int position) {

        if (!bookExists(title) && position >= 0 && position <= books.size()) {
            books.add(position, title);
            return true;
        }
        return false;
    }

    public boolean removeBook(String title) {
        if (!bookExists(title)) {
            return false;
        }
        books.remove(title);
        return true;
    }

    public ArrayList<String> getSortedBooks() {

        ArrayList<String> sortedBooks = new ArrayList<>(books);

        Collections.sort(sortedBooks);

        return sortedBooks;
    }


}
