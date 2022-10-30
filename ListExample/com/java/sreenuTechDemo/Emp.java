package com.java.sreenuTechDemo;

public class Emp {
    Integer eno;
    String ename;
    Integer salary;
    Integer age;

    public Emp(Integer eno, String ename, Integer salary, Integer age) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
        this.age = age;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
