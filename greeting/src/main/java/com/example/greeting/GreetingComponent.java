	package com.example.greeting;

import org.springframework.stereotype.Component;

//Allows Spring to automatically detect our custom beans.
@Component
public class GreetingComponent {
	
	 public String getMessage() {
	        return "Hello from GreetingComponent BubuLuna";
	    }
}
