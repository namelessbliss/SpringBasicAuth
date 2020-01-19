package com.example.nb.service;

import com.example.nb.dao.IProfesorDao;
import com.example.nb.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProfesorService")
public class ProfesorServiceImpl implements IProfesorService {

    @Autowired
    private IProfesorDao profesorDao;

    @Override
    public List<Profesor> findAllProfesor() {
        return (List<Profesor>) profesorDao.findAll();
    }
}
