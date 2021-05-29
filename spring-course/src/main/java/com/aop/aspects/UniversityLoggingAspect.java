package com.aop.aspects;

import com.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("------------------------------------------------------");
//        System.out.println("beforeGetStudentsLoggingAdvice: " +
//                "логируем получения списка студентов перед методом getStudents");
//        System.out.println("------------------------------------------------------");
//
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("------------------------------------------------------");
//        System.out.println("beforeGetStudentsLoggingAdvice: " +
//                "логируем получения списка студентов после работы метода getStudents");
//        System.out.println("------------------------------------------------------");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//            throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("------------------------------------------------------");
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: " +
//                "логируем выброс исключения " + exception);
//        System.out.println("------------------------------------------------------");
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("------------------------------------------------------");
        System.out.println("afterGetStudentsLoggingAdvice: " +
                "логируем нормальное окончание работы метода или выброс исключения");
        System.out.println("------------------------------------------------------");
    }


}
