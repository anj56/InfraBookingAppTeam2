package com.infrabookingapp.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class BookingContollerTest {

	@Autowired
	private MockMvc mock;
	
	@Test
	public void deleteBookingByIdTest() throws Exception {
		
		mock.perform(MockMvcRequestBuilders.delete("/booking/{id}"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("deleted"));
		
	}
	@Test
	public void updateBookingByIdTest() throws Exception {
		mock.perform(MockMvcRequestBuilders.put("/booking/{id}"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("updated"));
		
		
	}
}
