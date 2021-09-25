package ru.gb.Lesson_5;

public class person {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setPosition(String position){
        this.position=position;
    }
    public String getPosition(){
        return position;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public person(){
        name="Unknown";
        position="Unknown";
        email="unknown@mail.com";
        phoneNumber="+7 XXX XXX XX XX";
        salary=0;
        age=0;

    }

    public person(String name, String position,String email, String phoneNumber, int salary, int age){
        this.name=name;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
    }

    public void personInfo (){
        System.out.println("ФИО: " + name + "   Должность: " + position + "   Почта: " + email
                + "   Номер телефона: " + phoneNumber + "   Зарплата: " + salary + "   Возраст: " + age);
    }

    public static void main(String [] args){
        int numOfpersons = 5;
        person[] arrayPerson = new person[numOfpersons];
        arrayPerson[0] = new person("Иванов Иван", "Инженер", "ivanov@mail.com",
                "+7 (111) 111-11-11", 10000, 25);
        arrayPerson[1] = new person("Петров Семен", "Электрик", "petrov@mail.com",
                "+7 (222) 222-11-11", 20000, 41);
        arrayPerson[2] = new person("Сидоров Максим", "Сантехник", "sidorov@mail.com",
                "+7 (333) 333-11-11", 30000, 45);
        arrayPerson[3] = new person("Кузнецов Сергей", "Слесарь", "kyznetsov@mail.com",
                "+7 (444) 444-11-11", 25000, 30);
        arrayPerson[4] = new person("Павлов Юра", "Упаковщик", "pavlov@mail.com",
                "+7 (555) 555-11-11", 25000, 43);

        for (int i = 0;i<numOfpersons;i++){
            if (arrayPerson[i].age>40){
                arrayPerson[i].personInfo();
            }
        }

    }









}
