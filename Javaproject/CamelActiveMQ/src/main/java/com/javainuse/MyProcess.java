package com.javainuse;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.ProcessorBuilder;
 
 
public class MyProcess implements Processor
{

	public void process(Exchange arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Getting the content");
	}


}
