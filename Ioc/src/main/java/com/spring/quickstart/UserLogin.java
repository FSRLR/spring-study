package com.spring.quickstart;

public class UserLogin {
    private User user;


    public UserLogin() {
        super();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserLogin(User user) {
        this.user = user;
    }

    public boolean userLogin(){
        boolean flag=false;
        if (user.getUsername().equals("FSR") && user.getPassword().equals("123123")){
            flag=true;
        }
        return flag;
    }

}
