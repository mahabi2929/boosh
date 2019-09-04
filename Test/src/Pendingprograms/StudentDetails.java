package Pendingprograms;

public class StudentDetails {
	String name;
    int id;
    char blood;
  String address;
  String result;
public void setdetails(String name1,int id1,char blood1,String address1)
	   {
		   this.name=name1;
	       this.id=id1;
	       this.blood=blood1;
	       this.address=address1;
	}
	
	   public String getname()
	   {
		   return name;
	   }
	   public int getid()
	   {
		   return id;
	   }
	   public char getblood()
	   {
		   return blood;
	   }
	   public String getaddress()
	   {
		   return address;
	   }
	   public static void main(String[] args)
	   {
		   
		   StudentDetails s1=new StudentDetails();
			s1.setdetails("abi",12,'B',"Norton street");
			System.out.println(s1.getname());
			System.out.println(s1.getid());
			System.out.println(s1.getblood());
			System.out.println(s1.getaddress());
		

	   	}

}
