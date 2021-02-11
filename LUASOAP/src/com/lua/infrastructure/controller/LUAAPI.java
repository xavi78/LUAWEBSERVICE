package com.lua.infrastructure.controller;

import java.util.List;

import javax.jws.WebService;

import com.lua.domain.model.User;

@WebService
public interface LUAAPI {

	public List<User> getUsers();
	public void addUser(User user);
	
}
