/*
 * @lc app=leetcode id=1352 lang=java
 *
 * [1352] Product of the Last K Numbers
 */

// @lc code=start
class ProductOfNumbers {
    private int size = 0;  // how many numbers were added
    private int zero = -1;  // the position of the last zero
    private final List<Integer> where = new ArrayList<>(), factor = new ArrayList<>();  // the numbers above 1 after it: positions and values

    public void add(int num) {
        if (num == 0) {
            zero = size;
            where.clear();
            factor.clear();
        } else if (num > 1) {
            where.add(size);
            factor.add(num);
        }
        size++;
    }

    public int getProduct(int k) {
        int start = size - k;  // the window is positions start .. size - 1
        if (zero >= start)
            return 0;
        int product = 1;
        for (int i = where.size() - 1; i >= 0 && where.get(i) >= start; i--)  // the stored numbers inside the window, newest first
            product *= factor.get(i);
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
// @lc code=end

