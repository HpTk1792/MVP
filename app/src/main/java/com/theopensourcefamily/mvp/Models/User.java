package com.theopensourcefamily.mvp.Models;

public class User {

    private enum Rol{
        owner,
        admin,
        basic
    }

    private String username;
    private String password;
    private String fullname;
    private Rol rol;

    User(){
        username = null;
        password = null;
        fullname = null;
        rol = null;
    }

    User(String usern,String pwd,String name, String first, String ){

    }
}
