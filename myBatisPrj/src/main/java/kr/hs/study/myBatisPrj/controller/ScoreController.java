package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.ScoreDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScoreController {
    @GetMapping("/score")
    public String score(){
        return "score_input";
    }

    @PostMapping("/score")
    public String score_result(@ModelAttribute ScoreDto dto, Model model){
        dto.setSum(dto.getKor() + dto.getEng() + dto.getMath());
        String avg = String.format("%.2f", dto.getSum()/3.0);
        dto.setAvg(Double.parseDouble(avg));

        model.addAttribute("score", dto);
        return "scoreResult";

    }
}
