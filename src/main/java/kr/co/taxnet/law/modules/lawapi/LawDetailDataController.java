package kr.co.taxnet.law.modules.lawapi;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.taxnet.law.modules.lawapi.provision.xml.LawDetailData;

@Controller
public class LawDetailDataController {

    @GetMapping("/provision/detail")
    public String provisionDetail(Model model) throws JAXBException, IOException {

        String url = "http://www.law.go.kr/DRF/lawService.do?OC=whelming25&target=law&MST=234759&type=xml";

        JAXBContext jaxbContext = JAXBContext.newInstance(LawDetailData.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        LawDetailData lawDetailData = (LawDetailData) unmarshaller
                .unmarshal(new StringReader(GetHtmlText.getHtml(url).replaceAll("\\]\\]>", "<br/>\\]\\]>")));

        model.addAttribute("provisionBasicInfomation", lawDetailData.getProvisionBasicInfomation());
        model.addAttribute("provisionUnit", lawDetailData.getProvision().getProvisionUnit());
        model.addAttribute("supplementaryUnit", lawDetailData.getSupplementary().getSupplementaryUnit());
        model.addAttribute("amendment", lawDetailData.getAmendment());
        model.addAttribute("modifyReason", lawDetailData.getModifyReason());


        return "provision/provisionDetail";
    }

}
