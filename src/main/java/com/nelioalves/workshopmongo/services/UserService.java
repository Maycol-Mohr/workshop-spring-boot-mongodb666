package com.nelioalves.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.repository.UserRepository;
import com.nelioalves.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
		public User findById(String id) {
			//User user = repo.findOne(id);
			Optional<User> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		//if(user == null) {	
		//if(obj == null) {
			//throw new ObjectNotFoundException("Objeto nao encontrado!");
	//	}
		
		//return user;
		//return user;
	}
}





















