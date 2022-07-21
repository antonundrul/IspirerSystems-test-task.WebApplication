package by.undrul.backend.dto;

public class UserDto {
    private String name;
    private int age;
    private int objectsNumber;

    public UserDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getObjectsNumber() {
        return objectsNumber;
    }

    public void setObjectsNumber(int objectsNumber) {
        this.objectsNumber = objectsNumber;
    }
}
