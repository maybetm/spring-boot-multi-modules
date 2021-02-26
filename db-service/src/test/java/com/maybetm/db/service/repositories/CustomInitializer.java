package com.maybetm.db.service.repositories;

import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author zebzeev-sv
 * @version 09.11.2020 15:37
 */
public class CustomInitializer implements ApplicationContextInitializer<GenericApplicationContext> {
	@Override
	public void initialize(GenericApplicationContext applicationContext) {
	//	final EmbeddedPostgres postgres = new EmbeddedPostgres();
		try {
/*			final String url = postgres.start();*/
			TestPropertyValues values = TestPropertyValues.of(
					"spring.datasource.url=" + "jdbc:postgresql://localhost:5432/spring-multi-modules-db?autoReconnect=true",
					"spring.datasource.username=postgres",
					"spring.datasource.password=postgres",
					"spring.datasource.driver-class-name=org.postgresql.Driver",
					"spring.jpa.hibernate.ddl-auto=update",
					"spring.jpa.open-in-view=true",
					"spring.datasource.initialization-mode=always"
			);
			values.applyTo(applicationContext);
/*			applicationContext.registerBean(EmbeddedPostgres.class,
					() -> postgres,
					(beanDefinition) -> beanDefinition.setDestroyMethodName("stop"));*/
		} catch (Throwable e) {
			//postgres.stop();
			throw new RuntimeException(e);
		}
	}
}
