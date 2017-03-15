/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Rasheedarh
 */
public class TEST2 {
    static String id_name,name,age,stu_class,program;

    public static String getId_name() {
        return id_name;
    }

    public static void setId_name(String id_name) {
        TEST2.id_name = id_name;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TEST2.name = name;
    }

    public static String getAge() {
        return age;
    }

    public static void setAge(String age) {
        TEST2.age = age;
    }

    public static String getStu_class() {
        return stu_class;
    }

    public static void setStu_class(String stu_class) {
        TEST2.stu_class = stu_class;
    }

    public static String getProgram() {
        return program;
    }

    public static void setProgram(String program) {
        TEST2.program = program;
    }

    public static void writeFile() throws IOException
    { 
       try(BufferedWriter stud= new BufferedWriter(new FileWriter("TEST.txt",true))){ 
      stud.write(getAge()+" "+getStu_class() +" "+ getProgram()+" "+ getName() +" "+getId_name());
       stud.newLine();
       }
    }
    
}
