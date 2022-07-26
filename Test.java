package Assignment;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book[] list = new Book[20];
        int n = 0;
        int choose = 0;

        do {
            menu();
            System.out.print("Your choice: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    MenuBooks t = new MenuBooks();
                    t.menuBook();
                    int CHOOSE = 0;
                    System.out.println("");
                    System.out.print("Your choice: ");
                    CHOOSE=sc.nextInt();
                    switch (CHOOSE) {
                        case 1:
                            int input = -1;
                            do {
                                t.insert(list, n);
                                n += 1;
                                System.out.println("Do you want to continue?");
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                input = sc.nextInt();
                            } while (input != 2);
                            t.menuBook();
                            break;

                        case 2:
                            int id;
                            System.out.print("Location you want to update: ");
                            id = sc.nextInt();
                            if (t.find2(list, n, id)) {
                                t.update(list, n, id);
                            } else {
                                System.out.println("Can't find book with ID " + id);
                            }
                            break;

                        case 3:
                            int ID;
                            System.out.print("Location you want to delete: ");
                            ID = sc.nextInt();
                            if (t.find2(list, n, ID)) {
                                t.delete(list, n, ID);
                                n -= 1;
                            } else {
                                System.out.println("Can't find book with ID " + ID);
                            }
                            break;
                        case 4:
                            t.display(list, n);
                            break;
                        case 5:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Sorry. Your choice does not exist.");
                            break;
                    }
                }
                while (choose != 5);

                case 2: {
                    menuTool t1 = new menuTool();
                    t1.menuTool();
                    int choose1 = 0;
                    do {
                        System.out.println("Choose the function of the tool:");
                        choose1 = sc.nextInt();
                        switch (choose1) {
                            case 1: {
                                System.out.println("Enter author need to filt: ");
                                String name = sc.nextLine();
                                t1.findAu(list, n, name);
                                break;
                            }
                            case 2: {
                                System.out.println("Enter Language need to filt: ");
                                String lan = sc.nextLine();
                                t1.findLan(list, n, lan);
                                break;
                            }
                            case 3: {
                                System.out.println("Enter price need to filt: ");
                                Double pri = sc.nextDouble();
                                t1.findPri(list, n, pri);
                                break;
                            }
                            case 4: {
                                System.out.println("Sort by price: ");

                                t1.sort(list, n);
                                break;
                            }
                            case 5: {
                                menu();
                                break;
                            }

                            default:
                                System.out.println("Sorry. Your choice does not exist.");
                                break;
                        }
                    } while (choose1 != 5);
                }
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry. Your choice does not exist.");

            }
            System.out.println("Do you want to continue?");
            menu();
            choose = sc.nextInt();

        } while (choose != 3);
    }

    public static void menu() {
        System.out.println("==========Menu=========");
        System.out.println("1. Books");
        System.out.println("2. Tools");
        System.out.println("3. Exit");
    }

 

}
