package com.ym.javabase.tree;


import lombok.Data;

public class RedBlackTree {
}

class RBTree<T extends Comparable<T>> {
    RBNode<T> root;

    public void insert(T key) {
        RBNode<T> node = new RBNode<T>(true, key, null, null, null);
        insert(node);
    }

    public void insert(RBNode<T> node) {
        //记录当前节点,表示最后的父节点
        RBNode<T> current = null;
        RBNode<T> x = this.root;

        while (x != null) {
            current = x;
            if (node.key.compareTo(x.key) < 0) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        //将node的父节点设为current
        node.parent = current;

        if (node.key.compareTo(current.key) < 0) {
            current.left = node;
        } else {
            current.right = node;
        }
        // --上面插入部分和二叉树差不多--


    }

    /*
     * 左旋示意图：对节点x进行左旋
     *     p                       p
     *    /                       /
     *   x                       y
     *  / \                     / \
     * lx  y      ----->       x  ry
     *    / \                 / \
     *   ly ry               lx ly
     * 左旋做了三件事：
     * 1. 将y的左子节点赋给x的右子节点,并将x赋给y左子节点(y左子节点非空时)
     * 2. 将x的父节点p(非空时)赋给y的父节点，同时更新p的子节点为y(左或右)
     * 3. 将y的左子节点设为x，将x的父节点设为y
     */
    public void leftRotate(RBNode<T> x) {
        RBNode<T> y = x.right;
        RBNode<T> p = x.parent;

        //1.Y的左子节点赋给x的右子节点,并将x赋给y左子节点的父节点(y左子节点非空时)
        x.right = y.left;
        if (y.left != null) {
            y.left.parent = x;
        }

        //将x的父节点赋值为y的父节点,同时更新p的子节点为y
        y.parent = p;
        if (p != null) {
            if (p.left == x) {
                p.left = x;
            } else {
                p.right = x;
            }
        } else {
            //如果x为根节点,则y为根节点
            this.root = y;
        }

        y.left = x;
        x.parent = y;
    }

    /*
     * 右旋示意图：对节点y进行右旋
     *        p                   p
     *       /                   /
     *      y                   x
     *     / \                 / \
     *    x  ry   ----->      lx  y
     *   / \                     / \
     * lx  rx                   rx ry
     * 右旋做了三件事：
     * 1. 将x的右子节点赋给y的左子节点,并将y赋给x右子节点的父节点(x右子节点非空时)
     * 2. 将y的父节点p(非空时)赋给x的父节点，同时更新p的子节点为x(左或右)
     * 3. 将x的右子节点设为y，将y的父节点设为x
     */
    public void rightRotate(RBNode<T> y) {
        RBNode<T> x = y.left;
        RBNode<T> p = y.parent;


        //1. 将x的右子节点赋给y的左子节点,并将y赋给x右子节点的父节点(x右子节点非空时)
        y.left = x.right;
        if (x.right != null) {
            x.right.parent = y;
        }

        //2. 将y的父节点p(非空时)赋给x的父节点，同时更新p的子节点为x(左或右)
        if (p != null) {
            x.parent = p;
            if (p.left == y) {
                p.left = x;
            } else {
                p.right = x;
            }
        } else {
            this.root = x;
        }
        //3. 将x的右子节点设为y，将y的父节点设为x
        x.right = y;
        y.parent = x;
    }
}


@Data
class RBNode<T extends Comparable<T>> {
    boolean RED = true;
    /**
     * 颜色
     */
    boolean color;
    /**
     * 关键值
     */
    T key;

    RBNode<T> parent;

    RBNode<T> left;

    RBNode<T> right;

    public RBNode(boolean color, T key, RBNode<T> parent, RBNode<T> left, RBNode<T> right) {
        this.color = color;
        this.key = key;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return "" + key + (this.color ? "R" : "B");
    }

}
