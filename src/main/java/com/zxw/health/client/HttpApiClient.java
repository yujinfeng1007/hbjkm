package com.zxw.health.client;

import com.alibaba.cloudapi.sdk.client.ApacheHttpClient;
import com.alibaba.cloudapi.sdk.enums.Scheme;
import com.alibaba.cloudapi.sdk.model.HttpClientBuilderParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class HttpApiClient extends ApacheHttpClient {
    private static final Logger log = LoggerFactory.getLogger(HttpApiClient.class);
    public static final String HOST = "hbapi.nearcharge.com";

    public HttpApiClient(@Value("${app.key}") String appKey, @Value("${app.secret}") String appSecret) {
        HttpClientBuilderParams httpParams = new HttpClientBuilderParams();
        httpParams.setAppKey(appKey);
        httpParams.setAppSecret(appSecret);
        this.init(httpParams);
    }

    public void init(HttpClientBuilderParams httpClientBuilderParams) {
        try {
            httpClientBuilderParams.setScheme(Scheme.HTTP);
            httpClientBuilderParams.setHost("hbapi.nearcharge.com");
            super.init(httpClientBuilderParams);
            log.info("初始化阿里健康码客户端成功");
        } catch (Exception var3) {
            log.error("初始化阿里健康码客户端出错", var3);
        }

    }
}
