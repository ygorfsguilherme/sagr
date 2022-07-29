package br.org.sagr.commission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserPanelController {

    @RequestMapping("/painel")
    public String userPanel() {
        return "userPanel/index";
    }

}
