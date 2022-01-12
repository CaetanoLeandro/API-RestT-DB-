package com.restapisp.restapispringboot.v1.service;


import com.restapisp.restapispringboot.v1.exceptions.notfound.NotFoundException;
import com.restapisp.restapispringboot.v1.model.ClientModel;
import com.restapisp.restapispringboot.v1.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;

    //POST
    public ClientModel saveClient(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    //PUT
    public ClientModel createClient(ClientModel clientModel, Long id) {
        ClientModel clientModel1 = clientRepository.findById((id))
                .orElseThrow(() -> new NotFoundException("ID not found"));
        clientModel.setName(clientModel1.getName());
        return clientRepository.save(clientModel);
    }

    //Patch
    public ClientModel toEditClient(ClientModel clientModel, Long id){
        ClientModel clientModel1 = clientRepository.findById((id))
                .orElseThrow(() -> new NotFoundException("ID not found"));
        clientModel.setId(clientModel1.getId());
        return clientRepository.save(clientModel1);
    }

    //GET
    public ClientModel findClient(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
    }

    //GET ALL
    public List<ClientModel> listAll() {
        return clientRepository.findAll();
    }

    //DELETE
    public void deleteClient(List<Long> id){
        if(!CollectionUtils.isEmpty(id)){
            var erase = clientRepository.findAllById(id);
            clientRepository.deleteAll(erase);
        }
        else{
            clientRepository.deleteAll(clientRepository.findAll());
        }
    }
}
