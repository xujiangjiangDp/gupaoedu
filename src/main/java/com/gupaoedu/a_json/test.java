package com.gupaoedu.a_json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        JSONObject jsonObject1 = new JSONObject();
        System.out.println("======json=====");
        jsonObject1.put("id","123");
        jsonObject1.put("name","lily");
        System.out.println(jsonObject1.toString());

        System.out.println("======json转对象=====");
        Person p =  JSONObject.toJavaObject(jsonObject1,Person.class);
        System.out.println(p.getName());

        System.out.println("======String转对象=====");
        Person p1 =  JSONObject.parseObject(jsonObject1.toString(),Person.class);
        System.out.println(p1.getId());

        System.out.println("======对象转json=====");
        Person person = new Person();
        person.setId("1234");
        person.setName("tom");
        JSONObject personJson = (JSONObject) JSONObject.toJSON(person);
        System.out.println(personJson);

        System.out.println("======String转Map=====");
        Map personMap =  JSONObject.parseObject(jsonObject1.toString(), Map.class);
        System.out.println(personMap);


        System.out.println("======jsonArray=====");
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject1);
        jsonArray.add(person);
        System.out.println(jsonArray.toString());

        System.out.println("======jsonArray转对象=====");
        List<Person> personList =JSONArray.parseArray(jsonArray.toString(),Person.class);
        System.out.println(personList);
        System.out.println(JSONArray.toJSONString(personList));

        System.out.println("======jsonArray转Map=====");
        List<Map> personMapList =JSONObject.parseObject(jsonArray.toString(),List.class);
        System.out.println(personMapList);
    }
}
