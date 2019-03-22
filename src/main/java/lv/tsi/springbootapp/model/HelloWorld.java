package lv.tsi.springbootapp.model;

import java.time.LocalDate;

public class HelloWorld {

    String id;
    String text;
    LocalDate date;

    public HelloWorld(String id, String text, LocalDate date) {
        this.id = id;
        this.text = text;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
