public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String fn, String ln, String ph){
        this.firstName = fn;
        this.lastName = ln;
        this.phoneNumber = ph;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String fn){
        this.firstName = fn;
    }

    public String getLastName(){
        return firstName;
    }

    public void setLastName(String ln){
        this.firstName = ln;
    }

    public String getPhoneNumber(){
        return firstName;
    }

    public void setPhoneNumber(String fn){
        this.firstName = fn;
    }

    public void validateFirstName(){
        if (this.firstName.isBlank()){
            throw new RuntimeException("Firstname cannot be null.");
        }
    }

    public void validateLastName(){
        if (this.lastName.isBlank()){
            throw new RuntimeException("Lastname cannot be null");
        }
    }

    public void validatePhoneNumber(){
        if (this.phoneNumber.isBlank()){
            throw new RuntimeException("Phone cannot be null");
        }

        if (this.phoneNumber.length() != 10){
            throw new RuntimeException(("Phone number should be 10 digits long"));
        }

        if (!this.phoneNumber.matches("\\d+")){
            throw new RuntimeException(("Phone number can contain only digits"));
        }

        if (!this.phoneNumber.startsWith("0")){
            throw new RuntimeException(("Phone number should start with 0"));
        }

    }



}
