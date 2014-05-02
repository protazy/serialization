package pl.protazy.serialization.serializable.runners;

import pl.protazy.serialization.serializable.model.Book;

import java.io.*;

public class StandardSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutStream = new ObjectOutputStream(byteArrayOutStream);

        Book bookBeforeSerialization = new Book("Game of Thrones", 700);
        System.out.println(bookBeforeSerialization);
        objectOutStream.writeObject(bookBeforeSerialization);

        ObjectInputStream objectInStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutStream.toByteArray()));

        Book bookAfterDeserialization = (Book) objectInStream.readObject();

        System.out.println(bookAfterDeserialization);
    }

}
