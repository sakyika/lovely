package com.sakk.lovely.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.webflow.config.AbstractFlowConfiguration;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;
import org.springframework.webflow.executor.FlowExecutor;

@Configuration
public class WebFlowConfig extends AbstractFlowConfiguration {

	// Registering flow using a location pattern
	@Bean
	public FlowDefinitionRegistry flowRegistry(){
		return getFlowDefinitionRegistryBuilder()
				.addFlowLocationPattern("/WEB-INF/flows/**/*-flow.xml")
				.build();
	}
	
	// Register flow using flow location base path
	@Bean
	public FlowDefinitionRegistry flowRegistry2(){
		return getFlowDefinitionRegistryBuilder()
				.setBasePath("/WEB-INF")
				.addFlowLocationPattern("/hotels/booking/booking.xml")
				.build();
	}
	
	// Register flow using flow location base path
		@Bean
		public FlowDefinitionRegistry flowRegistry3(){
			return getFlowDefinitionRegistryBuilder()
					.setBasePath("/WEB-INF")
					.addFlowLocationPattern("/**/*-flow.xml")
					.build();
	
		}
			
	@Bean
	public FlowExecutor flowExecutor(){
		return getFlowExecutorBuilder(flowRegistry()).build();
	}
	
}
