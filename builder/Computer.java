package builder;
public class Computer {
	
	private String HD;
	private String RAM;
	
	public String getHD() {
		return HD;
	}

	public String getRAM() {
		return RAM;
	}
	
    
	@Override
    public String toString() {
        return "Computer [HD=" + HD + ", RAM=" + RAM + "]";
    }

    private Computer(ComputerBuilder builder) {
		this.HD=builder.HD;
		this.RAM=builder.RAM;
	}

    public static class ComputerBuilder{

		private String HD;
		private String RAM;
		
		public ComputerBuilder(String hd, String ram){
			this.HD=hd;
			this.RAM=ram;
		}

		public Computer build(){
			return new Computer(this);
		}

	}

}
