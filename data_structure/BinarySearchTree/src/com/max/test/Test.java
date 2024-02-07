package com.max.test;

import com.max.domain.BinarySearchTree;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Test
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/6 17:35
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(80);
        bst.insert(30);
        bst.insert(100);
        bst.insert(20);
        bst.insert(50);
        bst.insert(90);
        bst.insert(110);
        bst.insert(95);
        bst.insert(115);
        bst.insert(118);



        bst.inorder(bst.root);
        System.out.println();

        bst.remove(100);
//        BinarySearchTree.TreeNode treeNode = bst.find(36);
//        System.out.println(treeNode.val);
        bst.inorder(bst.root);
        System.out.println();
    }
}
