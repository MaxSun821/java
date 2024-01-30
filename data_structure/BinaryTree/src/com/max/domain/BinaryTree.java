package com.max.domain;

import java.util.LinkedList;
import java.util.Queue;

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
        //E.right = H;

        C.left = F;
        C.right = G;
        return A;
    }





    /**
     * 获取节点数：子问题思路
     * @param root 根结点
     * @return
     */
    public int size(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return leftSize + rightSize + 1;
    }

    public static int count = 0;

    /**
     * 获取节点数：遍历思路
     * @param root 根结点
     * @return
     */
    public void size2(TreeNode root) {

        if(root == null) {
            return;
        }
        count += 1;
        size2(root.left);
        size2(root.right);
    }

    /**
     * 前序遍历
     * @param root 根结点
     */
    public void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * 中序遍历
     * @param root 根结点
     */
    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    /**
     * 后序遍历
     * @param root 根结点
     */
    public void postOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.val + " ");
    }

    public int getLeafNodeCount(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }

        int leftLeaf = getLeafNodeCount(root.left);
        int rightLeaf = getLeafNodeCount(root.right);
        return leftLeaf + rightLeaf;
    }

    public static int leafCount = 0;
    public void getLeafNodeCount2(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafCount++;
            return;
        }

        getLeafNodeCount2(root.left);
        getLeafNodeCount2(root.right);
    }

    public int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return leftHeight > rightHeight ? (leftHeight + 1)
                : (rightHeight + 1);
    }

    /**
     * 获取第k层有多少个结点
     * @param root 根结点
     * @param k 第几层
     * @return 结点数
     */
    public int getKLevelNodeCount(TreeNode root, int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        int leftK = getKLevelNodeCount(root.left, k - 1);
        int rightK = getKLevelNodeCount(root.right, k - 1);
        return leftK + rightK;
    }

    public TreeNode find(TreeNode root, int val) {
        if(root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        TreeNode leftNode = find(root.left, val);
        TreeNode rightNode = find(root.right, val);

        return leftNode == null ? rightNode : leftNode;

    }

    /**
     * 判断是否为完全二叉树
     * @param root 根结点
     * @return
     */
    public boolean isCompleteTree(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right != null) {
            return false;
        }

        boolean leftJudge = isCompleteTree(root.left);
        boolean rightJudge = isCompleteTree(root.right);

        return leftJudge && rightJudge;
    }

    /**
     * 层序遍历
     * @param root 根结点
     */
    public void levelOrder(TreeNode root) {
        // 队列用来存放结点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if(poll.left != null) {
                queue.offer(poll.left);
            }
            if(poll.right != null) {
                queue.offer(poll.right);
            }
            System.out.print(poll.val + " ");
        }

    }
}
