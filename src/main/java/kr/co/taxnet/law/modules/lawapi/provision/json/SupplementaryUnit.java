package kr.co.taxnet.law.modules.lawapi.provision.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SupplementaryUnit {

    @JsonProperty("부칙공포일자")
    private String supplementaryProclamationDate;

    @JsonProperty("부칙공포번호")
    private String supplementaryProclamationNumber;

    @JsonProperty("부칙내용")
    private String supplementaryContent;

}
