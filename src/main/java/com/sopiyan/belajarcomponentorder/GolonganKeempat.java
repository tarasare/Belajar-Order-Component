package com.sopiyan.belajarcomponentorder;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class GolonganKeempat implements Golongan{
    @Override
    public int getGolongan() {
        return 4;
    }
}
