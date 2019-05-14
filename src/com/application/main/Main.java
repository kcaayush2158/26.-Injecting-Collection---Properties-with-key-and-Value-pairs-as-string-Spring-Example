package com.application.main;

import com.application.model.UserInfo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;


public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        UserInfo userInfo = context.getBean("userInfo", UserInfo.class);
        Properties properties = userInfo.getProperties();
            Set<Entry<Object,Object>> entrySet = properties.entrySet();
            for(Entry<Object,Object> entryMap : entrySet){
                System.out.println(entryMap.getKey()+"\t"+entryMap.getValue());
            }
            context.close();
    }
}
