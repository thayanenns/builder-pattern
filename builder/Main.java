package builder;

public class Main {
    public static void main(String[] args) {
			
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "8 GB").build();
        System.out.println(comp.toString());
	}
}
