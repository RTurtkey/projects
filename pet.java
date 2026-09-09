class Pet {

    private String name;

    public Pet() {
        setName("Pet Name");
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    
    public String toString() {
        String output = "";
        output += "Pet information: Name: " + name;
        return output;
    }

    public static void main(String[] args) {

        Pet p1 = new Pet();
        System.out.println(p1.toString());

        Pet p2 = new Pet();
        p2.setName("Robert");
        System.out.println(p2.toString());
    }
}

