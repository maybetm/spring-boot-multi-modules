package com.maybetm.db.service;

import com.maybetm.db.service.entities.Message;
import com.maybetm.db.service.repositories.MessageRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zebzeev-sv
 * @version 04.11.2020 23:27
 */
@Service
@AllArgsConstructor
public class MessageService
{

	private final MessageRepo messageRepo;

	public List<Message> getAll()
	{
		return messageRepo.findAll();
	}

	public Message createNewMessage(String text)
	{
		Message message = new Message();
		message.setText(text);

		return messageRepo.save(message);
	}
}
