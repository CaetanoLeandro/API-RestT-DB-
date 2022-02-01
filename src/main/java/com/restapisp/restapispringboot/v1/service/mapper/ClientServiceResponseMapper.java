package com.restapisp.restapispringboot.v1.service.mapper;

import com.restapisp.restapispringboot.v1.entity.Client;
import com.restapisp.restapispringboot.v1.service.model.ClientResponseService;

public class ClientServiceResponseMapper {
    public static ClientResponseService toClientServiceResponse(Client client){
        return ClientResponseService.builder()
                .id(client.getId())
                .name(client.getName())
                .address(client.getAddress())
                .date(client.getDate())
                .build();
    }
}
