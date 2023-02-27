package com.alparslan.alternative;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;

@Dependent
@Alternative
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data){
        return "Patron 1 sürüm "+data;
    }
}
