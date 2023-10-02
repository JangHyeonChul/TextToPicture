package com.example.texttopicture.Common;

import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

public class HttpUtils {

    /*
    * RestTemplate Get 요청 관련 HTTP 메서드
    * */
    public static ResponseEntity<String> Get(String uri, String path) {

        RestTemplate template = new RestTemplate();
        ResponseEntity<String> responseEntity = template.getForEntity(uri, String.class);

        return responseEntity;
    }

}
