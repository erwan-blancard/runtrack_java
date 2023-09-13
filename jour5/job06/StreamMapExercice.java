import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExercice {
	
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}
		
		List<String> list = Arrays.asList(args);
		
		List<String> upWords = list.stream()
				.map((s) -> s.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(upWords);
	}

}
