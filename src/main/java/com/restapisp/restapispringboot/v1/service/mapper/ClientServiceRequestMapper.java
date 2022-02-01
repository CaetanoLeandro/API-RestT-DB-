package com.restapisp.restapispringboot.v1.service.mapper;

import com.restapisp.restapispringboot.v1.entity.Client;
import com.restapisp.restapispringboot.v1.service.model.ClientRequestService;

public class ClientServiceRequestMapper {

    public static Client toEntity(ClientRequestService clientRequestService){
        return Client.builder()
                .id(clientRequestService.getId())
                .name(clientRequestService.getName())
                .address(clientRequestService.getAddress())
                .date(clientRequestService.getDate())
                .build();
    }
}
