package com.springjdbc.poc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("My program started for the students....");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
        System.out.println("okay");
        
       // insert query
       String query = "insert into student(id,name,city) values(?,?,?)";
        System.out.println("insert query ");
        
        //fire the query
        //int result = jdbcTemplate.update(query,18,"Virat","Delhi");
        int val = jdbcTemplate.update(query,19,"DK","Chennai");
        System.out.println("rows effected ..."+val);
        
        //UPDATING QUERY
//        String query1 = "update student set name=? ,city=? where id=?";
//        int val1 = jdbcTemplate.update(query1,"AbDeveliiers","Banglore",17);
//        System.out.println("one row  updated.."+val1);
        
        //deleting query
//        String query2 = "delete from student where id=?";
//        int val2= jdbcTemplate.update(query2,19);
//        System.out.println("one row deleted");
        
    }
    
}