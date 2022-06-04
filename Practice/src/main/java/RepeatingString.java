import java.util.Arrays;
import java.util.List;

public class RepeatingString {
	public static void main(String[] args) {
//		List<String> val = new ArrayList<String>();
		List<String> lang = Arrays.asList("JAVA", "C", "CPP");
//		int i = 0;
//		lang.stream().map(number -> number * 3).collect(Collectors.toList());
//		lang.stream().map(number -> number + i).forEach(System.out::println);

		// Select e1.* from employee e1 join employee e2 on
		// (e1.name=e2.name and e1.age=e2.age and e1.slary=e2.slary)
		// where e1.id != e2.id

		int totalLent = 10;
		StringBuilder builder = new StringBuilder();
		String val = "aba";
		// abaabaabaa
		int count = findCount(val, 'a');
		int finalCount = 0;
		for (int i = 1; i <= totalLent; i += val.length()) {
			if (i+val.length() > totalLent &&  (totalLent % (i)) < val.length()) {
				String sub = val.substring(0, totalLent % (i-1));
				builder.append(sub);
				finalCount += findCount(sub, 'a');
			} else {
				builder.append(val);
				finalCount += count;
			}
		}
		System.out.println(finalCount);
		System.out.println(builder.toString());
	}

	static int findCount(String val, char a) {
		int count = 0;
		for (int i = 0; i < val.length(); i++) {
			if (val.charAt(i) == a)
				count++;
		}
		return count;
	}

}
