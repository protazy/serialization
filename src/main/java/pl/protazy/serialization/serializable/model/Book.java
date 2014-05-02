package pl.protazy.serialization.serializable.model;

import java.io.Serializable;

public class Book implements Serializable {

    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ref='" + super.toString() + "\'" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
