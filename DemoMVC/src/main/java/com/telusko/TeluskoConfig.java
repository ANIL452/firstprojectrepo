package com.telusko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.telusko"})  // @ComponentScan({"com.telusko","com.test"})  //telusko-servlet.xml file deleted
public class TeluskoConfig {
	
   @Bean
   public InternalResourceViewResolver viewResolver() {
	   InternalResourceViewResolver vr = new InternalResourceViewResolver();
	   vr.setPrefix("/WEB-INF/");
	   vr.setSuffix(".jsp");
	   return vr;
   }
}



/*
 *teluko-servlet.xml file data
 * 
 * <beans xmlns="http://www.springframework.org/schema/beans"
xmlns:ctx="http://www.springframework.org/schema/context"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:mvc="http://www.springframework.org/schema/mvc"
xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
http://www.springframework.org/schema/mvc
http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd
http://www.springframework.org/schema/context
http://www.springframework.org/schema/context/spring-context-2.5.xsd
">
<ctx:annotation-config></ctx:annotation-config>
<ctx:component-scan base-package="com.telusko"></ctx:component-scan>
</beans>*/
