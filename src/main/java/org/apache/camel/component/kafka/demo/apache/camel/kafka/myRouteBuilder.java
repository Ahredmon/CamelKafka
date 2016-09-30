package org.apache.camel.component.kafka.demo.apache.camel.kafka;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.kafka.KafkaConstants;

/**
 * Created by alex on 9/29/16.
 */
public class myRouteBuilder extends  RouteBuilder {
    public void configure() throws Exception {
       try{
           from("file:./tmp/?move=./done")
                   .to("kafka:TutorialTopic?zookeeperConnect=localhost:2181&metadataBrokerList=localhost:9092&serializerClass="+ KafkaConstants.DEFAULT_KEY_SERIALIZER_CLASS);
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
}
