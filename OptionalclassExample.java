package LambadaEXample;

import java.util.Optional;

public class OptionalClassExample1 {
public static void main (String args[]) {
	String [] str = new String [6];
	str[4] = " This is a optional class ";
	Optional<String> value = Optional.of(str[4]);
	System.out.println(" value");
	System.out.println(value.hashCode());
	System.out.println(value.get());
}
}
