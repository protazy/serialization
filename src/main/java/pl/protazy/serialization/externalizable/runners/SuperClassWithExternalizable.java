package pl.protazy.serialization.externalizable.runners;

import pl.protazy.serialization.externalizable.model.FunkyPhone;

import java.io.*;

public class SuperClassWithExternalizable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutStream = new ObjectOutputStream(byteArrayOutStream);

        FunkyPhone funkyPhone = new FunkyPhone(123456789, "Sony", "XPeria M");

        System.out.println("before serialization:");
        System.out.println(funkyPhone);

        objectOutStream.writeObject(funkyPhone);

        ObjectInputStream objectInStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutStream.toByteArray()));

        FunkyPhone afterDeserialization = (FunkyPhone) objectInStream.readObject();

        System.out.println("after deserialization:");
        System.out.println(afterDeserialization);
    }
}
