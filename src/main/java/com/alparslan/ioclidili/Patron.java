package com.alparslan.ioclidili;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;

@Dependent
public class Patron implements PatronInterface {

    @Override
    public String surum(String data){
        return "sürüm "+data;
    }
}
