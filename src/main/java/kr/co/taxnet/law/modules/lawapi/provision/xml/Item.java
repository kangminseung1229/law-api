package kr.co.taxnet.law.modules.lawapi.provision.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "목")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {


    @XmlElement(name = "목번호")
    private String itemNumber;
    
    @XmlElement(name = "목내용")
    private String itemContent;


}
