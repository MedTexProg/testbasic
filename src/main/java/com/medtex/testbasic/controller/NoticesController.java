package com.medtex.testbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class NoticesController {

    @GetMapping("/notices")
    public String getNotices() {
        return "Here are the notices details from the DB";
    }

}
