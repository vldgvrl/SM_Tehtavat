package facade;



	/* Facade */
	class ComputerFacade {

		private final CPU processor;
		private final Memory ram;
		private final HardDrive hd;

		public ComputerFacade() {
			this.processor = new CPU();
			this.ram = new Memory();
			this.hd = new HardDrive();
		}

		public void start() {
			processor.freeze();
			ram.load(0x4000000, hd.read(0x7c00,4096));
			processor.jump(0x20000000);
			processor.execute();
		}
	}
