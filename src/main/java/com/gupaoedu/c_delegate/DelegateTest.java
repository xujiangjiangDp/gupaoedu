package com.gupaoedu.c_delegate;

public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.work("B", new EmployeeLeader());
    }
}
