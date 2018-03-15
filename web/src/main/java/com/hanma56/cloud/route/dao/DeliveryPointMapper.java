package com.hanma56.cloud.route.dao;

import com.hanma56.cloud.route.model.DeliveryPoint;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 送货点 Mapper 接口
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-12
 */
public interface DeliveryPointMapper extends BaseMapper<DeliveryPoint> {

    /**
     * 根据任务ID查询配送点列表
     * @param taskId
     * @return
     */
    List<DeliveryPoint> selectByTaskId(@Param("taskId") Long taskId);

}
