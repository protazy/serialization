package pl.protazy.serialization.serializable.runners;

import pl.protazy.serialization.serializable.model.Singleton;

import java.io.*;

public class SerializationWithReadResolve {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutStream = new ObjectOutputStream(byteArrayOutStream);

        Singleton singleton = Singleton.getInstance();

        System.out.println("before serialization:");
        System.out.println(singleton);

        objectOutStream.writeObject(singleton);

        ObjectInputStream objectInStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutStream.toByteArray()));

        Singleton singletonAfterDeserialization = (Singleton) objectInStream.readObject();

        System.out.println("after deserialization:");
        System.out.println(singletonAfterDeserialization);

    }
}
