package com.udea.proyecto.servicios;

import com.udea.proyecto.entidades.Empleado;
import com.udea.proyecto.repositorio.RepositorioEmpleado;
import org.hibernate.annotations.common.reflection.ReflectionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServicioEmpleado implements IServicioEmpleado {

    @Autowired
    private RepositorioEmpleado repositorioEmpleado;
    @Override
    public List<Empleado> listarEmpleados() {
        return repositorioEmpleado.findAll();
    }

    @Override
    public Empleado guardarEmpleados(Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }

    @Override
    public Empleado buscarEmpleadosId(Integer numid) {
        return repositorioEmpleado.findById(numid.longValue()).get();
    }

    @Override
    public Empleado actualizarEmpleados(Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }

    @Override
    public void borrarEmpleados(Integer numid) {
        repositorioEmpleado.deleteById(numid.longValue());

    }
    @Override
    public Empleado actualizarPorId(Long id, Map<Object, Object> objectMap) {
        Empleado emp=repositorioEmpleado.findById(id).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empleado.class,(String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field,emp,value);
        });
        return repositorioEmpleado.save(emp);
    }
}
