package edu.neu.csye6200.api;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;

public class PredicateStream {
	public static void main(String[] args) {
		List<String> states = Arrays.asList("ma","ny","ct","vt","ri","nh","nv","nc","nd","wa","wv","ut","ca","az","al","ak","ok","pa","me","ms","il","id","mn","wy","mt","wi","ia","ar","hi","sd","sc","md","nj","de","ga","fl","mi","oh","in","or","ky","tn","va","mo","ks","co","la","tx","nm","ne");
		Predicate<String> uStates=s->{return s.startsWith("u");};
		states.stream().filter(uStates).map(String::toUpperCase).sorted().forEach(s->System.out.println(s + " "));
	}

}
