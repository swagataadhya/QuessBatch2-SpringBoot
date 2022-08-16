package com.RESTapiwithAjax.demoajax;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/testajax")
    public String getAjaxCall()
    {
        return "Welcome AJAX";
    }
}
