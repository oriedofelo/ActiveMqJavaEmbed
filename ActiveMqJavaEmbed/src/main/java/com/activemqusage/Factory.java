package com.activemqusage;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

public class Factory {
	public static void main(String[] args){
	System.setProperty("activemq.base", System.getProperty("user.dir"));
	//BrokerService broker = BrokerFactory.createBroker(new URI("xbean:src/main/resources/org/apache/activemq/book/ch5/activemq-simple.xml"));
	//lets start activeMq with the broker that is a standalone application, cool
	BrokerService broker;
	try {
		broker = BrokerFactory.createBroker(new URI("xbean:file:///C:/a/ActiveMQ/activemq.xml"));
		broker.start();

	} catch (URISyntaxException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
