package com.demo.service;/***
 * Created by dz on 2020-4-30
 */

import com.demo.dao.PayWayMapper;
import com.demo.entity.PayWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-4-30 16:38
 **/
@Service
public class PayWayService {
    @Autowired
    private PayWayMapper payWayMapper;

    public PayWay selectByType(Integer typeId){
        return payWayMapper.selectByType(typeId);
    }
}
