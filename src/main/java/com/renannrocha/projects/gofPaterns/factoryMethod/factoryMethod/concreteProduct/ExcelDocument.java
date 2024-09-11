package com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.concreteProduct;

import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.product.Document;

public class ExcelDocument implements Document {
    @Override
    public String open() {
        String response = "Opening a Excel document.";
        System.out.println("Opening a Excel document.");
        return response;
    }
}
