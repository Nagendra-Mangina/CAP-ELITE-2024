class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) {
            return root;
        }
        if(root.val==key) {
            
            if(root.left==null && root.right==null) {
                return null;
            } else if(root.right==null || root.left==null) {
               
                return root.right==null?root.left:root.right;
            } else {
                
                TreeNode node =root;
                node=node.right;
                while(node.left!=null) {
                    node=node.left;
                }
               
                root.val=node.val;
                
                root.right=deleteNode(root.right,root.val);
            }
        } else if(root.val<key){
             root.right=deleteNode(root.right,key);
        } else {
             root.left=deleteNode(root.left,key);
        }
        return root;
    }
}
