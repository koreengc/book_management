package Assignment;

public class menuTool {

    int n;
    Book[] list;

    public void menuTool() {
        System.out.println("1. Find by Author");
        System.out.println("2. Find by Language");
        System.out.println("3. Find by Prcie");
        System.out.println("4. Sort by Author Desc");
        System.out.println("5. Exit");
    }

    public void findAu(Book[] a, int n, String name) {
        boolean find = false;
        for (int i = 0; i < n; i++) {
            if (a[i].getAuthor().equalsIgnoreCase(name)) {
                find = true;
                a[i].output();
                break;
            }
        }
        if (!find) {
            System.out.println("Not found!");
        }

    }

    public void findPri(Book[] a, int n, double price) {
        boolean find = false;
        for (int i = 0; i < n; i++) {
            if (a[i].getPrice() == price) {
                find = true;
                a[i].output();
                break;
            }
        }
        if (!find) {
            System.out.println("Not found!");
        }
    }

    public void findLan(Book[] a, int n, String lan) {
        boolean find = false;
        for (int i = 0; i < n; i++) {
            if (a[i].getLanguage()==lan) {
                a[i].output();
                break;
            }
        }
        if (!find) {
            System.out.println("Not found!");
        }
    }

    public void sort(Book[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].getPrice() <= a[j].getPrice()) {
                    Book temp = new Book();
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("List book after sort");
            a[i].output();
        }
    }
}
