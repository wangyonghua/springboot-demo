//package cn.controller;
//
//import javax.annotation.Resource;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import cn.entity.City;
//import cn.mapper.CityMapper;
//
//@RestController
//@RequestMapping("/demo")
//@EnableAutoConfiguration
//public class HelloController {
//	@Resource
//	private CityMapper cityMapper;
//	@RequestMapping("/test")
//	String test1(){
//		return "hello,test343434()";
//	}
//	@RequestMapping("/findCity2")
//	City findCity2(@RequestParam String id){
//		return cityMapper.findCityById(id);
//	}
//}
//
