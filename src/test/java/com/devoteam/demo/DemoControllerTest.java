package com.devoteam.demo;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = DemoController.class)
public class DemoControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void devoteam() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(content().string(containsString("Devoteam")));
	}
    @Test
	public void itech() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(content().string(containsString("Innovative Tech")));
	}
    @Test
	public void events() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(content().string(containsString("Events")));
	}
    @Test
	public void careers() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(content().string(containsString("Careers")));
	}
    @Test
	public void insights() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(content().string(containsString("Insights")));
	}
}
