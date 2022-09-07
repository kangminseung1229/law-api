package kr.co.taxnet.law.modules.lawapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiParameter {

    public final String OC = "whelming25";
    public final String TYPE = "XML";
    public String targetUrl;

    // 기본적으로 상속받는 클래스들이 가지는 주소 만들기 메소드
    public void settingTargetUrl(){

    }

    // 기본정보 파라미터
    public String baseParameter(){
        return "?OC=" + this.getOC() + "&TYPE=" + this.getTYPE();
    }





}
