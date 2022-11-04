package org.poofycheese.webfluxdemo.controller;

import org.poofycheese.webfluxdemo.model.Pet;
import org.poofycheese.webfluxdemo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;


@RestController
public class PetController {

	@Autowired
	private PetService petService;
	
	@GetMapping("/pet/{name}")
	private Mono<Pet> getPetByName(@PathVariable String name){
		return petService.getPetByName(name);
	}
	
}
