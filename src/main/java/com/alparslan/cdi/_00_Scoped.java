package com.alparslan.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;

// Kapsam, yaşam süresi, performansımızı + -
@Named
//@ApplicationScoped // bütün uygulaman boyunca çalışıyor bütün kullanıcılar
//@RequestScoped // 1 istek boyunca
//@SessionScoped // 1 kullanıcı için yaşar ancak logout
//@Dependent // bukelemon
//@ConversationScoped // belli istek boyunca yaşar
//@SessionScoped // Bean 1 isntance olmasını sağlamak için
public class _00_Scoped {
}
