/**
 * LUAAPIImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lua.infrastructure.controller;

public class LUAAPIImplServiceLocator extends org.apache.axis.client.Service implements com.lua.infrastructure.controller.LUAAPIImplService {

    public LUAAPIImplServiceLocator() {
    }


    public LUAAPIImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LUAAPIImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LUAAPIImplPort
    private java.lang.String LUAAPIImplPort_address = "http://localhost:8090/WS/Users";

    public java.lang.String getLUAAPIImplPortAddress() {
        return LUAAPIImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LUAAPIImplPortWSDDServiceName = "LUAAPIImplPort";

    public java.lang.String getLUAAPIImplPortWSDDServiceName() {
        return LUAAPIImplPortWSDDServiceName;
    }

    public void setLUAAPIImplPortWSDDServiceName(java.lang.String name) {
        LUAAPIImplPortWSDDServiceName = name;
    }

    public com.lua.infrastructure.controller.LUAAPI getLUAAPIImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LUAAPIImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLUAAPIImplPort(endpoint);
    }

    public com.lua.infrastructure.controller.LUAAPI getLUAAPIImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.lua.infrastructure.controller.LUAAPIImplPortBindingStub _stub = new com.lua.infrastructure.controller.LUAAPIImplPortBindingStub(portAddress, this);
            _stub.setPortName(getLUAAPIImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLUAAPIImplPortEndpointAddress(java.lang.String address) {
        LUAAPIImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.lua.infrastructure.controller.LUAAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.lua.infrastructure.controller.LUAAPIImplPortBindingStub _stub = new com.lua.infrastructure.controller.LUAAPIImplPortBindingStub(new java.net.URL(LUAAPIImplPort_address), this);
                _stub.setPortName(getLUAAPIImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LUAAPIImplPort".equals(inputPortName)) {
            return getLUAAPIImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controller.infrastructure.lua.com/", "LUAAPIImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controller.infrastructure.lua.com/", "LUAAPIImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LUAAPIImplPort".equals(portName)) {
            setLUAAPIImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
