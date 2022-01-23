package kr.co.taxnet.law.module.law;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

@Service
public class lawService {

    public xmlLawList lawList(String type, String apiId) {

        xmlLawList law = new xmlLawList();

        try {
            String html = lawUtil.getHtml("http://www.law.go.kr/DRF/lawSearch.do?target=law&type="+type+"&OC="+apiId+"");
            
            JAXBContext jaxbContext = JAXBContext.newInstance(xmlLawList.class); // JAXB Context 생성
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller(); // Unmarshaller Object 생성
            law = (xmlLawList) unmarshaller.unmarshal(new StringReader(html)); // unmarshall 메소드 호출

            // map.put("law", law);

            return law;

        } catch (JAXBException | IOException e) {

            e.printStackTrace();
            // logger.error("KRX API 예외 발생", e);
            // map.put("xmlLawList", xmlLawList); // 예외 발생 시, 빈 객체 반환
            // return map;
        }

        return law;

    }
    

}
