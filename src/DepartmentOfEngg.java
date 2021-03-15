public class DepartmentOfEngg implements Library,Lab{
    int age;
    String author,funType,Material,Fname,lname;
    boolean isBookRented;
    int iSBN;
    public static int  chairCount=0,staffCount=0,EnggBookCount=0,noOfEngBookRented=0;
    public static int eldestAge=0;

    public void Books(int iSBN, boolean isBookRented, String author)
    {
        this.author=author;
        this.isBookRented=isBookRented;
        this.iSBN=iSBN;
        this.EnggBookCount=EnggBookCount+1;
                if(isBookRented)
                {
                    noOfEngBookRented=noOfEngBookRented+1;
                }
    }

    public void Furniture(String furnitureType, String material)
    {
        this.funType=furnitureType;
        this.Material=material;

        if(furnitureType.equalsIgnoreCase("chair"))
        {
            chairCount=chairCount+1;
        }

    }

    public void Staff(int Age, String fName, String lName)
    {
        this.age=Age;
        this.Fname=fName;
        this.lname=lName;
        staffCount=staffCount+1;
        if (age>=eldestAge)
            eldestAge=age;
    }



    public void Lab() {
        System.out.println("Engg has a Lab");

    }
}
