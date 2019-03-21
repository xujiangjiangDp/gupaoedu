package com.gupaoedu.d_delegate;

public class EmployeeB implements  Employee {
    @Override
    public void work(String key) {
        System.out.println("员工B，do "+key);
    }
}
