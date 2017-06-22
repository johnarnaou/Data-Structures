public static int[] inOrderTree2Array(TreeNode node, int[] pin) {
        if(node.getLeftNode() != null){
            inOrderTree2Array(node.getLeftNode(), pin);
        }

        counter++;
        pin[counter] = node.getNodeData();

        if(node.getRightNode() != null){
            inOrderTree2Array(node.getRightNode(), pin);
        }
        return pin;
    }
