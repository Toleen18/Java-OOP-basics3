public class person {
    private String name;
    private int age;
    private String gender;
    private long PhoneNumber;
    private String address;
    private double high;
    private double weight;
    private int[] birthDate;
    private String E_mail;
    private String carer;
    private String FamilyStatus;
    private String ID;

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("unknow");
        }
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public void setAge(int age) {
        if (age > 0 && age < 120) {
            System.out.println("good");
            this.age = age;
        } else {
            System.out.println("error");
        }


    }

    public int getAge() {
        return age;
    }

    public void printperson() {
        System.out.println("the name is: " + getName());
        System.out.println("the age is " + getAge());

    }

    public void setID(String ID) {
        if (ID.length() > 9) {
            this.ID = ID;
        } else {
            System.out.println("Error");
        }
    }

    public String getID() {
        return ID;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")) {
            this.gender = gender;
        } else {
            System.out.println("Error");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setPhoneNumber(long PhoneNumber) {
        if (PhoneNumber < 1000000000) {
            this.PhoneNumber = PhoneNumber;
        } else {
            System.out.println("Error");

        }
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setAddress(String Address) {
        if (Address != null) {
            this.address = Address;
        } else {
            System.out.println("Error");
        }

    }

    public String getAddress() {
        return address;
    }


    public void setHigh(double High) {
        if (High > 0 && High < 200) {
            this.high = High;
        } else {
            System.out.println("Error");
        }
    }

    public double getHigh() {
        return high;
    }

    public void setWeight(double weight) {
        if (weight > 0 && weight < 200) {
            this.weight = weight;
        } else {
            System.out.println("Error");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setBirthDate(int[] birthDate) {
        if (birthDate.length > 3 && birthDate.length < 3) {
            System.out.println("Error");
        }
        if (birthDate[0] >= 1 && birthDate[0] <= 30) {
            this.birthDate = birthDate;
        } else if (birthDate[1] >= 1 && birthDate[1] <= 12) {
            this.birthDate = birthDate;
        } else if (birthDate[2] >= 1960 && birthDate[2] <= 2026) {
            this.birthDate = birthDate;
        } else {
            System.out.println("Error");
        }
    }

    public int[] getBirthDate() {
        return birthDate;
    }

    public void setE_mail(String e_mail) {
        for (int i = 0; i < e_mail.length(); i++) {
            if (e_mail.charAt(i) >= 'a' && e_mail.charAt(i) <= 'z' || e_mail.charAt(i) >= 'A' && e_mail.charAt(i) <= 'Z') {
                this.E_mail = e_mail;
            } else {
                System.out.println("Error");
            }
        }

    }

    public String getE_mail() {
        return E_mail;
    }

    public void setCarer(String carer) {
        for (int i = 0; i < carer.length(); i++) {
            if (carer.charAt(i) >= 'a' && carer.charAt(i) <= 'z' || carer.charAt(i) >= 'A' && carer.charAt(i) <= 'Z') {
                this.E_mail = carer;
            } else {
                System.out.println("Error");
            }
        }
    }

    public String getCarer() {
        return carer;
    }

    public void setFamilyStatus(String familyStatus) {
        if (familyStatus.equalsIgnoreCase("Marred") || familyStatus.equalsIgnoreCase("single") || familyStatus.equalsIgnoreCase("divorced") || (familyStatus.equalsIgnoreCase("widow"))) {
            this.FamilyStatus = familyStatus;
        } else {
            System.out.println("Error");

        }
    }

    public String getFamilyStatus() {
        return FamilyStatus;
    }

    // (Default Constructor)
    public person() {
    }

    // (Constructor with parameters)
    public person(String name, int age, String gender, long phoneNumber, String address,
                  double high, double weight, int day, int month, int year,
                  String email, String carer, String familyStatus, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.PhoneNumber = phoneNumber;
        this.address = address;
        this.high = high;
        this.weight = weight;
        this.birthDate = new int[]{day, month, year};
        this.E_mail = email;
        this.carer = carer;
        this.FamilyStatus = familyStatus;
        this.ID = id;
    }

    // (Copy Constructor)
    public person(person other) {
        this.name = other.name;
        this.age = other.age;
        this.gender = other.gender;
        this.PhoneNumber = other.PhoneNumber;
        this.address = other.address;
        this.high = other.high;
        this.weight = other.weight;
        this.birthDate = other.birthDate;
        this.E_mail = other.E_mail;
        this.carer = other.carer;
        this.FamilyStatus = other.FamilyStatus;
        this.ID = other.ID;
    }

    @Override
    public String toString() {
        return "Person Details:\n" +
                "--------------------------\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Phone Number: " + PhoneNumber + "\n" +
                "Address: " + address + "\n" +
                "Height: " + high + " cm\n" +
                "Weight: " + weight + " kg\n" +
                "Birth Date: " + java.util.Arrays.toString(birthDate) + "\n" +
                "E-mail: " + E_mail + "\n" +
                "Carer/Profession: " + carer + "\n" +
                "Family Status: " + FamilyStatus + "\n" +
                "ID: " + ID + "\n" +
                "--------------------------";
    }
}