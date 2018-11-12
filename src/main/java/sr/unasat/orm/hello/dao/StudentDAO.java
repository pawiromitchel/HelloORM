package sr.unasat.orm.hello.dao;

import sr.unasat.orm.hello.entities.Student;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class StudentDAO {
    private EntityManager entityManager;

    public StudentDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Student> retrieveStudentList() {
        entityManager.getTransaction().begin();

/*        String sql = "select * from Student";
        Query query = entityManager.createNativeQuery(sql);
        List<Student> studentList = query.getResultList();*/

       String jpql = "select s from Student s";
        TypedQuery<Student> query = entityManager.createQuery(jpql, Student.class);
        List<Student> studentList = query.getResultList();
        entityManager.getTransaction().commit();
        return studentList;
    }


}
