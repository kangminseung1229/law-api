package kr.co.taxnet.law.modules.lawapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class GetHtmlText {
    
    public static String getHtml(String url) throws IOException {

        URL targetUrl = new URL(url);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(targetUrl.openStream()))) {
            
            StringBuffer html = new StringBuffer();
            String tmp;

            while ((tmp = reader.readLine()) != null) {
                html.append(tmp);
            }

            return html.toString();
        }
    }

}
