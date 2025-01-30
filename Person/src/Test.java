
public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber ="000-1234-5678";
		taro.address = "xxxx@gmail.com";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println("");
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "010-2345-6789";
		jiro.address = "abc@gmail.com";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println("");
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "020-3456-7890";
		hanako.address = "bcd@gmail.com";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println("");
		
		Person me = new Person();
		me.name = "山本穂乃花";
		me.age = 24;
		me.phoneNumber = "090-8169-7715";
		me.address = "shine.gmail.com";
		
		System.out.println(me.name);
		System.out.println(me.age);
		System.out.println(me.phoneNumber);
		System.out.println(me.address);

	}

}
