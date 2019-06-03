package com.example.demo.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by oa on 6/3/2019.
 */
@Configuration
public class WebMVCConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LogInterceptor())
                .addPathPatterns("/secure-code")
                .excludePathPatterns("/secure-code/public"); //by default applies to
        registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/auth");

        // Register admin interceptor with multiple path patterns
        /*registry.addInterceptor(new LogInterceptor())
                .addPathPatterns(new String[] { "/admin", "/admin*//*" });
*/
//        registry.addInterceptor((new SubLogInterceptor())).addPathPatterns("/admin/*").excludePathPatterns("admin/oldLogin");


    }
}
