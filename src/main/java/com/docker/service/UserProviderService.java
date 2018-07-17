package com.docker.service;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;


@Service
public class UserProviderService implements IUserProviderService{

	
	public List getAllUser(String username) {
		
		return null;
	}
}
