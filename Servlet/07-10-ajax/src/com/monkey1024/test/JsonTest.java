package com.monkey1024.test;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.monkey1024.bean.City;
import com.monkey1024.bean.Province;

/**
 * 
 * fastjson
 *
 */
public class JsonTest {

	public static void main(String[] args) {
		City c1 = new City();
		c1.setId(1005);
		c1.setName("石家庄");
		
		City c2 = new City();
		c2.setId(1006);
		c2.setName("唐山");
		
		City c3 = new City();
		c3.setId(1007);
		c3.setName("保定");
		
		List<City> cities = new ArrayList<>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		
		Province hebei = new Province();
		hebei.setName("河北");
		hebei.setCities(cities);
		
		System.out.println(cities);
		
		String hebeiStr = JSON.toJSONString(hebei);
		System.out.println(hebeiStr);
		
		Province hebeiNew = JSON.parseObject(hebeiStr,Province.class);
		System.out.println(hebeiNew.getName());
		
		
	}

}
