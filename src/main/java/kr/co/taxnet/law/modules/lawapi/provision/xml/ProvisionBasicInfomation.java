package kr.co.taxnet.law.modules.lawapi.provision.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "기본정보")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProvisionBasicInfomation{

   @XmlElement(name = "법령ID")
   private String lawId;
   
   @XmlElement(name = "공포일자")
   private String proclamationDate;
   
   @XmlElement(name = "공포번호")
   private String proclamationNumber;
   
   @XmlElement(name = "법령명_한글")
   private String lawNickname;
   
   @XmlElement(name = "법령명약칭")
   private String lawNicknameAlias;
   
   @XmlElement(name = "소관부처")
   private String ministry;
   
   @XmlElement(name = "시행일자")
   private String enforceDate;
   
   @XmlElement(name = "제개정구분")
   private String modify;
   
   @XmlElement(name = "조문시행일자문자열")
   private String applicationDate;


}
