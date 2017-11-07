package com.my.study.proxy;

/**
 * Created by lixuelin on 17/9/14.
 */
public class UserServiceImpl {
    public void add() {
        System.out.println("This is add service");
    }
    public void delete(int id) {
        System.out.println("This is delete service：delete " + id );
    }
}