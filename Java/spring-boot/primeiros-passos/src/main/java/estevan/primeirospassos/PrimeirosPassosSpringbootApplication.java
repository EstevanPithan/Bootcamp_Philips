package estevan.primeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosSpringbootApplication.class, args);

		//para o spring não é necessário realizar isso
//		Calculadora calculadora = new Calculadora();
//		System.out.println(calculadora.somar(2,7));
	}

}
