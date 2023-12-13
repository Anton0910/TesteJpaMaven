package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Antonio", "antonio@hotmail");
		Pessoa p2 = new Pessoa(null, "Ana", "ana@hotmail");
		Pessoa p3 = new Pessoa(null, "Annio", "annio@hotmail");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//Enviar dados
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		
		
		//Buscar dadods
		Pessoa p = em.find(Pessoa.class, 2);
		//Excluir dados
		em.remove(p);
		
		em.getTransaction().commit();
		System.out.println("Pronto");
		em.close();
		emf.close();
		
	}

}
