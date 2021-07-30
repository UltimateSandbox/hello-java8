package com.example;

import com.example.defaultmethods.Classifiable;
import com.example.defaultmethods.Classifier;

public class HelloDefaultMethods {

    public static void main(String[] args) {

        Classifiable classifier = new Classifiable() {

            @Override
            public Classifier classify(String value) {
                return null;
            }
        };

        Classifiable classifier2 = new Classifiable() {


            @Override
            public Classifier classify(String value) {
                return null;
            }

            @Override
            public Classifier declassify(String value) {
                return Classifiable.super.declassify(value);
            }
        };

    }
}
