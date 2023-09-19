package com.saihemanth.retailer.rewards.service;


import com.saihemanth.retailer.rewards.model.Rewards;

public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}