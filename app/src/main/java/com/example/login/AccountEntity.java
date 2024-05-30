package com.example.login;


import android.os.Parcel;
import android.os.Parcelable;
public class AccountEntity{

    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String username;
    private String password;

    public String getFirstname() {
        return firstname;
    }

    public AccountEntity setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public AccountEntity setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AccountEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public AccountEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public AccountEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AccountEntity setPassword(String password) {
        this.password = password;
        return this;
    }

}