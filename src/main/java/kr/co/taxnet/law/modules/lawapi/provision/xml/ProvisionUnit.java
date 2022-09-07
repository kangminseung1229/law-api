package kr.co.taxnet.law.modules.lawapi.provision.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "조문단위")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProvisionUnit {

    @XmlAttribute(name = "조문키")
    private String provisionKey; // <조문단위 조문키="0001000">

    @XmlElement(name = "조문여부")
    private String provisionFlag;

    @XmlElement(name = "조문번호")
    private String provisionNumber;

    @XmlElement(name = "조문가지번호")
    private String provisionBranchNumber;
    
    @XmlElement(name = "조문제목")
    private String provisionTitle;

    @XmlElement(name = "조문시행일자")
    private String provisionEnforceDate;

    @XmlElement(name = "조문변경여부")
    private String provisionUpdateFlag;

    @XmlElement(name = "조문내용")
    private String provisionContent;

    @XmlElement(name = "조문참고자료")
    private String provisionReference;

    @XmlElement(name = "항")
    private List<Paragraph> paragraph;

}
