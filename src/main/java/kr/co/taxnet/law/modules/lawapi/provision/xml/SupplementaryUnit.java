package kr.co.taxnet.law.modules.lawapi.provision.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "부칙단위")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplementaryUnit {

    @XmlElement(name = "부칙공포일자")
    private String supplementaryProclamationDate;

    @XmlElement(name = "부칙공포번호")
    private String supplementaryProclamationNumber;

    @XmlElement(name = "부칙내용")
    private String supplementaryContent;

}
