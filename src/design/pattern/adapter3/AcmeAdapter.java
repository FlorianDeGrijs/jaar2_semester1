package design.pattern.adapter3;

public class AcmeAdapter implements AcmeInterface {
    private AceClass ace;
    private String firstName;
    private String lastName;

    public AcmeAdapter(AceClass ace) {
        this.ace = ace;
        firstName = ace.getName().split(" ")[0];
        lastName = ace.getName().split(" ")[1];
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
}
