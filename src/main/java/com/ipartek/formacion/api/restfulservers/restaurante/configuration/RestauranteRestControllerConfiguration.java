/**
 * 
 */
package com.ipartek.formacion.api.restfulservers.restaurante.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Alberto
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.ipartek.formacion.api.restfulservers.restaurante.configuration")
public class RestauranteRestControllerConfiguration {

}
