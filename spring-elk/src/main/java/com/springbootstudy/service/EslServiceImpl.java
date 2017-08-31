package com.springbootstudy.service;

import com.springbootstudy.dao.ClienteRepository;
import com.springbootstudy.model.Cliente;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EslServiceImpl implements EslService {
    @Autowired
    private ClienteRepository clienteDao;

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(EslServiceImpl.class);

    @Override
    public Cliente findCliente(String id) {

        Cliente cliente = clienteDao.findOne(id);
        LOG.info(" get cliente by id {} is {}", id, cliente);
        return cliente;
    }

    @Override
    public Cliente addCliente(Cliente cliente) {
        Cliente cliente1= clienteDao.save(cliente);
        return cliente1;
    }
}  