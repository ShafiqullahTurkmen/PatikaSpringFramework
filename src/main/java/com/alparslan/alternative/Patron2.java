package com.alparslan.alternative;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;

@Dependent
@Alternative
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data){
        return "Patron 2 sürüm "+data;
    }
}
