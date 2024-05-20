package 스태틱_개념;

import java.util.Vector;

//Data Transfer Object
class Client{
	private int number;
	private String name;
}

//Data Access Object
class StaticClientDAO{
	public static Vector<Client> clientList = new Vector<Client>();
	static public void addClient(Client c) {
		clientList.add(c);
	}
}

class ClientDAO{
	public Vector<Client> clientList = new Vector<Client>();
	public void addClient(Client c) {
		clientList.add(c);
	}
}

public class 스태틱1_개념03_기본이론3 {
	public static void main(String[] args) {
		//static활용 (1) DAO를 static으로 만들면 편하다
		for(int i=0; i<10; i++) {
			StaticClientDAO.addClient(new Client());
		}
		
		System.out.println("================");
		ClientDAO clientDAO = new ClientDAO();
		for(int i=0; i<10; i++) {
			clientDAO.addClient(new Client());
		}
	}
}
