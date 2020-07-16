package com.demo.service;/***
 * Created by dz on 2020-4-30
 */

import com.demo.dao.GoodsMapper;
import com.demo.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-4-30 16:37
 **/
@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    
    public Goods selectByPrimaryKey(Integer goodid){
        return goodsMapper.selectByPrimaryKey(goodid);
    }
}
