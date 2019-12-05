

class Solution {
    public boolean isSymmetric(TreeNod root) {
        return isMirror(root,root);
}
    public boolean isMirror(TreeNod nodeleft, TreeNod noderight){
        if(isSymmetric(nodeleft)==true){
            return true;
        }
        else if(nodeleft==null && noderight==null){
                return true;
            }
        else if(nodeleft.left==noderight.right || nodeleft.right==noderight.left){
                return true;
            }
        else {
        	return false;
        }
        return (nodeleft.val==noderight.val) &&
                isMirror(nodeleft.left, noderight.right) &&
                    isMirror(nodeleft.right,noderight.left);        
		}
    }
public class TreeNod {
    int val;
   TreeNod left;
   TreeNod right;
   TreeNod(int x) { val = x; }
}