class Solution {
    public boolean findTarget(TreeNode root, int k) 
    {
        List<Integer> ans = new ArrayList<>();

        inorder(root,ans);

        int size=ans.size(),i=0,j=size-1;

        while(i<j)
        {
            if(ans.get(i)+ans.get(j)==k)
            {
                return true;
            }
            else if(ans.get(i)+ans.get(j)<k)
            {
                i++;
            }
            else
            {
                j--;
            }
        }

        return false;
    }

    void inorder(TreeNode root,List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}
