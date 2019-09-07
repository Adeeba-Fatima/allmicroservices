package com.training.micro.CatalogService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.client.RestTemplate;
 


@SpringBootApplication
@EnableEurekaClient
public class CatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}
	
	//expose the RestTemplate Bean
	//configure the restTemplate to use discovery server..
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
			
		/*
	 * @Bean public PoolingHttpClientConnectionManager
	 * poolingHttpClientConnectionManager() { PoolingHttpClientConnectionManager
	 * result = new PoolingHttpClientConnectionManager(); result.setMaxTotal(20);
	 * return result; }
	 * 
	 * @Bean public RequestConfig requestConfig() { RequestConfig result =
	 * RequestConfig.custom() .setConnectionRequestTimeout(2000)
	 * .setConnectTimeout(2000) .setSocketTimeout(2000) .build(); return result; }
	 * 
	 * @Bean public CloseableHttpClient
	 * httpClient(PoolingHttpClientConnectionManager
	 * poolingHttpClientConnectionManager, RequestConfig requestConfig) {
	 * CloseableHttpClient result = HttpClientBuilder .create()
	 * .setConnectionManager(poolingHttpClientConnectionManager)
	 * .setDefaultRequestConfig(requestConfig) .build(); return result; }
	 * 
	 * @Bean public RestTemplate restTemplate(HttpClient httpClient) {
	 * HttpComponentsClientHttpRequestFactory requestFactory = new
	 * HttpComponentsClientHttpRequestFactory();
	 * requestFactory.setHttpClient(httpClient); return new
	 * RestTemplate(requestFactory); }
	 */
}
