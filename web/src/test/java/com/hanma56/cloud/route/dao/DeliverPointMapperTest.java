package com.hanma56.cloud.route.dao;

import com.hanma56.cloud.route.model.DeliveryPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 张钟
 * @date 2018/3/12
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeliverPointMapperTest {

    @Autowired
    private DeliveryPointMapper deliveryPointMapper;

    @Test
    public void test_insert(){
        DeliveryPoint deliveryPoint = new DeliveryPoint();
        deliveryPoint.setAddressName("潘水小区");
        deliveryPoint.setCreated(new Date());
        deliveryPoint.setUpdated(new Date());
        deliveryPoint.setLatitude(new BigDecimal(30.14766));
        deliveryPoint.setLongitude(new BigDecimal(120.26228));

        deliveryPoint.setPointType("SOURCE");
        deliveryPoint.setUserId(1l);
        deliveryPoint.setTaskId(1l);
        deliveryPointMapper.insert(deliveryPoint);
    }
}
