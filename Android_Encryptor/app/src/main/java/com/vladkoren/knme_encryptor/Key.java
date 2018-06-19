package com.vladkoren.knme_encryptor;


import android.util.ArrayMap;

import java.util.Map;

/**
 * Created by vladkoren on 06.12.2017.
 */

public class Key {
    private Map<Character, Integer> key = new ArrayMap<Character, Integer>();
    Key(){
        key.put(' ', -9);
        key.put('a', -8);
        key.put('b', -7);
        key.put('c', -6);
        key.put('d', -5);
        key.put('e', -4);
        key.put('f', -3);
        key.put('g', -2);
        key.put('h', -1);
        key.put('i', 10);
        key.put('j', 11);
        key.put('k', 12);
        key.put('l', 13);
        key.put('m', 14);
        key.put('n', 15);
        key.put('o', 16);
        key.put('p', 17);
        key.put('q', 18);
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
