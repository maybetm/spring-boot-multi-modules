package com.maybetm.controllers;

import com.maybetm.db.service.MessageService;
import com.maybetm.db.service.entities.Message;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zebzeev-sv
 * @version 04.11.2020 23:30
 */
@RestController
@RequestMapping ("/messages")
@AllArgsConstructor
public class MessageController
{

	private final MessageService messageService;

	@GetMapping ("/getAllMsg")
	public ResponseEntity<List<Message>> getAllMessages()
	{
		return ResponseEntity
				.ok(messageService.getAll());
	}

	@GetMapping("/createMsg")
	public ResponseEntity<Message> createMessage(@RequestParam String textMsg)
	{
		return ResponseEntity
				.ok(messageService.createNewMessage(textMsg));
	}
}
