package com.restapisp.restapispringboot.v1.controller;

import com.restapisp.restapispringboot.v1.model.ClientModel;
import com.restapisp.restapispringboot.v1.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/clientes")

public class ClientController {

    private ClientService service;

    //POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientModel saveCliente (@RequestBody @Valid ClientModel clientModel){
        return service.saveClient(clientModel);
    }

    //PUT
    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ClientModel createClient(@RequestBody @Valid ClientModel clientModel, @PathVariable Long id){
        return service.createClient(clientModel, id);
    }

    //PATCH
    @PatchMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ClientModel toEditClient(@RequestBody @Valid ClientModel clientModel, @PathVariable Long id){
        return service.toEditClient(clientModel,id);

    }

    //GET
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ClientModel findClient(@RequestBody @Valid Long id){
        return service.findClient(id);
    }

    //GET ALL
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClientModel> listClient (){
        return  service.listAll();
    }

    //DELETE
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClient(@RequestParam(required = false) List<Long> id){
        service.deleteClient(id);

    }
}
