/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.jdbcspring.test;

import app.jdbcspring.dao.ServicioDAO;
import app.jdbcspring.model.Servicio;
import app.jdbctemplate.model.Local;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrador
 */
public class AppTest {

    public static void main(String[] args) {
        AppTest.saveServicio();
    }

    public static void saveServicio() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_database.xml");
        ServicioDAO servicioDAO = (ServicioDAO) context.getBean("servicioDAO");

        Servicio Servicio = new Servicio();
        Servicio.setDescripcion("almuerzo campestre");
        Servicio.setCostoHora(100d);
        servicioDAO.save(Servicio);
    }

    /*public static void saveLocal() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_database.xml");
        LocalDAO localDAO = (LocalDAO) context.getBean("localDAO");

        Local local = new Local();
        local.setDescripcion("Local Chosica");
        local.setDireccion("Av. Arriola 3455");
        local.setEstado(1);
        local.setTelefono("01-123454");

        localDAO.save(local);
    }*/
}
