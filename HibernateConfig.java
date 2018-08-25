package com.niit.HibernateConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


	@Configuration
	@ComponentScan(basePackages="com.niit")
	@EnableTransactionManagement
	public class HibernateConfig
	{
		@Bean(name="dataSource")//instance object 

		public DataSource dataSource() {
		    DriverManagerDataSource datasobj = new DriverManagerDataSource();// JDBC connections
		    datasobj.setDriverClassName("org.h2.Driver");//org.h2 is the organisation of h2 and Driver is the class
		    datasobj.setUrl("jdbc:h2:tcp://localhost/~/test");
		    datasobj.setUsername("sa");
		    datasobj.setPassword("");
		    return datasobj;
		 }

		public Properties getHibernateProperties() {
			Properties myproper=new Properties();
			myproper.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			myproper.setProperty("hibernate.show_sql", "true");
			myproper.setProperty("hibernate.hbm2ddl.auto", "update");//automatic update in the database
				return myproper;
		}

		@Bean(name="sessionFact")
		@Autowired // automatically assign the field with the passed value
		public LocalSessionFactoryBean sessionFactory(DataSource dataSource) //query (save and retrieve)
		{
			LocalSessionFactoryBean sessionF=new LocalSessionFactoryBean();
			sessionF.setDataSource((javax.sql.DataSource) dataSource);
			sessionF.setHibernateProperties(getHibernateProperties());
			sessionF.setPackagesToScan("com.niit");
			
			return sessionF;
		}

		@Bean(name="transactionMyManager")
		@Autowired
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFact) //roll back
		{
			HibernateTransactionManager transactionobj=new HibernateTransactionManager();
			transactionobj.setSessionFactory(sessionFact);
			return transactionobj;
		}
	}




