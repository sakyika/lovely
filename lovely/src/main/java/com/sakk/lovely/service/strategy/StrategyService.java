package com.sakk.lovely.service.strategy;

import java.util.List;

import com.sakk.lovely.model.strategy.Strategy;

public interface StrategyService {

	public void addStrategy(Strategy strategy);

	public Strategy getStrategy(int id);

	public void updateStrategy(Strategy strategy);

	public void deleteStrategy(int id);

	public List<Strategy> getStrategies();

}
