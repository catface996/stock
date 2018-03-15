package com.hanma56.cloud.route.integration;

import com.hanma56.cloud.route.integration.gd.GDService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 张钟
 * @date 2018/3/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GDServiceTest {

    @Autowired
    private GDService gdService;

    @Test
    public void test(){
        List<String[]>  polyLint = gdService.getPolyLine(1l);
        System.out.println(polyLint);
    }
}
