package kr.co.taxnet.law.modules.law;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "LawSearch")
@Getter
@Setter
@ToString
public class xmlLawList {

    @XmlElement(name="target")
    private String target;

    @XmlElement(name="keyword")
    private String keyword;
    
    @XmlElement(name="section")
    private String section;

    @XmlElement(name="totalCnt")
    private Long totalCnt;
    
    @XmlElement(name="page")
    private Long page;

    @XmlElement(name="numOfRows")
    private Long numofrows;

    @XmlElement(name="resultCode")
    private Long resultcode;
    
    @XmlElement(name="resultMsg")
    private Long resultmsg;

    @XmlElement(name = "law")
    private law[] law;

}
