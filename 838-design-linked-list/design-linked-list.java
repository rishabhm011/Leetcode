class MyLinkedList {
    static class Node{
        Node next;
        int val;
        Node(int val){
            this.next = null;
            this.val = val;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int get(int index) {
        Node temp = head;
        if(index < 0 || index > size -1){
            return -1;
        }
        if (index==0){
            return head.val;
        }
        for(int i = 0 ; i <= index-1 ; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if(index < 0 || index > size){
            return;
        }
        else if(index == 0){
            addAtHead(val);
            return;
        }
        else if(index==size){
            addAtTail(val);
            return;
        }
        Node temp = head;
        for(int i = 0 ; i <= index-2 ; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        
        if(index < 0 || index > size -1){
            return;
        }
        else if(index == 0){
            if(head == tail){
                head = null;
                tail = null;
                size--;
                return;
            }
            head = head.next;
            
        }
        else if(index==size-1){
            Node temp = head;
            for(int i = 0 ; i <= size-3 ; i++){
            temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
        else{
        Node temp = head;
        for(int i = 0 ; i <= index-2 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */