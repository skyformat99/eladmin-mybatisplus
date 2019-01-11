package me.zhengjie;

import me.zhengjie.common.utils.SpringContextHolder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

/**
 * @author jie
 * @date 2018/11/15 9:20:19
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableWebSocketMessageBroker
@MapperScan({"me.hemiao100.zhengjie.**.*.mapper"})
public class AppRun {

    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }
}
