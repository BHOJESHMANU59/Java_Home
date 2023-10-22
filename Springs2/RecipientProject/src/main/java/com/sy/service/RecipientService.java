package com.sy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.entity.Recipient;
import com.sy.repository.RecipientRepo;
@Service
public class RecipientService {

	@Autowired
	private RecipientRepo repo;
	public String sendAmount(int id, String name, double amt)
	{
		String creditStatus=repo.creditAmount(id,name,amt);
		return  creditStatus;
		
	}
	public String updateName(int id, String name) {
		String UpdateStatus=repo.updateName(id,name);
		return UpdateStatus;
	}
	public String delete(int id) {
		String Delete=repo.delete(id);
		return Delete;
	}
	
	public List<Recipient> fetch() {
		return repo.fetch();
	}

}
