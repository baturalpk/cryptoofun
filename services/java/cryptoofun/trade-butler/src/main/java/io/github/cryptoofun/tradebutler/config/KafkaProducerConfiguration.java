package io.github.cryptoofun.tradebutler.config;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.SaslConfigs;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.io.IOException;
import java.util.HashMap;

@Configuration
public class KafkaProducerConfiguration {

    @Value(value = "${spring.kafka.bootstrap-servers}")
    private String bootstrapAddress;


    @Value("${spring.kafka.properties.security.protocol}")
    private String protocol;

    @Value("${spring.kafka.properties.sasl.mechanism}")
    private String mechanism;

    @Value("${spring.kafka.properties.sasl.jaas.config}")
    private String jaasConfig;

    @Value("${spring.kafka.properties.ssl.truststore.location}")
    private Resource truststoreFile;

    @Value("${spring.kafka.properties.ssl.truststore.password}")
    private String truststorePwd;

    @Bean
    public ProducerFactory<String, Object> producerFactory() throws IOException {
        var props = new HashMap<String, Object>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        props.put(JsonSerializer.TYPE_MAPPINGS, "processTradeOrderCommand:io.github.cryptoofun.messages.commands.ProcessTradeOrderCommand");
        props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, protocol);
        props.put(SaslConfigs.SASL_MECHANISM, mechanism);
        props.put(SaslConfigs.SASL_JAAS_CONFIG, jaasConfig);
        props.put("ssl.truststore.type", "JKS");
        props.put("ssl.truststore.location", truststoreFile.getFile().getAbsolutePath());
        props.put("ssl.truststore.password", truststorePwd);
        return new DefaultKafkaProducerFactory<>(props);
    }

    @Bean
    public KafkaTemplate<String, Object> kafkaTemplate() throws IOException {
        return new KafkaTemplate<>(producerFactory());
    }
}
