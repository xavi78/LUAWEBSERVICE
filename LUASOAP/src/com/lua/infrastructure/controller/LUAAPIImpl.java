package com.lua.infrastructure.controller;

import java.util.List;

import javax.jws.WebService;

import com.lua.domain.model.User;

@WebService(endpointInterface = "com.lua.infrastructure.controller.LUAAPI")
public class LUAAPIImpl implements LUAAPI {

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return User.getUsers();
	}

	@Override
	public void addUser(User user) {
		 User.getUsers().add(user);
	}

}
