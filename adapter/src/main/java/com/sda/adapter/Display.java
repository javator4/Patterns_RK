package com.sda.adapter;

public class Display implements Data{

    public String parseData() {

        JSONData jsonData = new JSONData();
        return jsonData.json();

    }
}
