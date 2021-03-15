/**Colleges has different department: engineering , arts and Departments consist of
 Engineering Department will have
 Library
 Lab Arts
 Library
 Music room Library will have
 - Books
 Staff Age
 fName
 LName
 Model above setup using OOPS concept we have discussed today
 Few Question that we need to query College class would be
 How many books are available in College(arts + Engineering) How many books are rented
 How many chairs are there
 Total staff count
 Eldest member working in library**/

public class Collage
{
    public static void main(String[]args)
    {

        DepartmentOfEngg departmentOfEngg=new DepartmentOfEngg();
        departmentOfEngg.Books(123,true,"Sudha");
        departmentOfEngg.Books(345,false,"Jim");
        departmentOfEngg.Books(678,true,"Jony");
        departmentOfEngg.Books(987,false,"tom");
        departmentOfEngg.Books(654,true,"vishen");

        DepartmentOfArts departmentOfArts=new DepartmentOfArts();
        departmentOfArts.Books(345,false,"Jim");
        departmentOfArts.Books(789,true,"Narayan");
        departmentOfArts.Books(567,false,"karat");
        departmentOfArts.Books(234,true,"joy");
        departmentOfArts.Books(1234,false,"happy");

        departmentOfEngg.Furniture("chair","Wood");
        departmentOfEngg.Furniture("rack","Steel");
        departmentOfEngg.Furniture("Tables","Wood");
        departmentOfEngg.Furniture("chair","Wood");

        departmentOfArts.Furniture("rack","Steel");
        departmentOfArts.Furniture("chair","Wood");
        departmentOfArts.Furniture("Tables","Wood");

        departmentOfArts.Staff(45,"Jim","Jony");
        departmentOfArts.Staff(78,"Sachin","Jim");
        departmentOfArts.Staff(90,"virat","koli");
        departmentOfArts.Staff(30,"ravi","Jony");

        departmentOfEngg.Staff(28,"Jim","Jony");
        departmentOfEngg.Staff(97,"ram","Jony");
        departmentOfEngg.Staff(77,"kim","Jony");
        departmentOfEngg.Staff(67,"rohan","Jony");
        int totalNoBooks=(DepartmentOfEngg.EnggBookCount+DepartmentOfArts.artBookCount);
        int totalNoBooksRented=(DepartmentOfArts.noOfArtBookRented+DepartmentOfEngg.noOfEngBookRented);

        System.out.println("Total no of books in both department is "+ totalNoBooks);
        System.out.println("Total No of books Rented are "+ totalNoBooksRented);

        int totalNoChair=(DepartmentOfEngg.chairCount+DepartmentOfArts.chairCount);

        System.out.println("Total No of chair in both department are "+(DepartmentOfEngg.chairCount+DepartmentOfArts.chairCount));

        departmentOfArts.music();
        departmentOfEngg.Lab();
        int totalStaff=DepartmentOfArts.staffCount+DepartmentOfEngg.staffCount;
        System.out.println("The Total no of staff in both department "+totalStaff);

        if(DepartmentOfEngg.eldestAge>DepartmentOfArts.eldestAge)
        {
            System.out.println("The eldest is present in engg "+DepartmentOfEngg.eldestAge);
        }
        else
        System.out.println("The Eldest is present in Arts "+DepartmentOfArts.eldestAge);




    }

}
