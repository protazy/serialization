package pl.protazy.serialization.serializable.model;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton INSTANCE = new Singleton("single");

    private String name;

    public static Singleton getInstance() {
        return INSTANCE;
    }

    private Singleton(String name) {
        this.name = name;
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "ref='" + super.toString() + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
