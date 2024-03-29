package design.pattern.facade;

public class ProductFacade {

    private DifficultProduct difficultProduct;

    public ProductFacade() {
        difficultProduct = new DifficultProduct();
    }

    public void setName(String name) {
        char[] chars = name.toCharArray();

        if(chars.length > 0){
            difficultProduct.setFirstNameCharacter(chars[0]);
        }
        if(chars.length > 1){
            difficultProduct.setSecondNameCharacter(chars[1]);
        }
        if(chars.length > 2){
            difficultProduct.setThirdNameCharacter(chars[2]);
        }
        if(chars.length > 3){
            difficultProduct.setFourthNameCharacter(chars[3]);
        }
        if(chars.length > 4){
            difficultProduct.setFifthNameCharacter(chars[4]);
        }
        if(chars.length > 5){
            difficultProduct.setSixthNameCharacter(chars[5]);
        }
        if(chars.length > 6){
            difficultProduct.setSeventhNameCharacter(chars[6]);
        }
    }

    public String getName() {
        return difficultProduct.getName();
    }
}
