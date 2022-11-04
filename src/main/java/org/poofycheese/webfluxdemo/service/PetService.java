package org.poofycheese.webfluxdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.poofycheese.webfluxdemo.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PetService {

	static List<Pet> PET_LIST = new ArrayList<>(List.of(
			new Pet("Jenny" ,"Cat","Jibby" ),
			new Pet("Annie","Cat", "Brew"),
			new Pet("Star Light", "Cat", "Poof"),
			new Pet("Kelso", "Dog", "Poof")));
	
	public Flux<Pet> getAllPets(){
		return Flux.fromIterable(PET_LIST);
	}
	
	public Mono<Pet> getPetByName(String name){
		Pet p = PET_LIST.stream()
				.filter(pet -> name.equals(pet.getName()))
				.findAny()
				.orElse(null);
		return Mono.just(p);
	}

}
