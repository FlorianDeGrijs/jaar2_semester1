package design.pattern.adapter3;

public class MainAdapter3 {
    public static void main(String[] args) {
        AceClass ace = new AceClass();
        ace.setName("James Richard");
        System.out.println(ace.getName());

        System.out.println("**********************");

        AcmeInterface acme = new AcmeAdapter(ace);
        System.out.println(acme.getFirstName());
        System.out.println(acme.getLastName());

        System.out.println("**********************");

        acme.setFirstName("John");
        System.out.println(acme.getFirstName());
        System.out.println(acme.getLastName());
    }
}
