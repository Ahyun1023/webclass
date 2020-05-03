package kr.hs.dgsw.webclass01.cal;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServicelmpl implements CalculatorService{
    @Override
    public String calculator(String num1, String num2, String select){
        if(num1 == "" || num2 == ""){
            return "숫자가 입력되지 않음";
        }
        else
        {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);
            int selected = Integer.parseInt(select);
            int result = 0;

            if(selected == 1){
                result = number1 + number2;
            } else if(selected == 2){
                result = number1 - number2;
            } else if(selected == 3){
                result = number1 * number2;
            } else if(selected == 4){
                result = number1 / number2;
            }
            System.out.println(result);
            String sresult = Integer.toString(result);
            return sresult;
        }
    }
}