
public class GogglesStatePatternDemo {

	public static void main(String[] args) {

		GoggleContext context = new GoggleContext();

		context.setGogglesUseCaseState(new SwimmingPlayer());
		context.gogglesUsageAcion();
		System.out.println("\n*************************************************************\n");

		context.setGogglesUseCaseState(new DrillingOperator());
		context.gogglesUsageAcion();
		System.out.println("\n*************************************************************\n");

	}

}
