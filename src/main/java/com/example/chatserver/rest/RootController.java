package com.example.chatserver.rest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class RootController implements ErrorController {

    // @GetMapping({ "/", "/error", "/cha" })
    // public String getUsers() {
    // // return "/vue/index.html";
    // return "/room.html";
    // }

    // @Override
    // public String getErrorPath() {
    // return "/error";
    // }
}