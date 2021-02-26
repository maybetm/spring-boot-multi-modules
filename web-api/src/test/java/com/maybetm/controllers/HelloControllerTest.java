package com.maybetm.controllers;

import com.maybetm.data.transport.GetDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @author zebzeev-sv
 * @version 04.11.2020 1:33
 */
@WebMvcTest(HelloController.class)
@AutoConfigureWebClient
@SpyBean(GetDataService.class)
class HelloControllerTest
{

	@Autowired
	private MockMvc mockMvc;

	@Test
	void hello() throws Exception
	{
		mockMvc.perform(get("/hello").queryParam("message", "hello app"));
	}
}