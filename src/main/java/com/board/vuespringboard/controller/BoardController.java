package com.board.vuespringboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class BoardController {

    @GetMapping("/list")   
    public String List() {
        return "list";
    }
}
