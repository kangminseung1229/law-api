package kr.co.taxnet.law.modules.lawapi.provision.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

/*
 * 법 조문 
 */

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "법령")
public class LawDetailData {

    @XmlElement(name = "기본정보")
    private ProvisionBasicInfomation provisionBasicInfomation;

    @XmlElement(name = "조문")
    private Provision provision;

    @XmlElement(name = "부칙")
    private Supplementary supplementary;

    @XmlElement(name = "개정문")
    private Amendment amendment;

    @XmlElement(name = "제개정이유")
    private ModifyReason modifyReason;

}
