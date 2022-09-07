package kr.co.taxnet.law.modules.law.lawapi;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import kr.co.taxnet.law.modules.lawapi.GetHtmlText;
import kr.co.taxnet.law.modules.lawapi.provision.xml.Supplementary;
import kr.co.taxnet.law.modules.lawapi.provision.xml.SupplementaryUnit;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
public class XmlToJsonTest {

    @DisplayName("xml to json test")
    @Test
    void xmlToJsonTest() throws IOException {

        String url = "https://www.taxnet.co.kr/XML/supplementaryProvision.xml";

        XmlMapper xmlMapper = new XmlMapper();

        JsonNode jsonNode  = xmlMapper.readTree(GetHtmlText.getHtml(url).getBytes());
        ObjectMapper objectMapper = new ObjectMapper();

        String value = objectMapper.writeValueAsString(jsonNode);
        log.info("json=========================== \n {}", value);


        // Supplementary supplementary = xmlMapper.readValue(GetHtmlText.getHtml(url), Supplementary.class);

        // String json = objectMapper.writeValueAsString(supplementary);

        // log.info("json 결과물 :: \n {}", json);

    }

}
