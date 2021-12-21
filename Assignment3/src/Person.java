public class Person {
    private String name;
    private String address;
    private String phoneNum;

    public Person(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public Person() {
        this.name="Default";
        this.address="Default";
        this.phoneNum="Default";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\n"+
                "Address: "+this.address+"\n"+
                "Customer Number: "+this.phoneNum+"\n";
    }
}
