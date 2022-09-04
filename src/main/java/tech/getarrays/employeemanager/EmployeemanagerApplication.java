package tech.getarrays.employeemanager;


import java.util.Arrays;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EmployeemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerApplication.class, args);
	}	
	
	//configure CORS in a spring boot application
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurer() {
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/**")
	                    .allowedOrigins("https://localhost:4200")
	                    .allowedMethods("GET", "PUT", "POST", "OPTIONS", "DELETE")
	                    .allowedHeaders("Origin","Access-Control-Allow-Origin",
	            				"Content-Type","Accept","Authorization","Origin","Accept","X-Requested-With",
	            				"Access-Control-Request-Method","Access-Control-Request-Headers")
	                    .exposedHeaders("Origin","Content-Type","Accept","Authorization",
				"Access-Control-Allow-Origin","Access-Control-Allow-Origin","Access-Control-Allow-Credentials")
	                    .allowCredentials(true);
	        }
	    };
	}
	
//	@Bean
//	public CorsFilter corsFilter()
//	{
//		CorsConfiguration corsConfiguration = new CorsConfiguration();
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		corsConfiguration.setAllowCredentials(true);
//		corsConfiguration.setAllowedOrigins(Arrays.asList("https://localhost:4200"));
//		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin",
//				"Content-Type","Accept","Authorization","Origin","Accept","X-Requested-With",
//				"Access-Control-Request-Method","Access-Control-Request-Headers"));
//		corsConfiguration.setExposedHeaders(Arrays.asList("Origin","Content-Type","Accept","Authorization",
//				"Access-Control-Allow-Origin","Access-Control-Allow-Origin","Access-Control-Allow-Credentials"));
//		corsConfiguration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS"));
//		 source.registerCorsConfiguration("/**", corsConfiguration);
//		return new CorsFilter(source);
//	}

}
