package max_sk;

public class TaskOne {
    public static void main(String[] args) {
        Person person = new Person.Builder("Pety", "Petrov")
                .middleName("Petrovich")
                .country("Rasha")
                .address("Sovetskay")
                .phone("02")
                .age(18)
                .gender("man")
                .build();
    }
}

class Person{
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int    age;
    private String gender;

    public Person(Builder builder){
        firstName = builder.firstName;
        lastName = builder.lastName;
        middleName = builder.middleName;
        country = builder.country;
        address = builder.address;
        phone = builder.phone;
        age = builder.age;
        gender = builder.gender;
    }

    public static class Builder{
        public String firstName;
        public String lastName;
        public String middleName;
        public String country;
        public String address;
        public String phone;
        public int age;
        public String gender;

        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Person build(){
            return new Person(this);
        }
        public Builder middleName(String middleName){
            this.middleName = middleName;
            return this;
        }
        public Builder country(String country){
            this.country = country;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }
    }
}
