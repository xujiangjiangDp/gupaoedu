package com.gupaoedu.c_delegate;

public class EmployeeA implements  Employee {
    @Override
    public void work(String key) {
        System.out.println("员工A，do "+key);
    }
}
