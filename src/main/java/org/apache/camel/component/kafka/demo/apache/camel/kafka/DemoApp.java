package org.apache.camel.component.kafka.demo.apache.camel.kafka;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by alex on 9/29/16.
 */
public class DemoApp {
    public static final void  main(String[] args) {

      CamelContext ctx = new DefaultCamelContext();
        try {
          ctx.addRoutes(new myRouteBuilder());
          ctx.start();
            Thread.sleep(5*60*2000);
            ctx.stop();


        } catch (Exception e) {
            e.printStackTrace();
        }

//       Properties props = new Properties();
//        props.put("metadata.broker.list","localhost:9092");
//        props.put("zookeeper.connection","localhost:2181");
//        props.put("serializer.class","kafka.serializer.StringEncoder");
//        ProducerConfig config = new ProducerConfig(props);
//        kafka.javaapi.producer.Producer<String,String> producer = new kafka.javaapi.producer.Producer<String,String>(config);
//        KeyedMessage<String,String> message = new KeyedMessage<String, String>("message","Hey!");
//        try{
//            producer.send(message);
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally{
//            producer.close();
//        }


    }
}

