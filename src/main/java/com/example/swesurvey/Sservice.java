package com.example.swesurvey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Sservice {
    @Autowired
    Srepository srepository;
    
    public List<Smodel> getAllSurveys() {
        List<Smodel> surveylist = srepository.findAll();
        return surveylist;
    }

    public Smodel getSurveyById(int id) {
        return srepository.findById(id);
    }

    public void saveSurvey(Smodel s) {
        try {
            srepository.save(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int deleteSurvey(int id) {
        try {
            return srepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}