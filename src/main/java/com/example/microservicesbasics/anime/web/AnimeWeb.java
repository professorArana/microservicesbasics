package com.example.microservicesbasics.anime.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicesbasics.anime.logic.AnimeLogicManager;

@RestController
public class AnimeWeb {
	@Autowired
	AnimeLogicManager manager;
	@RequestMapping("/anime")
	@ResponseBody
	ResponseEntity<String> anime() {
		ResponseEntity<String> result = manager.obtainAnimeApiImageUrl();
//		AnimeWebResult awRes = new AnimeWebResult();
//		awRes.setUrl(result);
		
		return result;
	}
}
