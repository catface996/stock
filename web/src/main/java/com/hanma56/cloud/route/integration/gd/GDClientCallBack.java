package com.hanma56.cloud.route.integration.gd;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

import feign.hystrix.FallbackFactory;

/**
 * Created by 张钟 on 2017/8/16.
 */

@Component
public class GDClientCallBack implements FallbackFactory<GDClient> {

    private org.apache.log4j.Logger logger = org.apache.log4j.Logger
        .getLogger(GDClientCallBack.class);

    @Override
    public GDClient create(final Throwable cause) {
        return new GDClient() {
            @Override
            public JSONObject getPoints(String origin, String destination, String output,
                                        String key) {

                logger.error("调用高德地图线路规划异常", cause);
                return null;
            }

            @Override
            public JSONObject getBatchRequest(String key, JSONObject param) {
                logger.error("调用高德地图批量处理异常,请求参数:" + param.toJSONString(), cause);
                return null;
            }

            @Override
            public JSONObject getGeo(String key, String address, String city) {
                logger.error("解析地址异常", cause);
                return null;
            }
        };
    }
}
