
              package com.example.demo;
              import org.springframework.boot.SpringApplication;
              import org.springframework.boot.autoconfigure.SpringBootApplication;
              import org.springframework.web.bind.annotation.GetMapping;
              import org.springframework.web.bind.annotation.RequestParam;
              import org.springframework.web.bind.annotation.RestController;
              
              @SpringBootApplication
              @RestController
              public class DemoApplication {
                
                  
                  public static void main(String[] args) {
                  SpringApplication.run(DemoApplication.class, args);
                  }
                  
                  @GetMapping("/first")
                  public String hello1(@RequestParam(value = "name", defaultValue = "Mom") String name) {
                  return String.format("Hello %s!", name);
				  }

				  @GetMapping("/second")
                  public String hello2(@RequestParam(value = "name", defaultValue = "Sylt") String name) {
                  return String.format("Hello %s!", name);
                  }

				  @GetMapping("/third")
                  public String hello3(@RequestParam(value = "name", defaultValue = "Griechenland") String name) {
                  return String.format("Hello %s!", name);
                  }
                
				  @GetMapping("/fourth")
                  public String hello4(@RequestParam(value = "name", defaultValue = "Boxhagener Platz") String name) {
                  return String.format("Hello %s!", name);
                  }
              }
            
