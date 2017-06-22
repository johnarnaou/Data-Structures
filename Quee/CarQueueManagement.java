public class CarQueueManagement{
	public static void main(String[] args){
		String choice, num;
		boolean finished = false;
		UserInput input = new UserInput();
		int n;
		do{
			System.out.print("Dose megethos ouras:");
			n = input.getInt();
		}while(n<=0);
		ArrayQueue myQueue = new ArrayQueue(n);
		do{
			Menu();
			choice = input.getString();
			switch(choice){
				case "1":
					System.out.print("Dose arithmou autokinitou: ");
					num = input.getString();
					Car c = new Car(num);
					try{
                                            myQueue.add(c);
                                        } catch(Exception e) {
                                            System.out.println(e);
                                        }
					break;
				case "2":
                                        try{
                                            System.out.println(myQueue.remove().toString());
                                        } catch(Exception e){
                                            System.out.println(e);
                                        }
                                        break;
				case "3":
					myQueue.Display();
					break;
				case "4":

					System.out.println("Exit");
					finished = true;
					break;
				default:
					System.out.println("Lathos epilogi");
				}
			}while(finished == false);

	}

	public static void Menu(){
		System.out.println("1. Afiksi Autokinitou");
		System.out.println("2. Anaxorisi autokinitou");
		System.out.println("3. Katastasi ouras");
		System.out.println("4. Eksodos");
		System.out.print("Epilogi(1-4):");
	}

}