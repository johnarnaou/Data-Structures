public class SLListManagement {
    public static void main(String[] args){
        UserInput input = new UserInput();
        String choice;
        Boolean finished = false;
        SimpleLinkedList myList = new SimpleLinkedList();
        
        do{
            menu1();
            choice = input.getString();
            
            switch(choice){
                case "1":
                    System.out.print("Eisagogi: ");
                    myList.insertFirst(input.getString());
                    break;
                case "2":
                    System.out.print("Eisagogi: ");
                    myList.insertLast(input.getString());
                    break;
                case "3":
                    try{
                        System.out.println(myList.removeFirst().toString());
                    } catch(Exception e) {
                        System.out.println(e);
                    }
                    break;
                case "4":
                    try {
                        System.out.println(myList.removeLast().toString());
                    } catch(Exception e) {
                        System.out.println(e);
                    }
                    break;
                case "5":
                    System.out.println("List length: " + myList.size());
                    break;
                case "6":
                    boolean k = myList.isEmpty();
                    if(k == true){
                        System.out.println("List is empty");
                    } else {
                        System.out.println("List is not empty");
                    }
                    break;
                case "7":
                    myList.printList();
                    break;
                case "8":
                    finished = true;
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }while(finished==false);
    }
    
    public static void menu1(){
        System.out.println("********** LINKED LIST MANAGEMENT **********");
        System.out.println("1- INSERT ELEMENT AT THE BEGINNING OF THE LIST");
        System.out.println("2- INSERT ELEMENT AT THE END OF THE LIST");
        System.out.println("3- DELETE FROM THE BEGINNING OF THE LIST");
        System.out.println("4- DELETE FROM THE END OF THE LIST");
        System.out.println("5- LIST LENGTH");
        System.out.println("6- IS THE LIST EMPTY");
        System.out.println("7- PRINT LIST");
        System.out.println("8- EXIT");
        System.out.print("INPUT YOUR CHOICE:");
    }
    
}
