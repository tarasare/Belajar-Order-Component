package com.sopiyan.belajarcomponentorder;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class GolonganKetiga implements Golongan{
    @Override
    public int getGolongan() {
        return 3;
    }
}
