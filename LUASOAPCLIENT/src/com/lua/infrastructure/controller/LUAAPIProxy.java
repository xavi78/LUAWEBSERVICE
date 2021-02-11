package com.lua.infrastructure.controller;

public class LUAAPIProxy implements com.lua.infrastructure.controller.LUAAPI {
  private String _endpoint = null;
  private com.lua.infrastructure.controller.LUAAPI lUAAPI = null;
  
  public LUAAPIProxy() {
    _initLUAAPIProxy();
  }
  
  public LUAAPIProxy(String endpoint) {
    _endpoint = endpoint;
    _initLUAAPIProxy();
  }
  
  private void _initLUAAPIProxy() {
    try {
      lUAAPI = (new com.lua.infrastructure.controller.LUAAPIImplServiceLocator()).getLUAAPIImplPort();
      if (lUAAPI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lUAAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lUAAPI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lUAAPI != null)
      ((javax.xml.rpc.Stub)lUAAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lua.infrastructure.controller.LUAAPI getLUAAPI() {
    if (lUAAPI == null)
      _initLUAAPIProxy();
    return lUAAPI;
  }
  
  public com.lua.infrastructure.controller.User[] getUsers() throws java.rmi.RemoteException{
    if (lUAAPI == null)
      _initLUAAPIProxy();
    return lUAAPI.getUsers();
  }
  
  public void addUser(com.lua.infrastructure.controller.User arg0) throws java.rmi.RemoteException{
    if (lUAAPI == null)
      _initLUAAPIProxy();
    lUAAPI.addUser(arg0);
  }
  
  
}