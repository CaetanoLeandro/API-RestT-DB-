package com.restapisp.restapispringboot.v1.service.mapper;


import com.restapisp.restapispringboot.v1.entity.Client;
import com.restapisp.restapispringboot.v1.service.model.ClientResponseService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClientMapperAddress {

    static ClientResponseService toClientResponseService(Client client){
        return Mappers.getMapper(ClientMapperAddress.class).map
    }
}
