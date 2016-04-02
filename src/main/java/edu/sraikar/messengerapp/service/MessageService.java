package edu.sraikar.messengerapp.service;

import java.util.ArrayList;
import java.util.List;

import edu.sraikar.messengerapp.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L,"Hello World!","Sandeep");
		Message m2 = new Message(2L,"Hello Jersey!!","Raikar");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
