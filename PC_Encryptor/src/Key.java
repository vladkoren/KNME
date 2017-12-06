import java.util.HashMap;
import java.util.Map;

public class Key {
	private Map<Character, Integer> key = new HashMap<Character, Integer>();
	Key(){
		key.put(' ', -13);
		key.put('a', -12);
		key.put('b', -11);
		key.put('c', -10);
		key.put('d', -9);
		key.put('e', -8);
		key.put('f', -7);
		key.put('g', -6);
		key.put('h', -5);
		key.put('i', -4);
		key.put('j', -3);
		key.put('k', -2);
		key.put('l', -1);
		key.put('m', 0);
		key.put('n', 1);
		key.put('o', 2);
		key.put('p', 3);
		key.put('q', 4);
		key.put('r', 5);
		key.put('s', 6);
		key.put('t', 7);
		key.put('u', 8);
		key.put('v', 9);
		key.put('w', 10);
		key.put('x', 11);
		key.put('y', 12);
		key.put('z', 13);
		key.put(':', 14);
		key.put('0', 15);
		key.put('1', 16);
		key.put('2', 17);
		key.put('3', 18);
		key.put('4', 19);
		key.put('5', 20);
		key.put('6', 21);
		key.put('7', 22);
		key.put('8', 23);
		key.put('9', 24);
		key.put(',', 25);
		key.put('.', 26);
		key.put('?', 27);
		key.put('!', 28);
	}
	
	int getKey(char symbol){
		return key.get(symbol);
	}

}
