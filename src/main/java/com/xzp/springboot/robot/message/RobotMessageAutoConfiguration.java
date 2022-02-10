package com.xzp.springboot.robot.message;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link EnableAutoConfiguration Auto-configuration} for Robot Message support.
 *
 * @author xuzhipeng
 * @since 1.0.0
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(RobotMessageProperties.class)
public class RobotMessageAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(name = "robotMessageTemplate")
    public RobotMessageTemplate robotMessageTemplate(){
        return new RobotMessageTemplate();
    }
}
