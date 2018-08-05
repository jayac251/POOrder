package com.POOrder.App.Common.Reporting;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order/messagestore")
@RestController
public class MessageStoreController {
	
	
	@Autowired
	private MessageStoreDataRepo msgStoreDataRepo;
	
	
	@GetMapping(value="/all")
	public List<MessageStoreData> getMessageStoreData()
	{
		return (List<MessageStoreData>) msgStoreDataRepo.findAll();
	}
	
	
	

}
