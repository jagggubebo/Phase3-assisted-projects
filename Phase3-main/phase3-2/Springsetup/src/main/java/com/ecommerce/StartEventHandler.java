package com.ecommerce;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;


public class StartEventHandler 
	ApplicationListener<ContextStartedEvent>
{

        public void onApplicationEvent(ContextStartedEvent event) {
           System.out.println("ContextStartedEvent Received");
        }
}


