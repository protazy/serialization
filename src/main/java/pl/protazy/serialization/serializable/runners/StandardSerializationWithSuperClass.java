package pl.protazy.serialization.serializable.runners;

import pl.protazy.serialization.serializable.model.FunkyBook;

import java.io.*;

public class StandardSerializationWithSuperClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutStream = new ObjectOutputStream(byteArrayOutStream);

        FunkyBook funkyBook = new FunkyBook("Game of Thrones", 700, "song of ice and fire");

        System.out.println("before serialization:");
        System.out.println(funkyBook);

        objectOutStream.writeObject(funkyBook);

        ObjectInputStream objectInStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutStream.toByteArray()));

        FunkyBook afterDeserialization = (FunkyBook) objectInStream.readObject();

        System.out.println("after deserialization:");
        System.out.println(afterDeserialization);
    }
}
