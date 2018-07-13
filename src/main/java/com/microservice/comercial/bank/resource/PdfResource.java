package com.microservice.comercial.bank.resource;

import com.microservice.comercial.bank.domain.dto.WrapperDTO;
import com.microservice.comercial.bank.domain.dto.WrapperTwoDTO;
import com.microservice.comercial.bank.util.PdfGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;


@RestController
@RequestMapping("/api/pdf")
public class PdfResource {

    @Autowired
    PdfGenerator pdfGenerator;

    @PostMapping("/bank-accounts")
    public ResponseEntity<InputStreamResource> bankAccountReports(@RequestBody WrapperDTO body) throws IOException {

        ByteArrayInputStream bis = pdfGenerator.bankAccountReporst(body.getList());

        HttpHeaders headers = new HttpHeaders();

        headers.add("Content-Disposition", "inline; filename=bank-accounts.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }

    @PostMapping("/filter")
    public ResponseEntity<InputStreamResource> filterData(@RequestBody WrapperTwoDTO body) throws IOException {

        ByteArrayInputStream bis = pdfGenerator.filteredTransactions(body.getList(), body.getValue());

        HttpHeaders headers = new HttpHeaders();

        headers.add("Content-Disposition", "inline; filename=bank-accounts.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }

}
