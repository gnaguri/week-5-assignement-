
public class GoggleContext {
	
	private GogglesUseCaseState gogglesUseCaseState = null ;
	private Person p = new Person();
	
	public GogglesUseCaseState getGogglesUseCaseState() {
		return gogglesUseCaseState;
	}
	public void setGogglesUseCaseState(GogglesUseCaseState gogglesUseCaseState) {
		this.gogglesUseCaseState = gogglesUseCaseState;
	}
	
	
	public void gogglesUsageAcion() {
		this.gogglesUseCaseState.usage(p);
		}

	

}
