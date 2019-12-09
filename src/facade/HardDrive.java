package facade;

	class HardDrive {

		public byte[] read(long lba, int size) {

			System.out.println("Hard Drive run...");
			System.out.println("lba: " + lba);
			System.out.println("size: " + size);


			return new byte[size];
		}
	}
