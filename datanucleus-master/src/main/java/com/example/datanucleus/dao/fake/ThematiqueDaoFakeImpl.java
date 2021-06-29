package com.example.datanucleus.dao.fake;

import com.example.datanucleus.dao.Fil;
import com.example.datanucleus.dao.Thematique;
import com.example.datanucleus.dao.ThematiqueDao;

public class ThematiqueDaoFakeImpl implements ThematiqueDao {

    @Override
    public void addThematique(Thematique thematique) {
        System.out.println("addThematique");
        
    }

    @Override
    public void addFilToThematique(Thematique thematique, Fil fil) {
        System.out.println("addFilToThematique");
        
    }

    @Override
    public void suppThematique(Thematique thematique) {
        System.out.println("suppThematique");
        
    }
    
}
