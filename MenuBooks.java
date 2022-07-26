package Assignment;


public class MenuBooks {
       public void menuBook() {
        System.out.println("======MENU======");
        System.out.println("1. Insert a new book");
        System.out.println("2. Update a book");
        System.out.println("3. Delete a book");
        System.out.println("4. Display all");
        System.out.println("5. Exit");
    }

    public void insert(Book[] a, int n) {
        System.out.println("Enter new book information:");
        Book b = new Book();
        b.input();
        a[n] = b;
    }

    public void display(Book[] a, int n) {
        System.out.println("Information on all books: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Book Information No. " + i+1);
            a[i].output();
            System.out.println("===============================");
        }
    }

    public  int find1(Book[] a, int n, int ID) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i].getId() == ID) {
                index = i;
            }
        }
        return index;
    }

    public  boolean find2(Book[] a, int n, int ID) {
        boolean find = false;
        for (int i = 0; i < n; i++) {
            if (a[i].getId() == ID) {
                find = true;
                break;
            }
        }
        return find;
    }

    public  void update(Book[] a, int n, int ID) {
        int index = find1(a, n, ID);
        System.out.println("Update book information");
        Book up = new Book();
        up.input();
        a[index] = up;
    }

    public  boolean delete(Book[] a, int n, int ID) {
        int index = find1(a, n, ID);
        for (int i = 0; i < n; i++) {
            a[i] = a[i + 1];
        }
        return true;
    }
}
