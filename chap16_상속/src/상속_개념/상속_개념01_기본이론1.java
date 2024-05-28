package 상속_개념;

class AAAAA{
	String x;
	String y;
}

class BBBBB{
	AAAAA a = new AAAAA();
}

class CCCCC{
	BBBBB b = new BBBBB();
}

class DDDDD{
	CCCCC c = new CCCCC();
}

class EE{
	int x;
	int y;
}

class FF extends EE{}
class GG extends FF{}
class KK extends GG{}

public class 상속_개념01_기본이론1 {
	public static void main(String[] args) {
		DDDDD d = new DDDDD();
		d.c.b.a.x = "10";
		
		KK k = new KK();
		k.x = 10;
	}
}
