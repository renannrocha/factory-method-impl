package com.renannrocha.projects.gofPaterns.factoryMethod.rest.controller;

import com.renannrocha.projects.gofPaterns.factoryMethod.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/document")
public class DocumentController {

    @Autowired
    private DocumentService service;

    @GetMapping(value = "/{docType}")
    public ResponseEntity<String> getDocumentType(@PathVariable String docType){
        String response = service.openDocument(docType);
        return ResponseEntity.ok().body(response);
    }
}
