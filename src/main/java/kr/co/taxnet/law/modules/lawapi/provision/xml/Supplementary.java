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
@XmlRootElement(name = "부칙")
@XmlAccessorType(XmlAccessType.FIELD)
public class Supplementary {

    @XmlElement(name = "부칙단위")
    private List<SupplementaryUnit> supplementaryUnit;
    
    
}
