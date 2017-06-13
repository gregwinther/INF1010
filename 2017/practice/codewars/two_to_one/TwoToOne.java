import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoToOne {
	
	TwoToOne() {};	

	public String longest(String s1, String s2) {
		s1 = this.stringSorter(s1);
		s2 = this.stringSorter(s2);
		s1 = this.removeRedundancies(s1);
		s2 = this.removeRedundancies(s2);

		if (s1.length() >= s2.length()) {
			return s1;
		} else {
			return s2;
		}
			
	}

	public String stringSorter(String s) {
		Character[] chars = new Character[s.length()];
		for (int i = 0; i < s.length(); i++) {	
			chars[i] = s.charAt(i);
			
		}
		
		Arrays.sort(chars, new Comparator<Character>() {
			public int compare(Character c1, Character c2) {
				int cmp = Character.compare(c1.charValue(), c2.charValue());		
				if (cmp != 0) return cmp;
				return Character.compare(c1.charValue(), c2.charValue());
			}	
		});

		StringBuilder sb = new StringBuilder(chars.length);
		for (char c : chars) sb.append(c);
		s = sb.toString();

		return s;	
	}

	public String removeRedundancies(String s) {
		char[] chars = s.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
			charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		return sb.toString();
	}
	
}

