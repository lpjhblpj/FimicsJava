//: com.mic.demo.holding/UniqueWords.java
package com.mic.demo.holding; /* Added by Eclipse.py */

import com.mic.demo.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
    }
} /* Output:
[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, com.mic.demo.holding, import, in, java, main, mindview, com.mic.demo.net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
*///:~
