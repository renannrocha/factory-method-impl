package com.renannrocha.projects.gofPaterns.factoryMethod.service;

import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.concreteCreator.ExcelDocumentCreator;
import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.concreteCreator.PDFDocumentCreator;
import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.concreteCreator.WordDocumentCreator;
import com.renannrocha.projects.gofPaterns.factoryMethod.factoryMethod.creator.DocumentCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    private final DocumentCreator pdfDocumentCreator;
    private final DocumentCreator wordDocumentCreator;
    private final DocumentCreator excelDocumentCreator;

    @Autowired
    public DocumentService(PDFDocumentCreator pdfDocumentCreator, WordDocumentCreator wordDocumentCreator, ExcelDocumentCreator excelDocumentCreator) {
        this.pdfDocumentCreator = pdfDocumentCreator;
        this.wordDocumentCreator = wordDocumentCreator;
        this.excelDocumentCreator = excelDocumentCreator;
    }

    public String openDocument(String type) {
        if (type.equalsIgnoreCase("PDF")) {
            return pdfDocumentCreator.openDocument();
        } else if (type.equalsIgnoreCase("WORD")) {
            return wordDocumentCreator.openDocument();
        } else if (type.equalsIgnoreCase("EXCEL")) {
            return excelDocumentCreator.openDocument();
        } else {
            throw new IllegalArgumentException("Unknown document type");
        }
    }
}
