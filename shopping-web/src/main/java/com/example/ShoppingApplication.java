package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: hanchaowei
 * @date 2023/9/16
 * @description:
 */
@SpringBootApplication
@EnableTransactionManagement
public class ShoppingApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
		System.out.println("启动成功");
	}
}
