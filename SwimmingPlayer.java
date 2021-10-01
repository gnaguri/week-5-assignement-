
public class SwimmingPlayer implements GogglesUseCaseState {

	@Override
	public void usage(Person p) {
		
		System.out.println("If person as a swimming player");
		p.swimming();
		
		System.out.println("\nIf persion as Drilling operator ");
		p.drilling();
		
	}

}
