package org.poofycheese.webfluxdemo.controller;

import org.poofycheese.webfluxdemo.model.Pet;
import org.poofycheese.webfluxdemo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PetsController {

	@Autowired
	private PetService petService;
	
	@GetMapping("/pets")
	public Flux<Pet> getAllPets(){
		return petService.getAllPets();
	}
}
