public class DepartmentOfArts implements Library,Music
{
    int age;
    String author,funType,Material,Fname,lname;
    boolean isBookRented;
    public static int  chairCount=0,staffCount,artBookCount=0,iSBN, noOfArtBookRented =0;
    public static int eldestAge=0;


    public void Books(int iSBN, boolean isBookRented, String author)
    {
        this.author=author;
        this.isBookRented=isBookRented;
        this.iSBN=iSBN;
        artBookCount=artBookCount+1;
        if(isBookRented)
        {
            noOfArtBookRented = noOfArtBookRented +1;
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


    public void music() {
        System.out.println("Arts has a music class");

    }
}
