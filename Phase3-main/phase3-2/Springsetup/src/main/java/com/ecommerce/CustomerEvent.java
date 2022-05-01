package com.ecommerce;
import org.springframework.context.ApplicationEvent;
public class CustomerEventextends ApplicationEvent {
	public CustomEvent(Object source) {
	      super(source);
	   }
	   public String toString(){
	      return "This is a custom event";
	   }
	}


