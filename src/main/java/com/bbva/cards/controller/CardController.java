package com.bbva.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.cards.dto.Cards;
import com.bbva.cards.service.ICardService;

@RestController
public class CardController {

	@Autowired
	private ICardService service;
	
	@PostMapping(value="save")
	public ResponseEntity<Boolean> save(@RequestBody Cards card){
		service.save(card);
		return ResponseEntity.ok(true);
	}
	
	@GetMapping(value="getAll")
	public ResponseEntity<List<Cards>> getAll(){
		
		return ResponseEntity.ok(service.findAll());
	}
	
	
	
}
