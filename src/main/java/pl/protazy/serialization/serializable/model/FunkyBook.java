package pl.protazy.serialization.serializable.model;

public class FunkyBook extends Book {

    private String description;

    public FunkyBook(String title, int pageCount, String description) {
        super(title, pageCount);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "FunkyBook{" +
                "description='" + description + '\'' +
                super.toString() +
                '}';
    }
}
