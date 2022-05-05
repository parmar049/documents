package com.twitter.kafka.producer;

import com.twitter.kafka.producer.config.TwitterConfig;
import com.twitter.kafka.producer.service.TwitterFilteredStream;
import com.twitter.kafka.producer.service.KafkaDataProducer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootTest(properties = "spring.kafka.bootstrap-servers=${spring.embedded.kafka.brokers}")
@EmbeddedKafka
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TweetProducerApplicationTests {

	@Autowired
	KafkaDataProducer producer;

	@Autowired
	TwitterConfig twitterConfig;

	@Test
	void testTweeterStreamAPI() throws IOException, URISyntaxException {
		new TwitterFilteredStream(producer, twitterConfig).streamTweet("eid");
	}

	@Test
	void pushtoKafka() {
		producer.sendMessage("hello kafka");
	}

}
