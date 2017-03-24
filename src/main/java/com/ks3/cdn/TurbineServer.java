package com.ks3.cdn;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by ZHANSONG on 2017/3/14.
 */
@SpringBootApplication
@EnableTurbine
public class TurbineServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineServer.class).web(true).run(args);
    }
}
