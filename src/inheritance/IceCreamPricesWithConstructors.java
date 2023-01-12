package inheritance;

public class IceCreamPricesWithConstructors {
public static void main(String[] args) {
	IceCream1 ic = new IceCream1("Chocloate",3);

	
	System.out.println("Price of icecream is : "+ic.getPrice());
	
	
	
	FruitSaladWithIceCream1 fic = new FruitSaladWithIceCream1("Pista", 2, 20);
	System.out.println("Price of FruitSaladWithIcecream is : "+fic.getPrice());
	
	
	KhubaniKaMeetaWithIceCream1 kic = new KhubaniKaMeetaWithIceCream1("Vanilla", 3, 10);
	System.out.println("Price of KhubaniKaMeethaWithIcecream is  :" + kic.getPrice());

}
}
class IceCream1
{
    String flavor;
    int numberOfScoops;
    
    IceCream1(String flavor, int numberOfScoops)
    {
        this.flavor = flavor;
        this.numberOfScoops = numberOfScoops;
        System.out.println("In constrcutor of Icecream class");
    }
    
    double getPrice()
    {
        double pricePerScoop = 35.0;
        return numberOfScoops * pricePerScoop;
    }
}

class FruitSaladWithIceCream1 extends IceCream1
{
    int gramsOfFruitSalad;

    FruitSaladWithIceCream1(String flavor, int numberOfScoops, int gramsOfFruitSalad)
    {
        super(flavor, numberOfScoops); // LINE A
        this.gramsOfFruitSalad = gramsOfFruitSalad; // LINE B
    }

    double getPrice()
    {
        double iceCreamPrice = super.getPrice(); 
        double pricePerGram = 0.75;

        return gramsOfFruitSalad * pricePerGram + iceCreamPrice;
    }
}
class KhubaniKaMeetaWithIceCream1 extends IceCream1
{
    int gramsOfKhubaniKaMeeta;

    KhubaniKaMeetaWithIceCream1(String flavor, int numberOfScoops, int gramsOfKhubaniKaMeeta)
    {
        super(flavor, numberOfScoops);
        this.gramsOfKhubaniKaMeeta = gramsOfKhubaniKaMeeta;
    }

    double getPrice()
    {
        double iceCreamPrice = super.getPrice();
        double pricePerGram = 1.25;

        return gramsOfKhubaniKaMeeta * pricePerGram + iceCreamPrice;
    }
}
