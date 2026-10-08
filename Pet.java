class Pet {

    private String type;
    private String name;
    private int age;

    public Pet() {
        setType("Animal");
        setName("Pet Name");
        setAge(1);
    }

    public Pet(String newType, String newName, int newAge) {
        setType(newType);
        setName(newName);
        setAge(newAge);
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String speak() {
        String sound;

        if (type.equalsIgnoreCase("dog")) {
            sound = "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            sound = "Meow";
        } else {
            sound = "Yowl";
        }

        return sound;
    }

    public String toString() {
        String output = "";
        output += "Pet information:\n";
        output += "Type: " + type + "\n";
        output += "Name: " + name + "\n";
        output += "Sound: " + speak() + "\n";
        output += "Age: " + age;
        return output;
    }
}
