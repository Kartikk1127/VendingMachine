public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = VendingMachine.getInstance();

        //add product to the vending machine
        Product coke = new Product("Coke",1.5);
        Product pepsi = new Product("Pepsi",1.5);
        Product water = new Product("Water",1.0);

        vendingMachine.inventory.addProduct(coke,5);
        vendingMachine.inventory.addProduct(pepsi,3);
        vendingMachine.inventory.addProduct(water,2);

        //select a product
        vendingMachine.selectProduct(coke);

        //insert coins
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);

        //insert note
        vendingMachine.insertNote(Note.FIVE);

        //dispense the product
        vendingMachine.dispenseProduct();

        //return the change
        vendingMachine.returnChange();

        //select another product
        vendingMachine.selectProduct(water);

        //insert coins
        vendingMachine.insertCoin(Coin.QUARTER);

        //try to dispense the product
        vendingMachine.dispenseProduct();

        //insert more coins
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);

        vendingMachine.dispenseProduct();

        //return the change
        vendingMachine.returnChange();


    }
}