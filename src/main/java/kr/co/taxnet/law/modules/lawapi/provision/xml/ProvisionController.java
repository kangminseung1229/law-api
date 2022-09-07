package kr.co.taxnet.law.modules.lawapi.provision.xml;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.taxnet.law.modules.lawapi.GetHtmlText;

@Controller
@RequestMapping("/provision")
public class ProvisionController {

    @GetMapping("test-view")
    public String xmlViewTest(Model model) throws JAXBException, IOException {

        String url = "https://www.taxnet.co.kr/XML/supplementaryProvision.xml";


        JAXBContext jaxbContext = JAXBContext.newInstance(Supplementary.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Supplementary supplementary = (Supplementary) unmarshaller
                .unmarshal(new StringReader(GetHtmlText.getHtml(url).replaceAll("\\]\\]>", "<br/>\\]\\]>")));


        model.addAttribute("json", supplementary.getSupplementaryUnit().get(0).getSupplementaryContent());
        // model.addAttribute("json", GetHtmlText.getHtml(url));

        return "provision/xmlViewTest";

    }

}
