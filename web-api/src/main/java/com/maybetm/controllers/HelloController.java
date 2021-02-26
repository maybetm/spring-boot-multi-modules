package com.maybetm.controllers;

import com.maybetm.data.transport.GetDataService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zebzeev-sv
 * @version 04.11.2020 1:15
 */
@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/hello")
public class HelloController {

	private final GetDataService getDataService;

	@GetMapping
	public ResponseEntity<Map<String, String>> hello(@RequestParam String message) {
		String outSystemMessage = getDataService.getOutSystemMessage();

		log.info("out application message: {}", outSystemMessage);
		log.info("user message: {}", message);

		Map<String, String> response = new HashMap<String, String>() {{
			put("helloMessage", message);
			put("outAppMessage", outSystemMessage);
		}};

		return ResponseEntity
				.ok(response);
	}
}
