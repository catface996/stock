package com.hanma56.cloud.route.service;

import com.hanma56.cloud.route.model.DeliveryPoint;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 送货点 服务类
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-12
 */
public interface DeliveryPointService extends IService<DeliveryPoint> {

    /**
     * 通过用户查询地点
     * @return
     */
    List<DeliveryPoint> queryByUserId(Long taskId);

}
