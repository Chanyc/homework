package com.gupao.cyc.prototype;

import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> course = new ArrayList<String>();
        course.add("Java P6");
        course.add("大数据");

        GuPao pao = new GuPao();
        pao.setGuPaoName("沽泡学院");
        pao.setCourse(course);

        JSONObject jsonObject = JSONObject.fromObject(pao);
        GuPao newGuPao = (GuPao) JSONObject.toBean(jsonObject, GuPao.class);

        newGuPao.setCourse(new ArrayList<String>());

        System.out.println(pao.getCourse() == newGuPao.getCourse());

    }

}
