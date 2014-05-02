package pl.protazy.serialization.serializable.runners;

import pl.protazy.serialization.serializable.model.Book;
import pl.protazy.serialization.serializable.model.BookList;

import java.io.*;

public class SerializationWithExplicitWriteObjectCalls {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutStream = new ObjectOutputStream(byteArrayOutStream);

        BookList bookList = new BookList();
        bookList.addBook(new Book("Game of Thrones", 700));
        bookList.addBook(new Book("Clean Code", 450));

        System.out.println("before serialization:");
        System.out.println(bookList);

        objectOutStream.writeObject(bookList);

        ObjectInputStream objectInStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutStream.toByteArray()));

        BookList bookListAfterDeserialization = (BookList) objectInStream.readObject();

        System.out.println("after deserialization:");
        System.out.println(bookListAfterDeserialization);
    }
}
