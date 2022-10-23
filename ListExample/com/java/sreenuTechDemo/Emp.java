package com.java.sreenuTechDemo;

public class Emp {
    Integer eno;
    String ename;
    Integer salary;

    public Emp(Integer eno, String ename, Integer salary) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Emp{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }
}
