package com.example.texttopicture.ApiTest;


import com.example.texttopicture.Api.DallChat.DallChatAPI;
import com.example.texttopicture.Api.DallChat.DallChatService;
import com.example.texttopicture.text;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.requestParameters;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest({DallChatAPI.class})
@ExtendWith({RestDocumentationExtension.class})
public class DallChatAPITest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DallChatService dallChatService;

    @BeforeEach
    void init(WebApplicationContext webApplicationContext, RestDocumentationContextProvider restDocumentation) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .apply(documentationConfiguration(restDocumentation)).build();

    }

    @Test
    void DallImageGenerate() throws Exception {
        ResultActions perform = this.mockMvc.perform(RestDocumentationRequestBuilders.get("/image/generate"));

        perform.andExpect(status().isOk())
                .andDo(print())
                .andDo(document("DallChat-Api",
                        requestParameters(
                                parameterWithName("prompt").description("생성 요청할 프롬프트").optional()
                        )

                        ));
    }

}
