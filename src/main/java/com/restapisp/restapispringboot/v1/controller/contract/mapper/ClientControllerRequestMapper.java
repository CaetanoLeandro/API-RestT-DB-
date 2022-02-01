package com.restapisp.restapispringboot.v1.controller.contract.mapper;

import com.restapisp.restapispringboot.v1.controller.contract.model.ClientRequestController;
import com.restapisp.restapispringboot.v1.entity.Client;

public class ClientControllerRequestMapper {

    public static Client toEntity(ClientRequestController clientRequestService){
        return Client.builder()
                .id(clientRequestService.getId())
                .name(clientRequestService.getName())
                .address(clientRequestService.getAddress())
                .date(clientRequestService.getDate())
                .build();
    }
}
