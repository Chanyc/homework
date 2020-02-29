package com.gupao.cyc.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton() {}

    private static Map<String, Object> map = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String name) {
        if (!map.containsKey(name)) {
            Object o = null;
            if (!map.containsKey(name)) {
                try {
                    synchronized (ContainerSingleton.class) {
                        if (!map.containsKey(name)) {
                            o = Class.forName(name).newInstance();
                            map.put(name, o);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return o;
        } else {
            return map.get(name);
        }
    }

}
