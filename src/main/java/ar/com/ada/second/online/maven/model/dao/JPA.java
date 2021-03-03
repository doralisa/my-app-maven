package ar.com.ada.second.online.maven.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.function.Consumer;

public abstract class JPA {

    protected static EntityManager entityManager;

    private void openConnection() {
        if (entityManager == null || !entityManager.isOpen())
            entityManager = Persistence
                    .createEntityManagerFactory("my-persistence-unit") //REVISAR ERROR
                    .createEntityManager();
    }
// Clase 04/01/21 2 h 30 m BUSCAR EN EL GIT DE VLADY
    private void closeConnection() {
        if (entityManager != null && entityManager.isOpen())
            entityManager.close();
    }

    protected void executeInsideTransaction(Consumer<EntityManager> action) {
        openConnection();
        final EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            action.accept(entityManager);
            transaction.commit();
        } catch (RuntimeException e) {
            transaction.rollback();
            System.out.println(e.toString());
        }
        closeConnection();
    }

}
