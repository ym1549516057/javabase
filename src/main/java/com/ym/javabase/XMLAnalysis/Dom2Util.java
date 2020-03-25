package com.ym.javabase.XMLAnalysis;


import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.*;

public class Dom2Util {
    public static Map<String, Object> sqlMap = new HashMap<>();

    static {
        SAXReader saxReader = new SAXReader();
        ClassPathResource classPathResource = new ClassPathResource("test-content.xml");
        try {
            //读取xml文档
            Document document = saxReader.read(classPathResource.getURL());
            Map<String, Object> map = mapTo(document);
            sqlMap.put("mysql", map);
            System.out.println(">>>" + sqlMap);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析xml文档
     *
     * @param document
     * @return
     */
    public static Map<String, Object> mapTo(Document document) {
        Map<String, Object> map = new HashMap<>();
        Element root = document.getRootElement();
        Iterator<Element> elementIterator = root.elementIterator();
        while (elementIterator.hasNext()) {
            Element next = elementIterator.next();
            List<Attribute> attributes = next.attributes();
            map.put(attributes.get(0).getValue(), next.getText());
        }
        return map;
    }


    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();
        ClassPathResource classPathResource = new ClassPathResource("test-content.xml");
        try {
            Document document = saxReader.read(classPathResource.getURL());
            Map<String, Object> map = mapTo(document);
//            System.out.println(map);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
