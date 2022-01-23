package kr.co.taxnet.law.module.law;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter @Setter
@ToString
public class law {

    @XmlElement(name = "법령일련번호")
    private String lawnumber;

    @XmlElement(name = "현행연혁코드")
    private String nowyearcode;

    @XmlElement(name = "법령명한글")
    private String korlawname;

    @XmlElement(name = "법령약칭명")
    private String lawshortcutname;

    @XmlElement(name = "법령ID")
    private Long lawid;
    
    @XmlElement(name = "공포일자")
    private String declaredate;

    @XmlElement(name = "공포번호")
    private Long declarenumber;

    @XmlElement(name = "제개정구분명")
    private String updateflag;

    @XmlElement(name = "소관부처코드")
    private String gocode;

    @XmlElement(name = "소관부처명")
    private String goname;

    @XmlElement(name = "법률구분명")
    private String lawflag;

    @XmlElement(name = "시행일자")
    private String lawexecutiondate;

    @XmlElement(name = "자법타법여부")
    private String activeflag;

    @XmlElement(name = "법령상세링크")
    private String lawdetaillink;
    


}
