package com.example.testsproject.entities;

public class User {

    private int Id;
    private String Name;
    private int Age;
    private String Login;
    private String Password;

    public int getId() {
        return Id;
    }

    private void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public User(String name, int age, String login, String password) {
        Name = name;
        Age = age;
        Login = login;
        Password = password;
    }

    public boolean gerarId(int baseNumber){
        if(baseNumber > 0){
            setId(baseNumber*2);
            return true;
        }else{
            return false;
        }
    }
}
