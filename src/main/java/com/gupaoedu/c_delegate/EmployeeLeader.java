package com.gupaoedu.c_delegate;

import java.util.HashMap;
import java.util.Map;

public class EmployeeLeader implements Employee{
    public  static Map<String, Employee> map = new HashMap<String, Employee>();

    public EmployeeLeader(){
        map.put("A",new EmployeeA());
        map.put("B",new EmployeeB());
    }

    @Override
    public void work(String key) {
        map.get(key).work(key);
    }
}
