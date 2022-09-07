package kr.co.taxnet.law.modules.law.lawapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import kr.co.taxnet.law.modules.lawapi.GetHtmlText;
import kr.co.taxnet.law.modules.lawapi.provision.xml.Amendment;
import kr.co.taxnet.law.modules.lawapi.provision.xml.LawDetailData;
import kr.co.taxnet.law.modules.lawapi.provision.xml.ModifyReason;
import kr.co.taxnet.law.modules.lawapi.provision.xml.Supplementary;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
public class XmlUnmarshallingTest {
    @Autowired
    MockMvc mockMvc;

    @DisplayName("기본정보 가져오기")
    @Test
    public void basicInfomationParsing() {

    }

  
    @DisplayName("부칙 가져오기")
    @Test
    void supplementary_success() throws JAXBException, IOException {

        String url = "https://www.taxnet.co.kr/XML/supplementaryProvision.xml";

        JAXBContext jaxbContext = JAXBContext.newInstance(Supplementary.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Supplementary supplementary = (Supplementary) unmarshaller
                .unmarshal(new StringReader(GetHtmlText.getHtml(url).replaceAll("\\]\\]>", "<br/>\\]\\]>")));

        assertEquals("05581", supplementary.getSupplementaryUnit().get(0).getSupplementaryProclamationNumber());

        log.info("부칙내용 확인 ::\n {}", supplementary.getSupplementaryUnit().get(0).getSupplementaryContent());

    }

    @DisplayName("개정문 가져오기")
    @Test
    void amendmentContentTest() throws JAXBException, IOException {

        String url = "https://www.taxnet.co.kr/XML/amendment.Xml";
        JAXBContext jaxbContext = JAXBContext.newInstance(Amendment.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Amendment amendment = (Amendment) unmarshaller
                .unmarshal(new StringReader(GetHtmlText.getHtml(url).replaceAll("\\]\\]>", "<br/>\\]\\]>")));

        assertNotNull(amendment);
        log.info("개정문 내용 :: \n\n {}", amendment.getAmendmentContent());

    }

    @DisplayName("개정문 가져오기")
    @Test
    void modifyReasonContentTest() throws JAXBException, IOException {

        String url = "https://www.taxnet.co.kr/XML/modifyReason.Xml";
        JAXBContext jaxbContext = JAXBContext.newInstance(ModifyReason.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        ModifyReason modifyReason = (ModifyReason) unmarshaller
                .unmarshal(new StringReader(GetHtmlText.getHtml(url).replaceAll("\\]\\]>", "<br/>\\]\\]>")));

        assertNotNull(modifyReason);
        log.info("개정문 내용 :: \n\n {}", modifyReason.getModifyReasonContent());

    }

    @DisplayName("법데이터 전체 가져오기")
    @Test
    void lawDetailDataTest() throws JAXBException, IOException{

      String url =  "http://www.law.go.kr/DRF/lawService.do?OC=whelming25&target=law&MST=234759&type=xml";
      

      JAXBContext jaxbContext = JAXBContext.newInstance(LawDetailData.class);
      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

      LawDetailData lawDetailData = (LawDetailData) unmarshaller.unmarshal(new StringReader(GetHtmlText.getHtml(url).replaceAll("\\]\\]>", "<br/>\\]\\]>")));

    
      assertNotNull(lawDetailData);
      
      log.info("size ::{}", lawDetailData.toString().length());
      

    }

}
