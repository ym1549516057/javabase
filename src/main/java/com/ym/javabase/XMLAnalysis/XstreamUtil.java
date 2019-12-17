package com.ym.javabase.XMLAnalysis;

import com.thoughtworks.xstream.XStream;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.Map;

public class XstreamUtil {

    /**
     * 利用注解映射成对象
     *
     * @param clazz
     * @return
     */
    public static Object toBean(Class<?> clazz) {
        Object xmlObj = null;
        XStream xStream = new XStream();
        ClassPathResource classPathResource = new ClassPathResource("test.xml");
        xStream.processAnnotations(clazz);
        xStream.autodetectAnnotations(true);
        try {
            xmlObj = xStream.fromXML(classPathResource.getURL());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xmlObj;
    }

    public static Object toBeaNoAnation() {
        XStream xStream = new XStream();

        return null;
    }

    public static void main(String[] args) {
        CityList city = (CityList) toBean(CityList.class);
        System.out.println(city);
    }
}
