package com.example.group42_desco.Nipa2211056;

import javax.lang.model.element.Name;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class CustomerProfile {
    private String name,address,meternumber,connectiontype;

    public CustomerProfile(String name, String address, String meternumber, String connectiontype) {
        this.name = name;
        this.address = address;
        this.meternumber = meternumber;
        this.connectiontype = connectiontype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMeternumber() {
        return meternumber;
    }

    public void setMeternumber(String meternumber) {
        this.meternumber = meternumber;
    }

    public String getConnectiontype() {
        return connectiontype;
    }

    public void setConnectiontype(String connectiontype) {
        this.connectiontype = connectiontype;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", meternumber='" + meternumber + '\'' +
                ", connectiontype='" + connectiontype + '\'' +
                '}';
    }
    public String toString(String random){
        return name +","+address+","+meternumber+","+connectiontype+"\n";
    }
}

