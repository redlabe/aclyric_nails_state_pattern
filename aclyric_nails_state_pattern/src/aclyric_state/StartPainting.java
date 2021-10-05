package aclyric_state;


public class StartPainting implements State {
	 
	AclyricNailsFactory aclyricNailsFactory;
 
    public StartPainting(AclyricNailsFactory aclyricNailsFactory) {
        this.aclyricNailsFactory = aclyricNailsFactory;
    }


	public void startPrinting() {
		System.out.println("The 3D printer cant run while nails are being painted");
		
	}

	public void startPainting() {
		System.out.println("Painting of the nails has started");
		
	}

	
	public String toString() {
		return "Starting the mattress factory machine";
	}
}
