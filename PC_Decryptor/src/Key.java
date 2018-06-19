import java.util.HashMap;
import java.util.Map;

public class Key {
	Map<Integer, Character> key = new HashMap<Integer, Character>(); 
	Key(){
		key.put(-9, ' ');
		key.put(-8, 'a');
		key.put(-7, 'b');
		key.put(-6, 'c');
		key.put(-5, 'd');
		key.put(-4, 'e');
		key.put(-3, 'f');
		key.put(-2, 'g');
		key.put(-1, 'h');
		key.put(10, 'i');
		key.put(11, 'j');
		key.put(12, 'k');
		key.put(13, 'l');
		key.put(14, 'm');
		key.put(15, 'n');
		key.put(16, 'o');
		key.put(17, 'p');
		key.put(18, 'q');
		key.put(19, 'r');
		key.put(20, 's');
		key.put(21, 't');
		key.put(22, 'u');
		key.put(23, 'v');
		key.put(24, 'w');
		key.put(25, 'x');
		key.put(26, 'y');
		key.put(27, 'z');
		key.put(28, ':');
		key.put(29, '0');
		key.put(30, '1');
		key.put(31, '2');
		key.put(32, '3');
		key.put(33, '4');
		key.put(34, '5');
		key.put(35, '6');
		key.put(36, '7');
		key.put(37, '8');
		key.put(38, '9');
		key.put(39, ',');
		key.put(40, '.');
		key.put(41, '?');
		key.put(42, '!');
		key.put(43, '-');
		key.put(44, '\'');
	}
	char getValue(Integer inputKey) {
		return key.get(inputKey);
	}
}
