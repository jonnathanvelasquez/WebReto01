package com.reto01.grupog6.CrudRepository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.reto01.grupog6.Entities.User;

public interface Usercrudrepository extends CrudRepository <User , Long>{
    
     public Optional<User> findByEmail(String email);
     public Optional<User> findByEmailandPassword(String email , String password);

}

