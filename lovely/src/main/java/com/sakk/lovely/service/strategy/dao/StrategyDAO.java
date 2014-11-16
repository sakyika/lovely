package com.sakk.lovely.service.strategy.dao;

import java.util.List;

import com.sakk.lovely.model.strategy.Strategy;

public interface StrategyDAO {

    public void addStrategy(Strategy strategy);

    public Strategy getStrategy(int id);

    public void updateStrategy(Strategy strategy);

    public void deleteStrategy(int id);

    public List<Strategy> getStrategies();

}
