class CompareEntertainmentsUsingInheritance{
public static void main(String arg[])
    {


        Movie julai = new Movie();
        julai.name = "Julai";
        julai.director = "Trivikram";
        julai.stuntMaster = "Peter Hein";
        julai.numberOfArtists = 57;
        julai.releaseDate = "15-Aug-2012";
        
        julai.collectionsFirstWeek = 215467.8;
        julai.collectionsRestOfTheDays = 541132.5;
        
        
        julai.printName(julai);
        julai.printMovie(julai);
        

		
		Drama ramayan = new Drama();
        ramayan.name = "Ramayana";
        ramayan.writer = "Valmiki";
        ramayan.stageSetter = "Anjaneya";
        ramayan.numberOfArtists = 200000;
        ramayan.releaseDate = "17-Mar-1659 BC";
        
        ramayan.collectionsFirstWeek = 32842.86;
        ramayan.collectionsRestOfTheDays = 93349.51;
        
        ramayan.printName(ramayan);
      //   ramayan.printMovie(ramayan);  -- THIS won't work , since drama is not a movie
        
        Circus jumbo = new Circus();
        jumbo.name = "Jumbo";
        jumbo.ringMaster = "Antony";
        jumbo.numberOfArtists = 316;
        jumbo.releaseDate = "16-Dec-1997";
        
        jumbo.collectionsFirstWeek = 21232.21;
        jumbo.collectionsRestOfTheDays = 234725.09;
        
        jumbo.printName(jumbo);
        
/*
if((jumbo.getTotalCollections() > julai.getTotalCollections()) && (jumbo.getTotalCollections() > ramayan.getTotalCollections()))
        {
            jumbo.print();
        }
        else if (julai.getTotalCollections() > ramayan.getTotalCollections())
        {
            julai.print();
        }
        else
        {
            ramayan.print();
        }
    

        
*/ 

compareEntertainments(julai,ramayan,jumbo);


//Downcasting

Entertainment e; //reference of a parent class

Movie m = new Movie(); // object of a sub class
e = m; // LINE A // Assigning reference of object to parent

Drama d = new Drama();
e = d; // LINE B

// m = d; // This won't work



Entertainment ent1;
Drama d1 = new Drama();
ent1 = d1;


// Drama d2 = ent1; -- This won't work because ent1 can be different entertainment
Drama d2 =  (Drama)ent1; 


// Movie m2 =  (Movie)ent1; //Runtime error


       
}        
        

public static void compareEntertainments(Entertainment ent1, Entertainment ent2, Entertainment ent3)
    {
    if((ent1.getTotalCollections() > ent2.getTotalCollections()) && (ent1.getTotalCollections() > ent3.getTotalCollections()))
        {
            System.out.println(ent1.name + " has the highest collections.");
            ent1.printEntertainment();
        }
        else if (ent2.getTotalCollections() > ent3.getTotalCollections())
        {
            System.out.println(ent2.name + " has the highest collections.");
             ent2.printEntertainment();
        }
        else
        {
            System.out.println(ent3.name + " has the highest collections.");
             ent3.printEntertainment();
        }
    }

}

class Entertainment
{
    String name;
    int numberOfArtists;
    String releaseDate;
    double collectionsFirstWeek;
    double collectionsRestOfTheDays;

    double getTotalCollections()
    {
        return collectionsFirstWeek + collectionsRestOfTheDays;
    }

    void printEntertainment()
    {
        System.out.println( name + " got the following collections " );
        System.out.println("First Week : " + collectionsFirstWeek);
        System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
        System.out.println("Total Collections : " + getTotalCollections());
        System.out.println("Total Artists : " + numberOfArtists);
        System.out.println("Release Date : " + releaseDate);
    }
    
    
    public void printName(Entertainment e)
		{
    System.out.println("Name of the entertainment is " + e.name);
    System.out.println("----------------------------------------------------------");
		}






}


class Movie extends Entertainment
{
    String director;
    String stuntMaster;

    void print()
    {
        printEntertainment();
        System.out.println("Director : " + director);
        System.out.println("Stunt Master : " + stuntMaster);
    }
    
    
    public void printMovie(Movie m)
		{
    System.out.println(m.director + " is the director for movie " + m.name);
		}

}

class Drama extends Entertainment
{
    String writer;
    String stageSetter;


    void print()
    {
        printEntertainment();
        System.out.println("Writer : " + writer);
        System.out.println("Stage Setter : " + stageSetter);
    }
}


class Circus extends Entertainment
{
    String ringMaster;

    void print()
    {
        printEntertainment();
        System.out.println("Ring Master : " + ringMaster);
    }
}

