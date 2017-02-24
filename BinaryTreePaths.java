/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<String> result=new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
           Stack<String> subresult=new Stack<String>();
        sum(root,subresult);
        return result;
    }
    public String customize(Stack<String> subresult)
    {
        String listString = String.join("->", subresult);
        return listString;
    }
    public void sum(TreeNode root,Stack<String> subresult){
    if(root==null)
    {   
        return;
    }
    if(root.left==null&&root.right==null)
     {
        subresult.push(Integer.toString(root.val));
        String li=customize(subresult);
        result.add(li);
        subresult.pop();
        return;
     }
     subresult.push(Integer.toString(root.val));
     sum(root.left,subresult);
     sum(root.right,subresult);
     subresult.pop();
     return;
    }
    }
