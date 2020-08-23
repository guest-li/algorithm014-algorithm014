 public List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<>();
        return  preOrderWithRecurive(root,output);
    }
    public List<Integer>  preOrderWithRecurive(Node root,List<Integer> output){
        if (null == root) return output;
        output.add(root.val);
        for (Node node:root.children){
            preOrderWithRecurive(node,output);
        }
        return output;
    }
	