package kr.co.taxnet.law.modules.lawapi.provision.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * 법 조문 
 */

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "조문")
@NoArgsConstructor
public class Provision{

    @XmlElement(name = "조문단위")
    private List<ProvisionUnit> provisionUnit;


}
