package com.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private	Integer	id;         //	用户id
    private	String	username;    //用户名
    private	Integer	password;        //	年龄
}
