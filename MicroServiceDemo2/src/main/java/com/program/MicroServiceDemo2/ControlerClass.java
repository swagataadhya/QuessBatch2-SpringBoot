package com.program.MicroServiceDemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlerClass {

    @Autowired
    private Number myno;

    @GetMapping("/getminmax")
    public Number getNumb()
    {
        return new Number(myno.getMax(),myno.getMin());
    }

}
