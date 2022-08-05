package com.lmaguado.practica01;

import com.lmaguado.practica01.bean.MyBean;
import com.lmaguado.practica01.bean.MyBeanWhitDependency;
import com.lmaguado.practica01.bean.MySecondBean;
import com.lmaguado.practica01.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practica01Application implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWhitDependency myBeanWhitDependency;
	private MySecondBean mySecondBean;

	public Practica01Application(
			@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
			MyBean myBean,
			MyBeanWhitDependency myBeanWhitDependency,
			MySecondBean mySecondBean
	) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWhitDependency = myBeanWhitDependency;
		this.mySecondBean = mySecondBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(Practica01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.componentDependency.writeOnConsole();
		myBean.print();
		myBeanWhitDependency.printWithDependency();
		System.out.println("\nOwn Implement: (practice exercise)");
		mySecondBean.printOnConsole();
	}
}
