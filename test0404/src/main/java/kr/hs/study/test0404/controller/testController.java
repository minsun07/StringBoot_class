package kr.hs.study.test0404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
        @PostMapping("/index")
        public String home(@RequestParam("num1") Integer num1,
                           @RequestParam("num2") Integer num2,
                           @RequestParam("num3") Integer num3,
                           @RequestParam("num4") Integer num4,
                           @RequestParam("num5") Integer num5){

            int evensum = 0;
            int oddsum = 0;

            int[] numbers = {num1, num2, num3, num4, num5};

            for(int i=0; i<numbers.length; i++){
                if(numbers[i] % 2 == 0){
                    evensum += numbers[i];
                }else{
                    oddsum += numbers[i];
                }
            }
            System.out.println("evensum : " + evensum);
            System.out.println("oddsum : " + oddsum);

            return "result";
        }


}
