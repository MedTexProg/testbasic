package com.medtex.testbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/Contact")
    public String getContactDetails(){
        return "Here are the Contact details from DB";
    }
}
