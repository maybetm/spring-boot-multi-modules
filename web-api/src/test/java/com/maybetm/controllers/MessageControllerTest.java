package com.maybetm.controllers;

import com.maybetm.WebApiAppMain;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @author zebzeev-sv
 * @version 08.11.2020 21:16
 */
@SpringBootTest(classes = WebApiAppMain.class)
@AutoConfigureMockMvc
class MessageControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void getAllMessages() throws Exception {
		mockMvc.perform(get("/messages/getAllMsg"));
	}
}