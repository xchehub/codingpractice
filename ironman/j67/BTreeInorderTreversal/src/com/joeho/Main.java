package com.joeho;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree bt = BinaryTree.create();
        System.out.println("using recursion to print nodes of binary tree on InOrder.");
        bt.inOrder();
    }
}

class BinaryTree {
    static class TreeNode {
        String data;
        TreeNode left, right;

        TreeNode(String data) {
            this.data = data;
            left = right = null;
        }
    }

    TreeNode root;

    BinaryTree() {
        root = null;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static BinaryTree create() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode("40");
        tree.root = root;
        tree.root.left = new TreeNode("20");
        tree.root.left.left = new TreeNode("10");
        tree.root.left.left.left = new TreeNode("5");

        tree.root.left.right = new TreeNode("30");
        tree.root.right = new TreeNode("50");
        tree.root.right.right = new TreeNode("60");
        tree.root.left.right.left = new TreeNode("67");
        tree.root.left.right.right = new TreeNode("78");

        return tree;
    }
}
