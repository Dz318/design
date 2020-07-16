package com.demo.dao;

import com.demo.entity.PayWay;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PayWayMapper {
    int deleteByPrimaryKey(Integer payid);

    int insert(PayWay record);

    int insertSelective(PayWay record);

    PayWay selectByPrimaryKey(Integer payid);

    int updateByPrimaryKeySelective(PayWay record);

    int updateByPrimaryKey(PayWay record);

    PayWay selectByType(Integer typeId);

}
