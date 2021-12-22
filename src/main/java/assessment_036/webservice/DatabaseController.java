/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessment_036.webservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author RIVKY RIYANTORO
 */
@Controller
public class DatabaseController {
    @CrossOrigin
   @RequestMapping(value = "/data", produces = {
    MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Data> getData(){
        
        List<Data> data = new ArrayList<>();
        
       DataJpaController controller = new DataJpaController();
        
        try{
            data = controller.findDataEntities();
        } catch(Exception e){}
        
        return data;
    }
    
    @CrossOrigin
   @RequestMapping(value = "/data/xml", produces = {
    MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Data> getDataXML(){
        
        List<Data> data = new ArrayList<>();
        
       DataJpaController controller = new DataJpaController();
        
        try{
            data = controller.findDataEntities();
        } catch(Exception e){}
        
        return data;
    }
}