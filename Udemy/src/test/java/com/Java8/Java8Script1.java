package com.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Script1 {

	public static void main(String[] args) {

		String[] a = { "amma", "cat", "cafe", "bat" };

		for (int i = 0; i < a.length; i++) {
			if (a[i].startsWith("a")) {
				System.out.println(a[i]);
			}
		}
		List<String> al = new ArrayList<String>();
		al.add("tata");
		al.add("ammamma");
		al.add("pinni");
		al.add("tammudu");

		for (String str : al) {
			if (str.startsWith("t"))
				System.out.println(str);
		}

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).startsWith("p"))
				System.out.println(al.get(i));
		}

		ListIterator<String> lt = al.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
			/*
			 * if (lt.next().startsWith("a")) { System.out.println(lt.next()); }
			 */
		}

		Long c = al.stream().filter(s -> s.startsWith("a")).count();
		System.out.println(c);

		al.stream().filter(s -> s.startsWith("p")).forEach(s -> System.out.println(s));

		al.stream().filter(s -> s.startsWith("t")).forEach(s -> System.out.println(s));

		al.stream().filter(s -> s.startsWith("t")).limit(1).forEach(s -> System.out.println(s));

		al.stream().filter(s -> s.startsWith("t")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		al.stream().filter(s -> s.contains("a")).forEach(s -> System.out.println(s));

		al.stream().filter(s -> s.endsWith("i")).forEach(s -> System.out.println(s));

		Stream.of("life", "goal", "change").filter(s -> s.startsWith("c")).forEach(s -> System.out.println(s));

		List<String> ls = Arrays.asList("ab", "bc", "cd","ab", "abc");

		ls.stream().sorted().forEach(s -> System.out.println(s));

		Stream<String> sm = Stream.concat(al.stream(), ls.stream());
		// System.out.println(sm.anyMatch(s->s.equalsIgnoreCase("BC")));

		List<String> gh = sm.distinct().sorted().collect(Collectors.toList());
		System.out.println(gh);
		System.out.println(gh.get(0));

		/*
		 * Set<String> kj=sm.sorted().collect(Collectors.toSet());
		 * System.out.println(kj);
		 */

	}

}
