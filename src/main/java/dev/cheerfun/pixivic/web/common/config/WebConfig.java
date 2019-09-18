package dev.cheerfun.pixivic.web.common.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * @author echo huang
 * @version 1.0
 * @date 2019-07-13 11:38
 * @description webmvc配置类
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    /**
     * 需要拦截的路径
     *
     * @return
     */
    private List<String> interceptPaths() {
        List<String> interceptPath = Lists.newArrayList();
        interceptPath.add("/**");
        return interceptPath;
    }

    /**
     * 白名单
     *
     * @return
     */
    private List<String> whitePanel() {
        List<String> interceptPath = Lists.newArrayList();
        return interceptPath;
    }
/*    @Bean
    CorsWebFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("https://pixivic.com");
        config.addAllowedOrigin("https://m.picivic.com");
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsWebFilter(source);
    }*/

}