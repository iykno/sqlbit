package com.iykno.sqlbit.dynamic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.iykno.sqlbit.dynamic.service.DynamicTableService;

@RestController
@RequestMapping("/dynamicTable")
public class DynamicTableController {

	@Autowired
	private DynamicTableService dynamicTableService;
	
	//新增动态表
	@RequestMapping(value="/createTable",method=RequestMethod.GET)
	public JSONObject createTable(@RequestParam int configId) {
		JSONObject JSONObject = new JSONObject();
		JSONObject = dynamicTableService.createTable(configId);
		return JSONObject;
	}
	
	//动态表 加字段
		@RequestMapping(value="/delColumn",method=RequestMethod.GET)
		public JSONObject delColumn(@RequestParam int columnConfigId) {
			JSONObject JSONObject = new JSONObject();
			JSONObject = dynamicTableService.delColumn(columnConfigId);
			return JSONObject;
		}
	
	//动态表 加字段
	@RequestMapping(value="/addColumn",method=RequestMethod.GET)
	public JSONObject addColumn(@RequestParam int columnConfigId) {
		JSONObject JSONObject = new JSONObject();
		JSONObject = dynamicTableService.addColumn(columnConfigId);
		return JSONObject;
	}
}
