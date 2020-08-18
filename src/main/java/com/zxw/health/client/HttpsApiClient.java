package com.zxw.health.client;

import com.alibaba.cloudapi.sdk.client.ApacheHttpClient;
import com.alibaba.cloudapi.sdk.enums.HttpMethod;
import com.alibaba.cloudapi.sdk.enums.ParamPosition;
import com.alibaba.cloudapi.sdk.enums.Scheme;
import com.alibaba.cloudapi.sdk.model.ApiRequest;
import com.alibaba.cloudapi.sdk.model.ApiResponse;
import com.alibaba.cloudapi.sdk.model.HttpClientBuilderParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HttpsApiClient extends ApacheHttpClient {
    private static final Logger log = LoggerFactory.getLogger(HttpsApiClient.class);
    public static final String HOST = "hbapi.nearcharge.com";

    public HttpsApiClient(@Value("${app.key}") String appKey, @Value("${app.secret}") String appSecret) {
        HttpClientBuilderParams httpParams = new HttpClientBuilderParams();
        httpParams.setAppKey(appKey);
        httpParams.setAppSecret(appSecret);
        this.init(httpParams);
    }

    public void init(HttpClientBuilderParams httpClientBuilderParams) {
        try {
            httpClientBuilderParams.setScheme(Scheme.HTTPS);
            httpClientBuilderParams.setHost("hbapi.nearcharge.com");
            super.init(httpClientBuilderParams);
            log.info("初始化阿里健康码客户端成功");
        } catch (Exception var3) {
            log.error("初始化阿里健康码客户端出错", var3);
        }
    }

    public ApiResponse initiativeScan(byte[] body) {
        String path = "/healthcode/initiativeScan";
        ApiRequest request = new ApiRequest(HttpMethod.POST_BODY, path, body);
        request.addParam("X-Ca-Stage", "RELEASE", ParamPosition.HEAD, false);
        return this.sendSyncRequest(request);
    }
}
