package com.restapisp.restapispringboot.v1.service.v1;


import com.restapisp.restapispringboot.v1.integration.restTemplate.ConsumerApi;
import com.restapisp.restapispringboot.v1.service.model.ClientRequestService;
import com.restapisp.restapispringboot.v1.service.model.ClientResponseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class ClientFacadeService {

    final ClientService service;
    final ConsumerApi consumerApi;

    public ClientResponseService save(ClientRequestService client) {
        return service.save(client, consumerApi.mapAddress(client.getAddress()));
    }

    public ClientResponseService update(ClientRequestService client, String id) {
        return service.update(client, id);
    }

    public ClientResponseService findById(String id) {
       return service.findById(id);
    }

    public List<ClientResponseService> findAll() {
        return service.findAll();
    }

    public void delete(List<String> id){
        service.delete(id);
        }
}

