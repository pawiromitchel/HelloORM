package sr.unasat.orm.hello.dao;

import sr.unasat.orm.hello.config.JPAConfiguration;
import sr.unasat.orm.hello.entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class StudentDAO {

    public List<Student> retrieveStudentList() {
        EntityManager entityManager = JPAConfiguration.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        String sql = "select * from Student";
        Query query = entityManager.createNativeQuery(sql);
        List<Student> studentList = query.getResultList();

/*        String sql = "select s from Student s";
        TypedQuery<Student> query = entityManager.createQuery(sql, Student.class);
        List<Student> studentList = query.getResultList();*/
        
        entityManager.getTransaction().commit();
        entityManager.close();
        return studentList;
    }


}
