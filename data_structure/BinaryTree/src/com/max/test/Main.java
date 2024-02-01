package com.max.test;

import com.max.domain.BinaryTree;

/**
 * ClassName: Main
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/29 12:45
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        BinaryTree.TreeNode root = bt.createTree();
        //System.out.println(bt.size(root));

        //System.out.println(bt.isCompleteTree(root));

        bt.preOrderNor(root);
        System.out.println();
        bt.inOrderNor(root);
        System.out.println();
        bt.postOrderNor(root);
        System.out.println();

    }
}
