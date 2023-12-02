package com.example.swesurvey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Scontroller {
	    @Autowired
	    Srepository sr;
	    
	    @Autowired
	    Sservice ssr;
	    
	    @CrossOrigin
	    @RequestMapping(value = "/test", method = RequestMethod.GET)
	    @ResponseBody
	    public String Test() {
	        return "test A3";
	    }
	    
	    @CrossOrigin
	    @RequestMapping(value = "/surveylist", method = RequestMethod.GET)
	    @ResponseBody
	    public List<Smodel> getAllSurveysDetail() {
	        return ssr.getAllSurveys();
	    }
	    
	    @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping(value = "/s", method = RequestMethod.POST)
	    @ResponseBody
	    public Smodel addSurvey(@RequestBody Smodel s) {
	        try{
	        	return sr.save(s);
	        }
	        catch(Exception ex){
	            throw ex;
	        }
	    }
	    
	    @RequestMapping(value = "/findsurvey", method = RequestMethod.GET)
	    @ResponseBody
	    public Smodel findSurveyById(@RequestParam("sId") int sId) {
	    	return ssr.getSurveyById(sId);
	    }
	    
	    @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping(value = "/updatesurvey", method = RequestMethod.GET)
	    @ResponseBody
	    public Smodel updateStudent(@RequestBody Smodel s) {
	    	try{
	        	return sr.save(s);
	        }
	        catch(Exception ex){
	            throw ex;
	        }
	    }

	    @RequestMapping(value = "/deletesurvey", method = RequestMethod.GET)
	    @ResponseBody
	    public int deleteSurveyById(@RequestParam("sId") int sId) {

	    	return ssr.deleteSurvey(sId);
	    }

}