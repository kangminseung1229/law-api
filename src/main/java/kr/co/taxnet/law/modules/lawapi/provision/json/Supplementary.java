package kr.co.taxnet.law.modules.lawapi.provision.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
public class Supplementary {


    @JsonProperty("부칙단위")
    private List<SupplementaryUnit> supplementaryUnit;
    
    
}
