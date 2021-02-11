/**
 * LUAAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lua.infrastructure.controller;

public interface LUAAPI extends java.rmi.Remote {
    public com.lua.infrastructure.controller.User[] getUsers() throws java.rmi.RemoteException;
    public void addUser(com.lua.infrastructure.controller.User arg0) throws java.rmi.RemoteException;
}
