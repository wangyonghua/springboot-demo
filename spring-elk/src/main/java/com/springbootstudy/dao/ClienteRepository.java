package com.springbootstudy.dao;

import com.springbootstudy.model.Cliente;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ClienteRepository extends ElasticsearchRepository<Cliente, String> {
} 