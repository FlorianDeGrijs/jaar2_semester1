package design.pattern.facade;

public class MainFacade {
    public static void main(String[] args) {
        ProductFacade facade = new ProductFacade();
        facade.setName("Richard");
        System.out.println(facade.getName());
    }
}
