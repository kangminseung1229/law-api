package kr.co.taxnet.law.modules.lawapi;

import lombok.Data;

@Data
abstract public class AbstractApiParamerter {

 
    
    private final String OC = "OC=whelming25";
    private final String TYPE = "&TYPE=XML";
    private final String PROVISION_URL = "http://www.law.go.kr/DRF/lawService.do/?";


    private String apiUrl; // target url
    private String target; // 구분
    private String MST; // 법령일련번호

    abstract public void setting();

    public String getMST(){
        return "&MST=" + this.MST;
    }



 
    
}
