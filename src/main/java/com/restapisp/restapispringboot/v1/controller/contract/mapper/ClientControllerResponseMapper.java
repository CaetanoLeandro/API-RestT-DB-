package com.restapisp.restapispringboot.v1.controller.contract.mapper;

import com.restapisp.restapispringboot.v1.controller.contract.model.ClientResponseController;
import com.restapisp.restapispringboot.v1.entity.Client;

public class ClientControllerResponseMapper {
    public static ClientResponseController toClientControllerResponse(Client client){
        return ClientResponseController.builder()
                .id(client.getId())
                .name(client.getName())
                .address(client.getAddress())
                .date(client.getDate())
                .build();
    }
}
