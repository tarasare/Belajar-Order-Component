package com.sopiyan.belajarcomponentorder;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class GolonganKedua implements Golongan {
    @Override
    public int getGolongan() {
        return 2;
    }
}
