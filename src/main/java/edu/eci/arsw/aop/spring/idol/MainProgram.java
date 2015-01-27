/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.aop.spring.idol;

import com.springinaction.springidol.Instrumentalist;
import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author hcadavid
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-simple-idol.xml");
        Performer pf=(Performer)ac.getBean("eddie");
        try {
            pf.perform();
        } catch (PerformanceException ex) {
            Logger.getLogger(MainProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
