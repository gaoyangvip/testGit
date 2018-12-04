package com.itheima.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建Bean对象的工厂
 *
 * Bean：在计算机英语中，有可重用组件的含义。
 * JavaBean：用java语言编写的可重用组件。
 *      javabean >  实体类
 *
 *   它就是创建我们的service和dao对象的。
 *
 *   第一个：需要一个配置文件来配置我们的service和dao
 *           配置的内容：唯一标识=全限定类名（key=value)
 *   第二个：通过读取配置文件中配置的内容，反射创建对象
 *
 *   我的配置文件可以是xml也可以是properties
 *
 *
 *
 *
 *   spring 底层实现原理
 *      通过反射加配置文件的模式实现降低耦合性，但是并不能解除耦合
 */
public class BeanFactory {
    private static Properties props;
    private static Map<String,Object> beans;

    static {
        try {
            //1.读取配置文件
            props = new Properties();
            //2.获取字节输入流加载数据
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            //3.实例化容器
            beans = new HashMap<String,Object>();
            //4.获取配置文件中的key
            Enumeration<Object> keys = props.keys();
            //5.遍历枚举获
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                //6.通过key获取value
                String beanpath = props.getProperty(key);
                //System.out.println(beanpath);
                //7.实例化对象
                Object value = Class.forName(beanpath).newInstance();
                //8.把key和value放入map集合个中
                beans.put(key,value);

            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }



    /**
     * 根据Bean的名称获取bean对象
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) {

        return beans.get(beanName);
    }


}

