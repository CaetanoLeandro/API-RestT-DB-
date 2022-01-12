package com.restapisp.restapispringboot.v1.repository;

import com.restapisp.restapispringboot.v1.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel,Long> {

}
