package com.generation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.model.ClienteRegistroModel;
//esto va en segundo lugar
@Repository
public interface ClienteRepository extends JpaRepository<ClienteRegistroModel,Integer>{

}
