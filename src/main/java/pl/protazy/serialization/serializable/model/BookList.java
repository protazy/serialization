package pl.protazy.serialization.serializable.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookList implements Serializable {
    private List<Book> books;

    public BookList() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }


    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.writeInt(books.size());
        for (Book book : books) {
            stream.writeInt(book.getPageCount());
            stream.writeObject(book.getTitle());
        }
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        int size = stream.readInt();
        books = new ArrayList<Book>(size);
        for (int i = 0; i < size; i++) {
            int pageCount = stream.readInt();
            String title = (String) stream.readObject();
            books.add(new Book(title, pageCount));
        }
    }

    @Override
    public String toString() {
        return "BookList{" +
                "books=" + getBooksAsString() +
                '}';
    }

    private String getBooksAsString() {
        StringBuilder sb = new StringBuilder();

        for (Book book : books) {
            sb.append("{");
            sb.append("pageCount='").append(book.getPageCount()).append("'");
            sb.append("title='").append(book.getTitle()).append("'");
            sb.append("}");
        }

        return sb.toString();
    }

    public List<Book> getBooks() {
        return books;
    }

}
