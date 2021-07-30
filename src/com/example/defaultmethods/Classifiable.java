package com.example.defaultmethods;

public interface Classifiable {

    Classifier classify(String value);

    // Classifier declassify(String value);

    default Classifier declassify(String value) {
        return new Classifier(value);
    }
}
