package sr.unasat.orm.hello.app;

import sr.unasat.orm.hello.config.JPAConfiguration;
import sr.unasat.orm.hello.dao.StudentDAO;
import sr.unasat.orm.hello.entities.Student;

import java.util.List;

public class Application {

  public static void main(String[] args) {
    StudentDAO studentDAO = new StudentDAO(JPAConfiguration.getEntityManager());
    List<Student> studentList = studentDAO.retrieveStudentList();
    studentList.stream().forEach(System.out::println);
    JPAConfiguration.shutdown();
  }
}