package com.alparslan.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Calisan {

    @Inject
    private PatronInterface patronInterface;



    public String getData(String data){
        return patronInterface.surum(data);
    }
}
