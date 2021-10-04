package JavaSce;

public class ActorSivakumar implements Actor {
	int age;
	String car;
	static String address="Coimbatore";
	public ActorSivakumar(int age, String car){
		
		this.age=age;
		this.car=car;
		
	}
	public ActorSivakumar(){
		
		
	}
	
	public void act(){
		System.out.println("Do classical Acting");
	}
	public void dance(){
		System.out.println("Do Dancing in 70s style");
	}
	public void sing(){
		System.out.println("Sing a classical song");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorSivakumar as = new ActorSivakumar(65,"Audi Car");
		as.act();
		as.dance();
		as.sing();
		as.output();
		Actor ac = new ActorSivakumar();//Dynamic binding
		ac.act();
		ac.dance();
		ac.sing();
		System.out.println(ac.address);
		//ac.output();-->Since this is current class method cannot be implemented 
		

	}
	public void output(){
		System.out.println("Actor age is "+age+" his native is "+address+" and he owns a "+car);
		//System.out.println(address);
		//System.out.println(age);
	}

}	
