package inheritance;

public class IceCreamPricesWithOverriding {

	public static void main(String[] args) {
		
		
		IceCream ic = new IceCream();
		ic.flavor="Chocolate";
		ic.numberOfScoops=2;
		
		System.out.println("Price of icecream is : "+ic.getPrice()); //type syso and do ctrl+space
		
		
		
		FruitSaladWithIceCream fic = new FruitSaladWithIceCream();
		fic.flavor = "Vanilla";
		fic.numberOfScoops = 3;
		fic.gramsOfFruitSalad = 10;
		
		System.out.println("Price of FruitSaladWithIcecream is : "+fic.getPrice());
		
		
		KhubaniKaMeetaWithIceCream kic = new KhubaniKaMeetaWithIceCream();
		kic.flavor = "Pista";
		kic.numberOfScoops = 2;
		kic.gramsOfKhubaniKaMeeta = 20;
		System.out.println("Price of KhubaniKaMeethaWithIcecream is  :" + kic.getPrice());
		
		
		
	}

}
class IceCream
{
    String flavor;
    int numberOfScoops;
    
    double getPrice()
    {
        double pricePerScoop = 35.0;
        return numberOfScoops * pricePerScoop;
    }
}
class FruitSaladWithIceCream extends IceCream
{
    int gramsOfFruitSalad;

    double getPrice()
    {
        double iceCreamPrice = super.getPrice(); // LINE A
        double pricePerGram = 0.75;

        return gramsOfFruitSalad * pricePerGram + iceCreamPrice;
    }
}
class KhubaniKaMeetaWithIceCream extends IceCream
{
    int gramsOfKhubaniKaMeeta;

    double getPrice()
    {
        double iceCreamPrice = super.getPrice(); // LINE B
        double pricePerGram = 1.25;
        return gramsOfKhubaniKaMeeta * pricePerGram + iceCreamPrice;
    }
}

