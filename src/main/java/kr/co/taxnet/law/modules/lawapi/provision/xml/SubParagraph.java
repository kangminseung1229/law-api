package kr.co.taxnet.law.modules.lawapi.provision.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "호")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubParagraph {


    @XmlElement(name = "호번호")
    private String subParagraphNumber;
    
    @XmlElement(name = "호내용")
    private String subParagraphContent;


    @XmlElement(name = "목")
    private List<Item> item;
    


    


}
