package binarysearch;

class TreeNodeMemory extends TreeNode {
	TreeNodeMemory(int x) {
		super(x);
	}

	int counts = -1;
}

public class KthSmallestElementInBST {
	public int kthSmallest(TreeNode root, int k) {
		if (root == null) {
			return 0;
		}
		int lCount = 1 + count(root.left);
		if (lCount == k) {
			return root.val;
		} else if (lCount > k) {
			return kthSmallest(root.left, k);
		} else {
			return kthSmallest(root.right, k - lCount);
		}
	}

	private int count(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + count(root.left) + count(root.right);
	}

	private int count(TreeNodeMemory root) {
		if (root == null) {
			return 0;
		}
		if (root.counts == -1) {
			root.counts = 1 + count(root.left) + count(root.right);
		}
		return root.counts;
	}
}
