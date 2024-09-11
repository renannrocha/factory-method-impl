package com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.concreteProduct;

import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.product.Document;

public class PDFDocument implements Document {
    @Override
    public String open() {
        String response = "Opening a PDF document.";
        System.out.println("Opening a PDF document.");
        return response;
    }
}
