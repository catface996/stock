package com.hanma56.cloud.route.integration.gd;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by 张钟 on 2017/8/16.
 */

/**
 * http://restapi.amap.com/v3/direction/driving?origin=116.45925,39.910031&destination=116.587922,40.081577&output=xml&key=<用户的key>
 */
@FeignClient(name = "gdClient", url = "http://restapi.amap.com", fallbackFactory = GDClientCallBack.class)
public interface GDClient {

    /**
     * 高德线路规划接口
     * @param key
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/v3/direction/driving")
    JSONObject getPoints(@RequestParam("origin") String origin,
                         @RequestParam("destination") String destination,
                         @RequestParam("output") String output, @RequestParam("key") String key);

    /**
     * 批量查询借口给
     * @param key
     * @param param
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/v3/batch")
    JSONObject getBatchRequest(@RequestParam("key") String key, JSONObject param);

    /**
     * 地址解析
     * @param key
     * @param address
     * @param city
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/v3/geocode/geo")
    JSONObject getGeo(@RequestParam("key") String key, @RequestParam("address") String address,
                      @RequestParam("address") String city);
}
