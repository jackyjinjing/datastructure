package com.jacky.tree;

import java.util.Comparator;

/**
 * Created by jacky on 16/7/24.
 */
public class BinarySearchTree<T extends Comparable<T>> {

    private static class BinaryNode<T> {

        public BinaryNode(T item) {
            this(item, null, null);
        }

        public BinaryNode(T item, BinaryNode<T> lItem, BinaryNode<T> rItem) {
            this.item = item;
            left = lItem;
            right = rItem;
        }

        T item;
        BinaryNode<T> left;
        BinaryNode<T> right;
    }

    private BinaryNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(T item) {
        return contains(item, root);
    }

    public boolean contains(T item, BinaryNode<T> node) {
        if (node == null) {
            return false;
        }

        int compareResult = item.compareTo(node.item);

        if (compareResult < 0) {
            return contains(item, node.left);
        }

        if(compareResult>0){
            return contains(item,node.right);
        }

        return true;
    }


}
