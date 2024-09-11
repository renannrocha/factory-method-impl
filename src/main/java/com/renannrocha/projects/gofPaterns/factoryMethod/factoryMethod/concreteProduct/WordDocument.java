package com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.concreteProduct;

import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.product.Document;

public class WordDocument implements Document {

    @Override
    public String open() {
        String response = "Opening a Word document.";
        System.out.println("Opening a Word document.");
        return response;
    }
}
