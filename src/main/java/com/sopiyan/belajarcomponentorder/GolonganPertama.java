package com.sopiyan.belajarcomponentorder;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class GolonganPertama implements Golongan {
    @Override
    public int getGolongan() {
        return 1;
    }
}
