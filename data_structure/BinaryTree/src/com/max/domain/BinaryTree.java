package com.max.domain;

/**
 * ClassName: BinaryTree
 * Package: com.max.domain
 * Description: 二叉树
 *
 * @Author MaxSun
 * @Create 2024/1/29 12:37
 * @Version 1.0
 */
public class BinaryTree {
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode createTree() {
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(6);
        TreeNode G = new TreeNode(7);
        TreeNode H = new TreeNode(8);

        A.left = B;
        A.right = C;

        B.left = D;
        B.right = E;
        E.right = H;

        C.left = F;
        C.right = G;
        return A;
    }

    // int count;
    public int size(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
//        if(root == null) {
//            return 0;
//        }
//        count += 1;
//        size(root.left);
//        size(root.right);
//        return count;
    }

    public int getLeafNodeCount(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafNodeCount(root.left) + getLeafNodeCount(root.right);
    }

    public int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return getHeight(root.left) > getHeight(root.right) ? (getHeight(root.left) + 1)
                : (getHeight(root.right) + 1);
    }
}
