package com.example.nb.dao;

import com.example.nb.entity.Profesor;
import org.springframework.data.repository.CrudRepository;

public interface IProfesorDao extends CrudRepository<Profesor, Long> {
}
