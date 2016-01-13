package org.intu.tss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScriptController {
    @RequestMapping("/greeting")
    public String greeting() {
        return "hello hey";
    }
}