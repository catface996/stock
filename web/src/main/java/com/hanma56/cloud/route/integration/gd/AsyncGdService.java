package com.hanma56.cloud.route.integration.gd;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hanma56.cloud.route.model.DeliveryPoint;

/**
 * Created by 张钟 on 2017/8/16.
 */
@Service
public class AsyncGdService {

    private String   outPut = "JSON";

    private String   key    = "9843a4770442727a800ec64ca8e0364f";

    @Autowired
    private GDClient gdClient;

    @Async("gdQueryTaskAsyncPool")
    public Future<JSONObject> getPoints(DeliveryPoint startPoint, DeliveryPoint endPoint) {
        String org = String.valueOf(startPoint.getLongitude()) + ","
                     + String.valueOf(startPoint.getLatitude());
        String des = String.valueOf(endPoint.getLongitude()) + ","
                     + String.valueOf(endPoint.getLatitude());
        JSONObject result = gdClient.getPoints(org, des, outPut, key);
        return new AsyncResult<>(result);
    }

}
