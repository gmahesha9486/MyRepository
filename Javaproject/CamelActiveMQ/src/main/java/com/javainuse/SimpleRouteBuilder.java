package com.javainuse;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	//from("file:/home/hduser/Documents/workspace/testFolder/input?noop=true").split().tokenize("\n").to("jms:queue:javainuse");
    	from("jms:queue:javainuse").process(new MyProcess());
    }
//from("file:/home/hduser/Documents/workspace/testFolder/input?noop=true")
}