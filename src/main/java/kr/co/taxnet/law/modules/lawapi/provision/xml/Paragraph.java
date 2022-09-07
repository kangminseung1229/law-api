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
@XmlRootElement(name = "항")
@XmlAccessorType(XmlAccessType.FIELD)
public class Paragraph {


    
    @XmlElement(name = "항번호")
    private String paragraphNumber;

    @XmlElement(name = "항제개정유형")
    private String paragraphModify;
    
    @XmlElement(name = "항제개정일자문자열")
    private String paragraphModifyDate;
    
    @XmlElement(name = "항내용")
    private String paragraphContent;
    
    @XmlElement(name = "호")
    private List<SubParagraph> subParagraph;


    
    
    
}
