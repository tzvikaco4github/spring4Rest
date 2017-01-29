package net.tzvikaco.config;  
  
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
  
@Configuration 
@ComponentScan("net.tzvikaco") 
@EnableWebMvc   
public class AppConfig {  

}  
