package kr.co.taxnet.law.modules.law;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.taxnet.law.config.ApiInfo;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class lawController {

    private final lawService lawService;

    private String apiId = ApiInfo.apiId;

    @GetMapping(value = {"/", "law-onetab"})
    public String lawOneTab(Model model, @RequestParam(required = false) String lawname) {

        xmlLawList xmlLawList = new xmlLawList();

        xmlLawList = lawService.lawList("XML", apiId);

        law[] lawList = xmlLawList.getLaw();

        model.addAttribute("list", lawList);

        return "html/lawOneTab";
    }

}
