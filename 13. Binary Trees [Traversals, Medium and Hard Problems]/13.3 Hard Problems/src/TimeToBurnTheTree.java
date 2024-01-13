public class TimeToBurnTheTree {
    //https://www.codingninjas.com/studio/problems/time-to-burn-tree_1469067?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //public class Solution {

    //	//we could have found out the node with start value during making the parent map also
    //	static void markParent(BinaryTreeNode<Integer> root, HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> mp){
    //		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
    //		q.add(root);
    //		while (q.size()!=0){
    //			BinaryTreeNode<Integer> temp = q.remove();
    //			if (temp.left!=null){
    //				q.add(temp.left);
    //				mp.put(temp.left,temp);
    //			}
    //			if (temp.right!=null){
    //				q.add(temp.right);
    //				mp.put(temp.right,temp);
    //			}
    //		}
    //	}
    //	static BinaryTreeNode<Integer> findNode(BinaryTreeNode<Integer> root,int start){
    //		if (root==null || root.data == start) return root;
    //		BinaryTreeNode<Integer> left = findNode(root.left,start);
    //		BinaryTreeNode<Integer> right =  findNode(root.right,start);
    //		if (left != null) return left;
    //		if (right != null) return right;
    //		return null;
    //	}
    //public static int timeToBurnTree(BinaryTreeNode<Integer> root, int start){
    //	HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> mp = new HashMap<>();
    //	markParent(root,mp);
    //
    //
    //	BinaryTreeNode<Integer> st = findNode(root,start);
    //		// System.out.println(st.data);
    //
    //
    //	HashSet<BinaryTreeNode<Integer>> visited = new HashSet<>();
    //	Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
    //	int ans = 0;
    //	q.add(st);
    //	visited.add(st);
    //	while (q.size()!=0){
    //		int size=q.size();
    //		boolean flag = false;
    //		for (int i = 0;i<size;i++){
    //			BinaryTreeNode<Integer> temp = q.remove();
    //			if (temp.left != null && !visited.contains(temp.left)){
    //				q.add(temp.left);
    //				visited.add(temp.left);
    //				flag = true;
    //			}
    //			if (temp.right != null && !visited.contains(temp.right)){
    //				q.add(temp.right);
    //				visited.add(temp.right);
    //				flag = true;
    //			}
    //			if (mp.get(temp)!=null && !visited.contains(mp.get(temp))){
    //				q.add(mp.get(temp));
    //				visited.add(mp.get(temp));
    //				flag = true;
    //			}
    //		}
    //			if (flag) ans++;
    //	}
    //	return ans;
    //    }
    //}

}
