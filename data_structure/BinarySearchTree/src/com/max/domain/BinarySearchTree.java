package com.max.domain;

/**
 * ClassName: BinarySearchTree
 * Package: com.max.domain
 * Description: 二叉搜索树
 *
 * @Author MaxSun
 * @Create 2024/2/6 17:10
 * @Version 1.0
 */
public class BinarySearchTree {
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode root = null;
    public TreeNode find(int val) {
        TreeNode cur = root;

        while(cur != null) {
            if(val < cur.val) {
                cur = cur.left;
            } else if(val > cur.val) {
                cur = cur.right;
            } else {
                return cur;
            }
        }
        return null;
    }

    public void insert(int val) {
        if(root == null) {
            root = new TreeNode(val);
            return;
        }

        TreeNode cur = root;
        TreeNode prev = null;

        while(cur != null) {
            prev = cur;
            if(val < cur.val) {
                cur = cur.left;
            } else if(val > cur.val) {
                cur = cur.right;
            } else {
                return;
            }
        }
        if(val < prev.val) {
            prev.left = new TreeNode(val);
        } else {
            prev.right = new TreeNode(val);
        }

    }

    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public void remove(int val) {
        if(root == null) {
            root = new TreeNode(val);
            return;
        }

        TreeNode cur = root;
        TreeNode prev = null;

        while(cur != null && cur.val != val) {
            prev = cur;
            if(val < cur.val) {
                cur = cur.left;
            } else if(val > cur.val) {
                cur = cur.right;
            }
        }
        if(cur == null) {
            return;
        }
        removeChild(prev, cur);

    }

    private void removeChild(TreeNode prev, TreeNode cur) {
        if(cur.left == null) {
            if(cur == root) {
                root = root.right;
            } else if(cur == prev.left) {
                prev.left = cur.right;
            } else if(cur == prev.right) {
                prev.right = cur.right;
            }
        } else if(cur.right == null) {
            if(cur == root) {
                root = root.left;
            } else if(cur == prev.left) {
                prev.left = cur.left;
            } else if(cur == prev.right) {
                prev.right = cur.left;
            }
        } else {
            TreeNode targetP = cur;
            TreeNode target = cur.right;
            while(target.left != null) {
                targetP = target;
                target = target.left;
            }
            cur.val = target.val;

            if(target == targetP.left) {
                targetP.left = target.left;
            } else {
                targetP.right = target.right;
            }
        }
    }
}
