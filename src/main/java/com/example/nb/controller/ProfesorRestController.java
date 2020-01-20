package com.example.nb.controller;

import com.example.nb.entity.Profesor;
import com.example.nb.service.ProfesorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfesorRestController {

    @Autowired
    private ProfesorServiceImpl profesorService;

    @RequestMapping(value = "/todos_los_profesores_public", method = RequestMethod.GET)
    public ResponseEntity<List<Profesor>> listAllProfesor() {
        List<Profesor> profesores = profesorService.findAllProfesor();
        if (profesores.isEmpty()) {
            return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
    }

    @RequestMapping(value = "/todos_los_profesores_admin", method = RequestMethod.GET)
    public ResponseEntity<List<Profesor>> listAllProfesorAdmin() {
        List<Profesor> profesores = profesorService.findAllProfesor();
        if (profesores.isEmpty()) {
            return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
    }

    @RequestMapping(value = "/todos_los_profesores_user", method = RequestMethod.GET)
    public ResponseEntity<List<Profesor>> listAllProfesorUser() {
        List<Profesor> profesores = profesorService.findAllProfesor();
        if (profesores.isEmpty()) {
            return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
    }
}
