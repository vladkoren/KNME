import java.util.HashMap;
import java.util.Map;

public class Key {
	private Map<Character, Integer> key = new HashMap<Character, Integer>();
	Key(){
		key.put(' ', 18);
		key.put('a', 17);
		key.put('b', 16);
		key.put('c', 15);
		key.put('d', 14);
		key.put('e', 13);
		key.put('f', 12);
		key.put('g', 11);
		key.put('h', 10);
		key.put('i', -1);
		key.put('j', -2);
		key.put('k', -3);
		key.put('l', -4);
		key.put('m', -5);
		key.put('n', -6);
		key.put('o', -7);
		key.put('p', -8);
		key.put('q', -9);
		key.put('r', 19);
		key.put('s', 20);
		key.put('t', 21);
		key.put('u', 22);
		key.put('v', 23);
		key.put('w', 24);
		key.put('x', 25);
		key.put('y', 26);
		key.put('z', 27);
		key.put(':', 28);
		key.put('0', 29);
		key.put('1', 30);
		key.put('2', 31);
		key.put('3', 32);
		key.put('4', 33);
		key.put('5', 34);
		key.put('6', 35);
		key.put('7', 36);
		key.put('8', 37);
		key.put('9', 38);
		key.put(',', 39);
		key.put('.', 40);
		key.put('?', 41);
		key.put('!', 42);
		key.put('-', 43);
		key.put('\'', 44);
		
	}
	
	int getKey(char symbol){
		return key.get(symbol);
	}

}
