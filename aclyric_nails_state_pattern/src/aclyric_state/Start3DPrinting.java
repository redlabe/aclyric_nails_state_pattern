package aclyric_state;


public class Start3DPrinting implements State {
	 
	AclyricNailsFactory aclyricNailsFactory;
 
    public Start3DPrinting(AclyricNailsFactory aclyricNailsFactory) {
        this.aclyricNailsFactory = aclyricNailsFactory;
    }

    public void startPrinting() {
		System.out.println("The 3D printer is printing the aclyric nails");
		
	}

	public void startPainting() {
		System.out.println("Sorry, you will have to wait for the printing to finish to begin painting");
		
	}
	
	public String toString() {
		return "3D printer running";
	}

}
