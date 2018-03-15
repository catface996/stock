package com.hanma56.cloud.route.service.impl;

import com.hanma56.cloud.route.model.DeliveryPoint;
import com.hanma56.cloud.route.dao.DeliveryPointMapper;
import com.hanma56.cloud.route.service.DeliveryPointService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 送货点 服务实现类
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-12
 */
@Service
public class DeliveryPointServiceImpl extends ServiceImpl<DeliveryPointMapper, DeliveryPoint> implements DeliveryPointService {

    @Autowired
    private DeliveryPointMapper deliveryPointMapper;

    @Override
    public List<DeliveryPoint> queryByUserId(Long taskId) {
        return deliveryPointMapper.selectByTaskId(taskId);
    }
}
