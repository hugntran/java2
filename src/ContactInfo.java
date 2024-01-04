public class ContactInfo {
    //Thuộc tính
    private String name;
    private String phone;
    //String - hiển thị số 0 nếu sđt bắt đầu từ 0

    //Constructor
    public ContactInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
