package cn.bugstack.domain.strategy.service.armory.algorithm;

import cn.bugstack.domain.strategy.repository.IStrategyRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;
import java.security.SecureRandom;

/**
 * @description:TODO
 * @author: Lenovo
 * @create: 2024/10/15 上午11:33
 */
public abstract class AbstractAlgorithm implements IAlgorithm{

    @Resource
    protected IStrategyRepository repository;

    protected final SecureRandom secureRandom = new SecureRandom();

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public enum Algorithm{
        O1("o1Algorithm"),OLogN("oLogNAlgorithm");
        private String key;
    }

}
