/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode list = new ListNode();
        ListNode temp = list;
        while (true){
            int MergedList = 0;
            int listLength = lists.length;
            int minVal = Integer.MAX_VALUE;
            int minValListIndex = 0;
            for(int i =0; i< lists.length; i++){
                if(lists[i] == null){
                    MergedList ++;
                    continue;
                }
                if(lists[i].val <= minVal){
                    minVal = lists[i].val;
                    minValListIndex = i;
                }
            }
            if(MergedList == listLength)
                break;
            ListNode node = new ListNode(minVal);
            temp.next = node;
            temp = temp.next;
            lists[minValListIndex] = lists[minValListIndex].next;
        }
        return list.next;
    }
}
// @lc code=end

