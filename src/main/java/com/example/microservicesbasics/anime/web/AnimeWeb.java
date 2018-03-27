package com.example.microservicesbasics.anime.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimeWeb {
	@RequestMapping("/anime")
	@ResponseBody
	AnimeWebResult anime() {
		AnimeWebResult awRes = new AnimeWebResult();
		awRes.setId("2");
		awRes.setName("anime");
		awRes.setUrl("stub.url");
		return awRes;
	}
}
