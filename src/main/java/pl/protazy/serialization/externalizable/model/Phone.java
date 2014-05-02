package pl.protazy.serialization.externalizable.model;

public class Phone {
    private int number;
    private String vendor;

    public Phone(int number, String vendor) {
        this.number = number;
        this.vendor = vendor;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public String getVendor() {
        return vendor;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}
