package com.zxw.health.controllers;

import com.alibaba.cloudapi.sdk.constant.SdkConstant;
import com.alibaba.cloudapi.sdk.model.ApiResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.zxw.health.client.HttpsApiClient;
import com.zxw.health.model.HealthCodeScanParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private static final Logger log = LoggerFactory.getLogger(ApiController.class);
    @Autowired
    @Qualifier("httpsApiClient")
    private HttpsApiClient httpsApiClient;

    public ApiController() {
    }

    @PostMapping({"/healthcode/initiativeScan"})
    String initiativeScan(HealthCodeScanParam param) throws Exception {
        try {
            ApiResponse apiResponse = this.httpsApiClient.initiativeScan(JSON.toJSONBytes(param, new SerializerFeature[]{SerializerFeature.WriteNullStringAsEmpty}));
            return new String(apiResponse.getBody(), SdkConstant.CLOUDAPI_ENCODING);
        } catch (Exception err) {
            log.error("请求健康码检验主扫模式出错，param[{}]", param.toString(), err);
            return null;
        }
    }
}
