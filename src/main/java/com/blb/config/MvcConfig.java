package com.blb.config;

import com.blb.interceptor.LoginInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: Mr.Xue
 * @Description:
 * @Date: Created in 16:01 2019/12/25
 */
@Component
public class MvcConfig implements WebMvcConfigurer {
    public LoginInterceptor getLonginterceptor(){
        return new LoginInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getLonginterceptor()).addPathPatterns("/**");
    }
}
