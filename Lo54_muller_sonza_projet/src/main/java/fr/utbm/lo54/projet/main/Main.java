/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.lo54.projet.main;

import org.hibernate.cfg.AnnotationConfiguration;
import fr.utbm.lo54.projet.entity.*;
import fr.utbm.lo54.projet.repository.CourseDao;
import org.hibernate.tool.hbm2ddl.SchemaExport;
/**
 *
 * @author vsonza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        AnnotationConfiguration conf = new AnnotationConfiguration();
//        conf.addAnnotatedClass(Client.class);
//        conf.addAnnotatedClass(Location.class);
//        conf.addAnnotatedClass(Sessions.class);
//        conf.addAnnotatedClass(Course.class);
//        //conf.addClass(Client.class);
//        //conf.addClass(Location.class);
//        //conf.addClass(Sessions.class);
//        //conf.addClass(Course.class);
//        conf.configure("hibernate.cfg.xml");
        //new SchemaExport(conf).create(true,true);
        Course c=new Course("LO54","LO54");
        CourseDao CDao=new CourseDao();
        CDao.connect();
        CDao.addCourse(c);
        CDao.getAllCourses();
        System.out.print(CDao.getAllCourses());
        CDao.disconnect();
    }
    
}
