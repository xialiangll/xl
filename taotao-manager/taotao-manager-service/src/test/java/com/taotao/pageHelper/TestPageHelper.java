package com.taotao.pageHelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

public class TestPageHelper {
	
	@SuppressWarnings("resource")
	@Test
	public void testPageHelper() throws Exception {
		//在mybaties的配置文件中配置分页插件
		//在执行查询之前配置分页条件，使用pageHelper的静态方法
		PageHelper.startPage(0, 10);
		//执行查询
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		//取分页信息，使用pageInfo对象取
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		
		System.out.println("总记录数"+pageInfo.getTotal());
		System.out.println("总页数"+pageInfo.getPages());
	}

}
