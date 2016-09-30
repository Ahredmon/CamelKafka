package org.apache.camel.component.kafka.demo.apache.camel.kafka;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.json.*;

/**
 * Created by alex on 9/29/16.
 */
public class myProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
    JSONObject jObject = new JSONObject(exchange.getIn().getBody(String.class));
    Message tempMessage = exchange.getOut();
    tempMessage.setBody(jObject);
        exchange.setOut(tempMessage);
    }
}
