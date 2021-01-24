package com.sopiyan.belajarcomponentorder;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GolonganOrderTests {
    @Autowired
    private List<Golongan> listGolongan;
    @Test
    void testGolonganOrder(){
        Assertions.assertEquals(1,listGolongan.get(0).getGolongan());
        Assertions.assertEquals(2,listGolongan.get(1).getGolongan());
        Assertions.assertEquals(3,listGolongan.get(2).getGolongan());
        Assertions.assertEquals(4, listGolongan.get(3).getGolongan());
    }
}
