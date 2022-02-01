package com.restapisp.restapispringboot.v1.controller.contract.facade;

import com.restapisp.restapispringboot.v1.controller.contract.mapper.ClientControllerResponseMapper;
import com.restapisp.restapispringboot.v1.controller.contract.model.ClientRequestController;
import com.restapisp.restapispringboot.v1.controller.contract.model.ClientResponseController;
import com.restapisp.restapispringboot.v1.service.model.ClientRequestService;
import com.restapisp.restapispringboot.v1.service.v1.ClientFacadeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.restapisp.restapispringboot.v1.controller.contract.mapper.ClientControllerResponseMapper.toClientControllerResponse;

@AllArgsConstructor
@Service
public class ClientFacadeController {

    private final ClientFacadeService clientFacadeService;


    public ClientResponseController findById(String id){
        return toClientControllerResponse(clientFacadeService.findById(id));
    }

    public List<ClientResponseController> findAll(){
        return clientFacadeService.findAll().stream()
                .map(ClientControllerResponseMapper::toClientControllerResponse)
                .collect(Collectors.toList());
    }

    public ClientResponseController save(ClientRequestController clientRequestController){
        ClientRequestService clientRequestService = toClientControllerResponse(clientRequestController);
        return toClientControllerResponse(clientFacadeService.save(clientRequestService));
    }

    public ClientResponseController update(String id, ClientRequestController clientRequestController){
        ClientRequestService clientRequestService = toClientControllerResponse(clientRequestController, id);
        return toClientControllerResponse(clientFacadeService.patchById(id, clientRequestService));
    }

    public void delete(String id){
        clientFacadeService.delete(id);

    }
}
