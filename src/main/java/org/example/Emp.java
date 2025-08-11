package org.example;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Emp {

        private String name;
        private String Role;
        private int salary;

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public Emp(String name, String Role, int salary) {
            this.name = name;
            this.Role = Role;
            this.salary = salary;
        }
        public Emp(String name, String  role) {
            this.name = name;
            Role = role;
        }

        public String getName() {
            return name;
        }
        public String getRole() {
            return Role;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setRole(String role) {
            Role = role;
        }
        public static void getDev(List<Emp> list){
            List<String> Developers= list.stream()
                    .filter(e->e.getRole().equals("Developer"))
                    .map(Emp::getName)
                    .collect(Collectors.toList());

            System.out.println(Developers);
        }

        public String toString(){
            return " | "+name;
        }

        public boolean equals(Object o){
            if(this == o) return true;
            if(!(o instanceof Emp)) return false;
            Emp e=(Emp)o;
            return this.name.equals(e.name) && this.Role.equals(e.Role);
        }

        public int hashCode(){
            return Objects.hash(name,Role);
        }
    }


