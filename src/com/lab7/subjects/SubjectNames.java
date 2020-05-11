package com.lab7.subjects;

/**
 * Contains names of the available subjects.
 */
public enum SubjectNames {
    Telecom("Telecom     "),
    Database("Database    "),
    Cryptography("Cryptography"),
    Programming("Programming "),
    Philosophy("Philosophy  ");

    /**
     * Title of the some element.
     */
    private final String title;

    /**
     * Constructor for the element.
     * @param title title of element.
     */
    SubjectNames(String title) {
        this.title = title;
    }

    /**
     * Title getter.
     * @return title value.
     */
    public String getTitle() {
        return title;
    }
}
