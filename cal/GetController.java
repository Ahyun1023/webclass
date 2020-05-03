package kr.hs.dgsw.webclass01.cal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @Autowired
    private CalculatorService cs;

    @GetMapping("/calculate1")
    public String calculating1(@RequestParam String num1, @RequestParam String num2, @RequestParam String select){
        return cs.calculator(num1, num2, select);
    }

    @GetMapping("/calculate2/{num1}/{num2}/{select}")
    public String calculating2(@PathVariable String num1, @PathVariable String num2, @PathVariable String select){
        return cs.calculator(num1, num2, select);
    }
}