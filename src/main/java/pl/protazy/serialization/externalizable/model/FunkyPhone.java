package pl.protazy.serialization.externalizable.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class FunkyPhone extends Phone implements Externalizable {

    private String description;

    public FunkyPhone(int number, String vendor, String description) {
        super(number, vendor);
        this.description = description;
    }

    //default constructor needed for object construction based on Externalizable
    public FunkyPhone() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(getNumber());
        out.writeObject(getVendor());
        out.writeObject(description);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setNumber(in.readInt());
        setVendor((String) in.readObject());
        description = (String) in.readObject();
    }


    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "FunkyPhone{" +
                "description='" + description + '\'' +
                super.toString() +
                '}';
    }
}
