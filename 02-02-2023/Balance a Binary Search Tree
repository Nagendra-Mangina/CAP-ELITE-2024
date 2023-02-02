class Solution {
    List<TreeNode> list=new ArrayList<>();
    public void InOrder(TreeNode root) 
    {          
        if(root == null)
            return;
        else
        {
            InOrder(root.left);
            list.add(root);
            InOrder(root.right);    
        }
    }
    
    public TreeNode balancedBST(int start,int end) 
    {           
        if(start>end)
            return null;
        int mid = (start+end)/2;
        TreeNode root = list.get(mid);
        root.left = balancedBST(start,mid-1);
        root.right = balancedBST(mid+1,end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) 
    {
        if(root ==null)
            return null;
        InOrder(root);
        return balancedBST(0,list.size()-1);
    }
}
