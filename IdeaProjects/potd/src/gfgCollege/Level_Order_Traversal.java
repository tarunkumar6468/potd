package gfgCollege;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

 class Level_Order_Traversal {
    static ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            list.add(temp.data);

            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }

        return list;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is:");
        ArrayList<Integer> result = levelOrder(root);
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }
}

