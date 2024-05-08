package optional;

import java.util.Optional;

public class Teste {

	public static void main(String[] args) {
		Optional<String> optionalValue = Optional.of("Hello");
		System.out.println(optionalValue.get());
		
		String nullableValue = null;
		Optional<String> optionalValue1 = Optional.ofNullable(nullableValue);
		System.out.println(optionalValue1.isPresent());
		
		Optional<String> optionalValue2 = Optional.ofNullable(null);
		String result = optionalValue2.orElse("Default"); 
		System.out.println(result);
	}
}
