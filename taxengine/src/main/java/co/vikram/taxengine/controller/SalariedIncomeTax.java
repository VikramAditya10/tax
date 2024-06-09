package co.vikram.taxengine.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("salaried")
public class SalariedIncomeTax {
    @GetMapping("/calculate/tax")
    public String calculateTax(){
        return "50000";
    }
}
