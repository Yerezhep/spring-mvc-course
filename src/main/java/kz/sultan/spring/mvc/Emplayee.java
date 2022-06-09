package kz.sultan.spring.mvc;

import kz.sultan.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Emplayee {
    @Size(min = 3, message = "name must be min 3 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 18, message = "age must be more than 17")
    @Max(value = 40, message = "age must be less than 41")
    private int age;
    private String department;
    private Map<String,String> departments;
    private String car;
    private Map<String, String > cars;
    private String language;
    private Map<String, String> languages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d", message = "please use pattern XXX-XX-X")
    private String phoneNumber;
    @CheckEmail(value = "mail.kz", message = "email must be ends mail.kz")
    private String email;

    public Emplayee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        cars = new HashMap<>();
        cars.put("BMW", "BMW");
        cars.put("Toyota", "Toyota");
        cars.put("Audi", "Audi");

        languages = new HashMap<>();
        languages.put("EN", "EN");
        languages.put("KZ", "KZ");
        languages.put("RU", "RU");

    }

    public Emplayee(String name, String surname, int age,String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Emplayee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
