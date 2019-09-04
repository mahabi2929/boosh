package oopsconcepts;

public class Methods {
int rollnum;
String name;
void info(int rollnum,String name)
{
	this.rollnum=rollnum;
	this.name=name;
}
void display() 
{
	System.out.println(rollnum+" "+name);

}
}
