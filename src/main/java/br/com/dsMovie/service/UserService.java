package br.com.dsMovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.dsMovie.dto.UserDTO;
import br.com.dsMovie.entities.User;
import br.com.dsMovie.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public Page<UserDTO> findAll(Pageable pageable){
		Page<User> lstUser = repository.findAll(pageable);
		Page<UserDTO> lstUserDTO = lstUser.map(x-> new UserDTO(x));
		return lstUserDTO;
	}
	@Transactional(readOnly = true)
	public UserDTO findById(Long id){
		User user = repository.findById(id).get();
		UserDTO userDTO = new UserDTO(user);
		return userDTO;
	}

}
