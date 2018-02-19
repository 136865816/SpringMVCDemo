package com.gaussic.model;

public class ApiRequest<T> {
    private String mac;
    private T data;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "mac="+mac + data.toString();
    }
}
