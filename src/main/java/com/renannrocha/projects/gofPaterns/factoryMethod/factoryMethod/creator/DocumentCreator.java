package com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.creator;

import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.product.Document;

public abstract class DocumentCreator {

    // Método Factory que será implementado nas subclasses
    public abstract Document createDocument();

    // Lógica comum para abrir documentos
    public String openDocument() {
        Document doc = createDocument();
        return doc.open();
    }
}
