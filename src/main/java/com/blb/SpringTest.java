package com.blb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: Mr.Xue
 * @Description:
 * @Date: Created in 15:40 2019/12/25
 */
@SpringBootApplication
@MapperScan("com.blb.mapper")
public class SpringTest {
    public static void main(String[] args) {
        SpringApplication.run(SpringTest.class,args);
    }
}
