package practicesession3;
//volume of box by creating object
public class Box {
double width;
double height;
double depth;
}
class BoxDemo{
	public static void main(String[] args) {
	Box cube1=new Box();
	Box cube2=new Box();
	double vol;
	cube1.width=20;
	cube1.height=10;
	cube1.depth=10;
	cube2.width=5;
	cube2.height=5;
	cube2.depth=5;
	vol=cube1.width*cube1.height*cube1.depth;
	vol=cube2.width*cube2.height*cube2.depth;
	System.out.println("volume is : " + vol);

	}

}
