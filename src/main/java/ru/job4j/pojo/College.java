package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Калинин Павел Григорьевич");
        student.setGroup("КЭ - 111");
        student.setAdmissionDate("01.09.2017");

        System.out.println("ФИО: " + student.getFullName() + System.lineSeparator()
                + "Группа: " + student.getGroup() + System.lineSeparator()
                + "Дата поступления: " + student.getAdmissionDate());
    }
}
