public class DoubleListManagement {
    public static void main(String[] args){
        UserInput input = new UserInput();
        int choice, n;
        Boolean finished = false;
        DoubleSLList myList = new DoubleSLList();
        
        do{
            menu1();
            choice = input.getInt();
            
            switch(choice){
                case 1:
                    System.out.print("Eisagogi: ");
                    myList.insertFirst(input.getString());
                    break;
                case 2:
                    System.out.print("Eisagogi arithmou: ");
                    n = input.getInt();
                    myList.insert(n);
                    break;
                case 3:
                    System.out.print("Eisagogi n: ");
                    n = input.getInt();
                    try{
                        myList.insert(n, input.getString());
                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 4:
                    System.out.print("Eisagogi: ");
                    myList.insertLast(input.getString());
                    break;
                case 5:
                    try{
                        System.out.println(myList.removeFirst().toString());
                    } catch(Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 6:
                    System.out.print("Eisagogi: ");
                    n = input.getInt();
                    try {
                        System.out.println(myList.remove(n).toString());
                    } catch(Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 7:
                    try {
                        System.out.println(myList.removeLast().toString());
                    } catch(Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 8:
                    if(myList.isEmpty()){
                        System.out.println("Is empty");
                    } else {
                        if(myList.isSorted()){
                            System.out.println("List is sorted");
                        } else {
                            System.out.println("List is not sorted");
                        }
                    }
                    break;
                case 9:
                    System.out.println("List length: " + myList.size());
                    break;
                case 10:
                    if(myList.isEmpty()){
                        System.out.println("List is empty");
                    } else {
                        System.out.println("List is not empty");
                    }
                    break;
                case 11:
                    myList.printList();
                    break;
                case 0:
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
        System.out.println("2- INSERT ELEMENT AT CORRECT POSITION (SORTED)");
        System.out.println("3- INSERT ELEMENT AT POSITION N OF THE LIST");
        System.out.println("4- INSERT ELEMENT AT THE END OF THE LIST");
        System.out.println("5- DELETE FROM THE BEGINNING OF THE LIST");
        System.out.println("6- DELETE FROM POSITION N OF LIST");
        System.out.println("7- DELETE FROM THE END OF THE LIST");
        System.out.println("8- CHECK IF MY LIST IS SORTED");
        System.out.println("9- LIST LENGTH");
        System.out.println("10- IS THE LIST EMPTY");
        System.out.println("11- PRINT LIST");
        System.out.println("0- EXIT");
        System.out.print("INPUT YOUR CHOICE:");
    }
}

