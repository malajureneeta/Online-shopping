package net.kzn.Onlineshopping.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "net.kzn.Onlineshopping.model" })
@EnableTransactionManagement
public class HibernateConfig {

	private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/OnlineShop";
	private final static String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.MySQLDialect";
	private final static String DATABASE_USERNAME = "root";
	private final static String DATABASE_PASSWORD = "";

	// datasource bean
	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();

		// add the databse configuration to datasource object

		dataSource.setDriverClassName(DATABASE_DRIVER);// db driver
		dataSource.setUrl(DATABASE_URL); // db url
		dataSource.setUsername(DATABASE_USERNAME); // db username
		dataSource.setPassword(DATABASE_PASSWORD); // db password

		return dataSource;

	}

	// sessionfactory bean
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {

		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);

		builder.addProperties(getHibernateProperties());
		builder.scanPackages("net.kzn.Onlineshopping.model");

		return builder.buildSessionFactory();

	}

	// define another method for getting hibernate properties

	private Properties getHibernateProperties() {

		// get the Properties class ref
		Properties properties = new Properties();
		properties.put("hibernate.dailect", DATABASE_DIALECT);

		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		return properties;
	}

	// another for transactionmanager
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		
		return transactionManager;
		
		
	}

}
