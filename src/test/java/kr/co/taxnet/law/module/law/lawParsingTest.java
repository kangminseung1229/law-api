package kr.co.taxnet.law.module.law;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
public class lawParsingTest {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName("파싱테스트")
    @Test
    void parsingTest() throws Exception{
        mockMvc.perform(get("/law-api/list"))
            .andExpect(status().isOk());
        

    }

    
}
