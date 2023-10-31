package Programmer.bagus.iyo.data;

public enum Level {

    STANDART ("Standar Level"),
    PREMIUM ("Premium Level"),
    VIP ("VIP");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
