package com.docker.service;

import java.util.List;

public interface IUserProviderService {
	
	
	@SuppressWarnings("rawtypes")
	public List getAllUser(String username);

}
