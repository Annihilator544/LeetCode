/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        ListNode temp = list3;
        while(list1 != null && list2 != null){
           if(list1.val <= list2.val){
                ListNode node = new ListNode(list1.val);
                temp.next = node;
                temp = temp.next;
                list1 = list1.next;
           }
           else{
                ListNode node = new ListNode(list2.val);
                temp.next = node;
                temp = temp.next;
                list2 = list2.next;
           }
        }
        while(list1 != null){
            ListNode node = new ListNode(list1.val);
            temp.next = node;
            temp = temp.next;
            list1 = list1.next;
        }
        while(list2 != null){
            ListNode node = new ListNode(list2.val);
            temp.next = node;
            temp = temp.next;
            list2 = list2.next;
        }
        return list3.next;
    }
}
// @lc code=end

