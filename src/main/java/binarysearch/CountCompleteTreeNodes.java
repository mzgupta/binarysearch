package binarysearch;

public class CountCompleteTreeNodes {
	public int countNodes(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int l = height(root.left);
			int r = height(root.right);
			if (l == r) {
				return 1 + countNodes(root.right) + ((l < 0) ? 0 : 1 << l);
			}
			return 1 + countNodes(root.left) + ((r < 0) ? 0 : 1 << r);
		}
	}

	private int height(TreeNode root) {
		int h = -1;
		while (root != null) {
			h++;
			root = root.left;
		}
		return h;
	}
}
