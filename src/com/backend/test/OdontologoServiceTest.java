package com.backend.test;

import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.dao.impl.OdontologoDaoMemoria;
import com.backend.entity.Odontologo;
import com.backend.service.impl.OdontologoService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

    private OdontologoService odontologoService;

    @Test
    void deberiaMostrarTodosLosOdontologosRegistradosEnH2() {

        OdontologoDaoH2 odontologoDaoH2 = new OdontologoDaoH2();

        this.odontologoService = new OdontologoService(odontologoDaoH2);

        List<Odontologo> odontologos = odontologoService.listarOdontologos();

        assertFalse(odontologos.isEmpty());
        assertEquals(3, odontologos.size());

    }

    @Test
    void deberiaMostrarTodosLosOdontologosRegistradosEnMemoria() {

        List<Odontologo> odontologoRepository = new ArrayList<>();
        OdontologoDaoMemoria odontologoDaoMemoria = new OdontologoDaoMemoria(odontologoRepository);

        this.odontologoService = new OdontologoService(odontologoDaoMemoria);

        List<Odontologo> odontologos = odontologoService.listarOdontologos();

        Odontologo odontologo1 = new Odontologo("1234", "Moro", "Hernandez");
        Odontologo odontologo2 = new Odontologo("5678", "Carlos", "Barboza");
        Odontologo odontologo3 = new Odontologo("666", "Fernando", "Palmas");

        odontologoService.registrarOdontologo(odontologo1);
        odontologoService.registrarOdontologo(odontologo2);
        odontologoService.registrarOdontologo(odontologo3);


        assertFalse(odontologos.isEmpty());
        assertEquals(3, odontologos.size());

    }
}

