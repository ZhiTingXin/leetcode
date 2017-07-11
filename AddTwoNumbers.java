public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode pev = new ListNode(0);
        ListNode head = pev;
		//对于这种情况，相当于head是当前pev的一个引用，所以head是指向pev对象的，所以之后pev.next的改变也就是head.next的改变
		
        while(l1!=null||l2!=null||carry!=0){
            ListNode temp = new ListNode(((l1==null?0:l1.val)+(l2==null?0:l2.val)+carry)%10);
            pev.next = temp;
            carry = ((l1==null?0:l1.val)+(l2==null?0:l2.val)+carry)/10;
            l1 = (l1==null?l1:l1.next);
            l2 = l2==null?l2:l2.next;
            pev = pev.next;
        }
        return head.next;
    }
    static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
    }
    public static void main(String args[]){
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(7);
        AddTwoNumbers s = new AddTwoNumbers();
        ListNode li = s.addTwoNumbers(l1,l2);
        while(li!=null){
            System.out.print(li.val);
            li = li.next;
        }
    }
}