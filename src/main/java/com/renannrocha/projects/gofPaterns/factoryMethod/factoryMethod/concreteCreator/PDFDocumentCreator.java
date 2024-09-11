package com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.concreteCreator;

import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.concreteProduct.PDFDocument;
import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.creator.DocumentCreator;
import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.product.Document;
import org.springframework.stereotype.Component;

@Component
public class PDFDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PDFDocument(); // Retorna um produto concreto
    }
}
