package br.com.dsMovie.controller;

import br.com.dsMovie.dto.UserDTO;
import br.com.dsMovie.entities.User;
import br.com.dsMovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public Page<UserDTO> findAll(Pageable pageable){
        Page<UserDTO> lstUser = service.findAll(pageable);
        return lstUser;
    }
    @GetMapping(value = "/{id}")
    public UserDTO findById(@PathVariable Long id){
        UserDTO userDTO = service.findById(id);
        return userDTO;
    }
}
