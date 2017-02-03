import java.util.Scanner;

class Node {
  public int data;
  public Node next;

  Node() {
    data = 0;
    next = null;
  }

  Node(int n, Node link) {
    data = n;
    next = link;
  }

  public void setData(int n) {
    data = n;
  }

  public void setLink(Node link) {
    next = link;
  }

  public int getData() {
    return data;
  }

  public Node getLink() {
    return next;
  }
}


class linkedList {
  protected Node start;

  linkedList() {
    start = null;
  }

  public boolean isEmpty() {
    return start == null;
  }

  public void insertAtStart(int val) {
    Node newNode = new Node(val, null);
    if(isEmpty()) {
      start = newNode;
    } else {
      newNode.next = start;
      start = newNode;
    }
  }

  public void insertAtLast(int val) {
    Node newNode = new Node(val, null);
    if(isEmpty()) {
      start = newNode;
    } else {
      Node n = start;
      while (n.next != null) {
        n = n.next;
      }
      n.next = newNode;
    }
  }

  public void insertAtPosition(int val, int pos) {
    Node newNode = new Node(val, null);
    boolean insert_flg = true;
    if(isEmpty()) {
      start = newNode;
    } else if (pos == 1) {
      insertAtStart(val);
    } else {
      Node n = start;
      for (int i = 1; i < (pos - 1); i++) {
        n = n.next;
        if(n == null) {
            System.out.println("\nThe position given does not fits in the linked list\n");
            insert_flg = false;
            break;
        }
      }
      if(insert_flg) {
        newNode.next = n.next;
        n.next = newNode;
      }
    }
  }

  public void deleteAtStart() {
    if(start == null) {
      System.out.println("The Link is Empty.");
    } else {
      start = start.next;
    }
  }

  public void deleteAtEnd() {
    if(start == null) {
      System.out.println("The Link is Empty.");
    } else {
      Node first = null;
      Node second = start;
      while (second.next != null) {
        first = second;
        second = second.next;
      }
      first.next = null;
    }
  }

  public void deleteAtPos(int pos) {
    if(start == null) {
      System.out.println("The Link is Empty.");
    } else if (pos == 1) {
      deleteAtStart();
    } else {
      Node first = null;
      Node second = start;
      boolean flg = true;
      for(int i = 1; i < pos; i++) {
        first = second;
        second = second.next;
        if (second == null) {
          System.out.println("The defined position is not valid.");
          flg = false;
          break;
        }
      }
      if (flg) {
        first.next = second.next;
      }
    }
  }

  public void print() {
    if(start == null) {
      System.out.println("The Linked list is empty");
    }
    Node n = start;
    while (n != null){
      System.out.print(n.data + "-->");
      n = n.next;
    }
    System.out.println("");
  }
}

class user{
  public static void main(String args[]) {
    linkedList lObj = new linkedList();
    while (true) {
      int ch, n;
      System.out.println("\nEnter your option.\n1. Insert at start.\n2. Insert at end.\n3. Insert at position.\n4. Delete at start.\n5. Delete at last.\n6. Delete at position.\n7. Print list.\n8. Exit.\n");
      Scanner sc = new Scanner(System.in);
      ch = sc.nextInt();
      switch(ch) {
        case 1:
          System.out.println("Enter number");
          n = sc.nextInt();
          lObj.insertAtStart(n);
          break;
        case 2:
          System.out.println("Enter number");
          n = sc.nextInt();
          lObj.insertAtLast(n);
          break;
        case 3:
          System.out.println("Enter number");
          n = sc.nextInt();
          System.out.println("Enter position");
          int pos = sc.nextInt();
          lObj.insertAtPosition(n, pos);
          break;
        case 4:
            lObj.deleteAtStart();
            break;
        case 5:
            lObj.deleteAtEnd();
            break;
        case 6:
            System.out.println("Enter position");
            pos = sc.nextInt();
            lObj.deleteAtPos(pos);
            break;
        case 7:
            lObj.print();
            break;
        case 8:
            System.exit(0);
      }
    }
  }
}
