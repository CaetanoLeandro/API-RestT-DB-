package com.restapisp.restapispringboot.v1.service.v1;


import com.restapisp.restapispringboot.v1.entity.Client;
import com.restapisp.restapispringboot.v1.exceptions.notfound.NotFoundException;
import com.restapisp.restapispringboot.v1.model.ClientModel;
import com.restapisp.restapispringboot.v1.repository.ClientRepository;
import com.restapisp.restapispringboot.v1.service.model.ClientRequestService;
import com.restapisp.restapispringboot.v1.service.model.ClientResponseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.util.CollectionUtils.isEmpty;

@AllArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;

    //POST
    public ClientResponseService save(Client client) {
        return toC.save(client);
    }

    //PUT
    public ClientResponseService createClient(ClientRequestService client, String id) {
        ClientResponseService clientResponseService1 = clientRepository.findById((id))
                .orElseThrow(() -> new NotFoundException("ID not found"));
        client.setName(clientResponseService1.getName());
        return clientRepository.save(clientResponseService1);
    }

    //Patch
    public ClientResponseService update(ClientRequestService client, String id){
        ClientResponseService clientResponseService1 = clientRepository.findById((id))
                .orElseThrow(() -> new NotFoundException("ID not found"));
        client.setId(clientResponseService1.getId());
        return clientRepository.save(clientResponseService1);
    }

    //GET
    public ClientResponseService findById(String id) {
        return clientRepository.findBy(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
    }

    //GET ALL
    public List<ClientResponseService> findAll() {
        return clientRepository.findAll();
    }

    //DELETE
    public void delete(List<String> id){
        if(!isEmpty(id)){
            var erase = clientRepository.findAllById(id);
            clientRepository.deleteAll(erase);
        }
        else{
            clientRepository.deleteAll(clientRepository.findAll());
        }
    }
}
