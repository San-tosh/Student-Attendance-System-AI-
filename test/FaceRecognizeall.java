/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import JDBC.Crud;
import demo.View;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SuperNatural
 */
public class FaceRecognizeall {
    
    @Test
    public void facerecognizeworkingornot(){
        View  obj=new View();
        try{
        //obj.facerecognize();
        }catch(Exception e){e.printStackTrace();}
    }
    @Test
    public void testInsert() throws SQLException{
        int status[]=new int[25];
        for(int i=0;i<25;i++) status[i]=0;
        status[0]=3;
        
        status[5]=5;
        
        
    }
    
}
