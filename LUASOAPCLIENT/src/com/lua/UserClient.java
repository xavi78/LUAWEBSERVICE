package com.lua;

import java.rmi.RemoteException;
import java.util.Arrays;

import javax.xml.rpc.ServiceException;

import com.lua.infrastructure.controller.LUAAPI;
import com.lua.infrastructure.controller.LUAAPIImplServiceLocator;
import com.lua.infrastructure.controller.User;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LUAAPIImplServiceLocator locator = new LUAAPIImplServiceLocator();
		
		try {
			LUAAPI userService = locator.getLUAAPIImplPort();
			System.out.println("Listado de mis usuarios : \n" + Arrays.deepToString(userService.getUsers()));
			userService.addUser(new User("nuevo", "nuevo"));
			System.out.println("Listado de mis usuarios : \n" + Arrays.deepToString(userService.getUsers()));
		}catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
