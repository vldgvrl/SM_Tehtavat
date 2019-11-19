package proxy;

import java.util.ArrayList;
import java.util.List;

class ProxyExample {
   /**
    * Test method
    */
   public static void main(final String[] arguments) {

	   List<Image> imageFolder = new ArrayList<Image>();

	   for (int i=0; i<20; i++){
		   imageFolder.add(new ProxyImage("HiRes_10MB_Photo" + (i+1) ));
	   }

	   System.out.println("\n=====Valokuvankansion sisällöstä=====\n");
	   for (Image img : imageFolder){
		   img.showData();
	   }

	   System.out.println("\n=====Selataan kuvat numero 6 ja 17 ja ladataan ne=====\n");

	   imageFolder.get(5).displayImage();
	   imageFolder.get(16).displayImage();

    }
}
