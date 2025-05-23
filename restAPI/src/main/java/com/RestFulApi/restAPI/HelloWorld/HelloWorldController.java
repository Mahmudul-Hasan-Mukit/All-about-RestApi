package com.RestFulApi.restAPI.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@GetMapping(path="/hello-world")
  public String helloWorld() {
	  return "Hello World";
  }
@GetMapping(path="/hello-world-bean")
public helloWorldBean helloWorldBean() {
	  return new helloWorldBean("Hello World");
}
@GetMapping(path="/hello-world/path-variable/{name}")
public helloWorldBean helloWorldPathvariable(@PathVariable String name) {
	  return new helloWorldBean(String.format("Hello World,%s",name));
}
}
