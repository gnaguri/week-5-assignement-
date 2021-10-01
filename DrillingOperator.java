
public class DrillingOperator implements GogglesUseCaseState {

	@Override
	public void usage(Person p) {
		 
		p.drilling();
		
		System.out.println("If person as pilot");
		
		p.airCraft();
		
	}

}
