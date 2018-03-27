package com.example.microservicesbasics.kittens.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KittensWeb {
	@Value("${kittensUrl:default.url}")
	private String kittensUrl;
	
	@RequestMapping("/kittens")
	@ResponseBody
	KittensWebResult kittens() {
		KittensWebResult kwRes = new KittensWebResult();
		kwRes.setId("1");
		kwRes.setName("kitty "+kittensUrl);
		return kwRes;
	}
}
