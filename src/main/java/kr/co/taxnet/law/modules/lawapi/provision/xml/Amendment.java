package kr.co.taxnet.law.modules.lawapi.provision.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "개정문")
@XmlAccessorType(XmlAccessType.FIELD)
public class Amendment {

    @XmlElement(name = "개정문내용")
    private String amendmentContent;
    
}
