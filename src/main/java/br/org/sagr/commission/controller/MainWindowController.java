package br.org.sagr.commission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainWindowController {
    @RequestMapping("/painel")
    public String mainWindow() {
        return "pages/mainWindow";
    }
}