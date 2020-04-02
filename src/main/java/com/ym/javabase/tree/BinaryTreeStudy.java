package com.ym.javabase.tree;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * @author YM
 * @date 2020/3/30 14:20
 */
public class BinaryTreeStudy {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(1, 11.1);
        binaryTree.insert(2, 22.2);
        binaryTree.insert(3, 33.3);

        Node node = binaryTree.find(4);

        System.out.println(node);

        binaryTree.inOrder(binaryTree.root);

        System.out.println(binaryTree.getMax());
    }

}

@Data
class Node {
    /**
     * data use as key value
     */
    int id;

    /**
     * other data
     */
    double data;
    /**
     * left child
     */
    Node left;

    /**
     * right child
     */
    Node right;
}

@Slf4j(topic = "binaryTree")
class BinaryTree {
    /**
     * the only data field 唯一字段
     */
    Node root;

    public Node find(int key) {
        Node current = root;
        while (current.id != key) {
            if (current.id > key) {
                current = current.left;
            } else {
                current = current.right;
            }
            //如果current为null,则树中不存在
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id, double dd) {
        Node node = new Node();
        node.id = id;
        node.data = dd;
        Node parent = root;
        if (parent == null) {
            root = node;
        } else {
            while (true) {
                if (parent.id > node.id) {
                    if (parent.left == null) {
                        parent.left = node;
                        break;
                    } else {
                        parent = parent.left;
                    }
                } else {
                    if (parent.right == null) {
                        parent.right = node;
                        break;
                    } else {
                        parent = parent.right;
                    }
                }
            }
        }
    }

    public boolean delte(int key) {
        Node current = root;
        Node parent = root;

        /**
         * 是否左节点
         */
        boolean isLeftChild;

        while (current.id != key) {
            parent = current;
            if (key < current.id) {
                isLeftChild = true;
                current = parent.left;
            } else {
                isLeftChild = false;
                current = parent.right;
            }
            //没找到
            if (current == null) {
                return false;
            }

            //当前节点没有子节点直接删除
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else if (current.left != null && current.right == null) {
                //当前节点有左子节点,没有右子节点,用左子节点代替当前节点
                if (current == root) {
                    root = current.left;
                } else if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            } else if (current.left == null && current.right != null) {
                //当前节点右子节点，没有左子节点，用右子节点代替当前节点
                if (current == root) {
                    root = current.right;
                } else if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }


        }
        return true;
    }

    /**
     * @param delNode
     * @return
     */
    private Node getSuccessor(Node delNode) {
        //后继节点父节点
        Node successorParent = delNode;
        //后继节点
        Node successor = delNode;
        //获取右子节点
        Node current = delNode.right;

        //循环获取左子节点,直到找不到左子节点
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        //后继节点不等于删除节点的右子节点，后继节点的父节点左子节点为后继节点的右节点
        //后继节点的右节点为删除节点的又节点
        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    /**
     * 遍历树
     *
     * @param startNode
     */
    public void inOrder(Node startNode) {
        if (startNode != null) {
            //遍历左边
            inOrder(startNode.left);
            log.debug("id:{},data:{}", startNode.id, startNode.data);
            inOrder(startNode.right);
        }
    }

    public Node getMin() {
        if (root == null) {
            return null;
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }


    public Node getMax() {
        if (root == null) {
            return null;
        }
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }
}
