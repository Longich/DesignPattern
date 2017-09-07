package iterator.practice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf {
    private List<Book> bookList;
    public BookShelf() {
        bookList = new ArrayList<>();
    }
    public void appendBook(Book book) {
        bookList.add(book);
    }
    public int getSize() {
        return bookList.size();
    }
    public Iterator<Book> getIterator() {
        Iterator<Book> it = bookList.iterator();
        return it;
    }
}
