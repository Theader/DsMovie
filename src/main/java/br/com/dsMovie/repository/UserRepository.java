package br.com.dsMovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dsMovie.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
