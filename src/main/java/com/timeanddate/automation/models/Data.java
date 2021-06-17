package com.timeanddate.automation.models;

public class Data {
    private String name;
    private String email;
    private String password;
    private String textBienvenido;

    public Data(String name, String email, String password, String textBienvenido){
        this.name = name;
        this.email = email;
        this.password = password;
        this.textBienvenido = textBienvenido;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
