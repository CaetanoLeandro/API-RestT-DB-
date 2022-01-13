package com.restapisp.restapispringboot.v1.repository;

import com.restapisp.restapispringboot.v1.model.ClientModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ClientRepository extends MongoRepository<ClientModel, String>{

}

//public interface ClientRepository extends JpaRepository<ClientModel,Long> {
//
//}
