
public class FirstLastList {

    private Link first ;
    private Link last ;

    public FirstLastList() {
        first = null;
        last = null;
    }
    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long value) {

        Link newLink = new Link(value);

        if(isEmpty()){
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long value){
        Link newLink = new Link(value);

        if(isEmpty()){
            first = newLink;
        }else {
            last.next = newLink;
        }
        last = newLink;
    }
    public long deleteFirst(){

        long temp = first.dData;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;

    }
    public long deleteLast(){
        long temp = last.dData;
        Link curr = first;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        last = curr;

        return temp;
    }
    public void displayList(){
        System.out.print("List (first-->last): ");
        System.out.println();
        Link curr = first;

        while(curr != null){
            curr.displayLink();
            curr = curr.next;
        }
        System.out.println();

    }



}
