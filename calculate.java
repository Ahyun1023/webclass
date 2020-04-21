package kr.hs.dgsw.webclass01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculate {
    @GetMapping("/calculate1")
    public int calculating1(@RequestParam final int num1, @RequestParam final int num2, @RequestParam final int select){
        int result = 0;
        System.out.println(select);
        if(select == 1){
            result = num1 + num2;
        } else if(select == 2){
            result = num1 - num2;
        } else if(select == 3){
            result = num1 * num2;
        } else if(select == 4){
            result = num1 / num2;
        }
        return result;
    }

    @GetMapping("/calculate2/{num1}/{num2}/{select}")
    public int calculating2(@PathVariable final int num1, @PathVariable final int num2, @PathVariable final int select){
        int result = 0;
        System.out.println(select);
        if(select == 1){
            result = num1 + num2;
        } else if(select == 2){
            result = num1 - num2;
        } else if(select == 3){
            result = num1 * num2;
        } else if(select == 4){
            result = num1 / num2;
        }
        return result;
    }
}