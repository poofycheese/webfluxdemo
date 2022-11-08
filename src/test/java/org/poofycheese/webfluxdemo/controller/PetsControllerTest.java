package org.poofycheese.webfluxdemo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.poofycheese.webfluxdemo.model.Pet;
import org.poofycheese.webfluxdemo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;


@ExtendWith(SpringExtension.class)
@WebFluxTest(PetsController.class)
@Import(PetService.class)
public class PetsControllerTest {

	@Autowired
    WebTestClient webTestClient;

	
	@Test
	public void testPets() {
		List<Pet> petList = webTestClient.get()
         	.uri("/pets")
         	.accept(MediaType.APPLICATION_JSON)
         	.exchange()
         	.expectStatus().isOk()
         	.expectBodyList(Pet.class)
         	.hasSize(4)
         	.returnResult()
         	.getResponseBody();
		
		assertEquals("Jenny", petList.get(0).getName());
		assertEquals("Cat", petList.get(0).getType());
		assertEquals("Jibby", petList.get(0).getOwnersName());
	}
}
