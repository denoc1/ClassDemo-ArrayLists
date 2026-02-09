class Student
{
    private String name;
    private String email;
    private int age;

    public Student(String initName, String initEmail, int age)
    {
        name = initName;
        email = initEmail;
        this.age = age;
    }


    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    // toString() method
    public String toString()
    {
        return id + ": " + name + ", " + email;
    }
}
