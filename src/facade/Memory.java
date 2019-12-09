package facade;

	class Memory {

		public void load(long position, byte[] data) {
			System.out.println("Memory loading...");
			System.out.println("position: " + position);
			for (byte b : data){
				System.out.println(b);
			}
		}
	}
