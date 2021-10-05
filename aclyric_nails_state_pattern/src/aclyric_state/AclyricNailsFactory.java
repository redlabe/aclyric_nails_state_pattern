package aclyric_state;

public class AclyricNailsFactory {
	 
	State printingState;
	State paintingState;
 
	State state;
	int count = 0;
 
	public AclyricNailsFactory(int nailsToProduce) {
		printingState = new Start3DPrinting(this);
		paintingState = new StartPainting(this);

		this.count = nailsToProduce;
 		if (nailsToProduce > 0) {
			state = printingState;
		} else {
			state = paintingState;
		}
	}
 
	public void startPrinting() {
		state.startPrinting();
	}
 
	public void startPainting() {
		state.startPainting();
	}
 
	

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getPrintingState() {
        return printingState;
    }

    public State getPaintingState() {
        return paintingState;
    }

}
