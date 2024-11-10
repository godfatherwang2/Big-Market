package cn.bugstack.domain.strategy.service.armory.algorithm.impl;

import cn.bugstack.domain.strategy.model.entity.StrategyAwardEntity;
import cn.bugstack.domain.strategy.service.armory.algorithm.AbstractAlgorithm;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @description:TODO
 * @author: Lenovo
 * @create: 2024/10/15 上午11:38
 */
@Slf4j
public class OLogNAlgorithm extends AbstractAlgorithm {

    @Resource
    private ThreadPoolExecutor threadPoolExecutor;

    @Override
    public void armoryAlgorithm(String key, List<StrategyAwardEntity> strategyAwardEntities, BigDecimal rateRange) {
        log.info("抽奖算法 OLog(n) 装配 key:{}", key);
        int from = 1;
        int to = 0;
        Map<Map<Integer,Integer>,Integer> map = new HashMap<>();
        


    }

    @Override
    public Integer dispatchAlgorithm(String key) {
        return 0;
    }
}
