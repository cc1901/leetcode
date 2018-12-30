package leetcode.trie;

public class Trie {
    private static class TrieNode {
        private char val;
        private boolean isWord;
        private TrieNode[] childs = new TrieNode[26];

        public TrieNode(char val) {
            this.val = val;
        }
    }
    /** Initialize your data structure here. */
    private TrieNode root;
    public Trie() {
        root = new TrieNode('*');
        root.isWord = false;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curNode = root;
        for(int i=0; i<word.length(); i++) {
            char cur = word.charAt(i);
            if(curNode.childs[cur - 'a'] == null) {
                curNode.childs[cur - 'a'] = new TrieNode(cur);
            }
            curNode = curNode.childs[cur - 'a'];
        }
        curNode.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curNode = root;
        if (searchNode(word, curNode)) return false;
        return curNode.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curNode = root;
        if (searchNode(prefix, curNode)) return false;
        return true;
    }

    private boolean searchNode(String prefix, TrieNode curNode) {
        for (int i = 0; i < prefix.length(); i++) {
            char cur = prefix.charAt(i);
            if (curNode.childs[cur - 'a'] == null) {
                return true;
            }
            curNode = curNode.childs[cur - 'a'];
        }
        return false;
    }
}
