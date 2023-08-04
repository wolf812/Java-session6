package Bai_tap;

import java.util.Scanner;

public class BookImp {
    //biến toàn cục
    static Book[] arrBook = new Book[100];
    static int numberBook = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        BookImp bookImp = new BookImp();

        // khởi tạo biển index đếm số sách trong arr
        int index = 0;

        //
        do {
            System.out.println("**************************MENU*****************************");
            System.out.println("1. Nhập vào thông tin n sách (n nhập từ bàn phím)");
            System.out.println("2. Tính lợi nhuận các sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)");
            System.out.println("7. Thống kê số lượng sách theo năm xuất bản");
            System.out.println("8. Thống kê số lượng sách theo tác giả");
            System.out.println("9. Thoát");

            int choice = Integer.parseInt(sc.nextLine());
            System.out.println("Lựa chọn của bạn là: " + choice);
            switch (choice) {
                case 1:
                    BookImp.inputListBook(sc);


//                    System.out.println("Nhập số lượng sách cần nhập thông tin sách");
//                    int n = Integer.parseInt(sc.nextLine());
//                    //
//                    for (int i = 0; i < n; i++) {
//                        arrBook[index] = new Book();
//                        //Nhập thông tin
//                        System.out.println("Nhập thông tin sách " + (index + 1));
//                        arrBook[index].inputBook(sc);
//                        index++;
//                    }
                    break;
                case 2://Lợi nhuận
                    BookImp.calListInterest();
//                    System.out.println("--------------Lợi nhuận--------------");
////                    for (Book book :
////                            arrBook) {
////                        book[index].interestOut();
////                    }
//                    for (int i = 0; i < index; i++) {
//                        arrBook[i].interestOut();
//                    }
                    break;
                case 3:// hiển thị thông tin sách
                    BookImp.disPlayListBook();

//                    System.out.println("--------------Thông tin arrBook--------------");
//                    for (int i = 0; i < index; i++) {
//                        arrBook[i].disPlayData();
//                    }
                    break;
                case 4:// Sắp xếp sách theo giá bán tăng dần
                    BookImp.sortBookByExportPrice();
//                    for (int i = 0; i < index - 1; i++) {
//                        for (int j = i + 1; j < index; j++) {
//                            if (arrBook[i].getExportPrice() > arrBook[j].getExportPrice()) {
//                                // đổi chỗ 2 phần tử
//                                Book bookTemp = arrBook[i];
//                                arrBook[i] = arrBook[j];
//                                arrBook[j] = bookTemp;
//                            }
//                        }
//                    }
//                    System.out.println("Sau khi sắp xếp theo giá bán tăng dần ");
//
//                    for (int i = 0; i < index; i++) {
//                        arrBook[i].giaBan();
//                    }
                    break;
                case 5://Sắp xếp sách theo lợi nhuận giảm dần
                    BookImp.sortBookByInterest();
//                    for (int i = 0; i < index - 1; i++) {
//                        for (int j = i + 1; j < index; j++) {
//                            if (arrBook[i].getInterest() < arrBook[j].getInterest()) {
//                                // đổi chỗ 2 phần tử
//                                Book bookInterest = arrBook[i];
//                                arrBook[i] = arrBook[j];
//                                arrBook[j] = bookInterest;
//                            }
//                        }
//                    }
//                    System.out.println("Sau khi sắp xếp theo lợi nhuận giảm dần ");
//                    for (int i = 0; i < index; i++) {
//                        arrBook[i].loiNhuanGiam();
//                    }
                    break;
                case 6://Tìm sách theo tên sách (tên sách nhập từ bàn phím)
                    BookImp.seachBookByName(sc);
//                    System.out.println("Nhập vào sách cần tìm: ");
//                    String bookSeach = sc.nextLine();
//                    int cnt = 0;
//                    for (int i = 0; i < index; i++) {
//                        if (arrBook[i].getBookName().toLowerCase().contains(bookSeach.toLowerCase())) {
//
//                            arrBook[i].disPlayData();
//                            cnt++;
//                        }
//                    }
//                    if (cnt == 0) {
//                        System.out.println("Không có sách bạn vừa tìm");
//                    }
                    break;
                case 7://Thống kê số lượng sách theo năm xuất bản
                    BookImp.seachBookByYear(sc);
//                    int couse = 0;
//                    System.out.println("Nhập vào năm xuất bản");
//                    int yearSeach = Integer.parseInt(sc.nextLine());
//                    for (int i = 0; i < index; i++) {
//                        if (arrBook[i].getYear() == yearSeach) {
//                            arrBook[i].yearSeach();
//                            couse++;
//                        }
//                    }
//
//                    if (couse == 0) {
//                        System.out.println("Năm xuất bản vừa nhập không có sách");
//                    } else {
//                        System.out.printf("Sách xuất bản năm %d có %d cuốn.\n", yearSeach, couse);
//
//                    }
                    break;
                case 8://Thống kê số lượng sách theo tác giả
                    BookImp.seachBookByAuthor(sc);
//                    System.out.println("Nhập vào tên tác giả cần tìm: ");
//                    String authorSeach = sc.nextLine();
//                    int dem = 0;
//                    for (int i = 0; i < index; i++) {
//                        if (arrBook[i].getAuthor().toLowerCase().contains(authorSeach.toLowerCase())) {
//
//                            arrBook[i].authorSeach();
//                            dem++;
//                        }
//                    }
//
//                    if (dem == 0) {
//                        System.out.println("Không có sách bạn vừa tìm");
//                    } else {
//                        System.out.printf("Sách của tác giả \"%s\" có %d cuốn.\n", authorSeach, dem);
//
//                    }
                    break;
                case 9://Thoát
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

        } while (true);


    }

    public static void inputListBook(Scanner sc) {
        System.out.println("Nhập số lượng sách cần nhập thông tin sách");
        int n = Integer.parseInt(sc.nextLine());
        //
        for (int i = 0; i < n; i++) {


//            // Cách 1:
//            Book book = new Book();
//            //Nhập thông tin
//            System.out.println("Nhập thông tin sách " + (numberBook + 1));
//            book.inputBook(sc,arrBook,numberBook);
//            arrBook[numberBook] = book;

            //Cách 2
            System.out.println("Nhập thông tin sách " + (i + 1));
            arrBook[numberBook] = new Book();
            arrBook[numberBook].inputBook(sc, arrBook, numberBook);
            numberBook++;
            System.out.println("numberBook: "+numberBook);

        }
    }

    //2
    public static void calListInterest() {
        System.out.println("--------------Lợi nhuận--------------");
        for (int i = 0; i < numberBook; i++) {
            arrBook[i].interestOut();
        }
    }

    //3
    public static void disPlayListBook() {
        System.out.println("--------------Thông tin Sách--------------");
        for (int i = 0; i < numberBook; i++) {
            arrBook[i].disPlayData();
        }
    }

    //4
    public static void sortBookByExportPrice() {
        for (int i = 0; i < numberBook - 1; i++) {
            for (int j = i + 1; j < numberBook; j++) {
                if (arrBook[i].getExportPrice() > arrBook[j].getExportPrice()) {
                    // đổi chỗ 2 phần tử
                    Book bookTemp = arrBook[i];
                    arrBook[i] = arrBook[j];
                    arrBook[j] = bookTemp;
                }
            }
        }
        System.out.println("Sau khi sắp xếp theo giá bán tăng dần ");

        for (int i = 0; i < numberBook; i++) {
            arrBook[i].giaBan();
        }
    }

    //5
    public static void sortBookByInterest() {
        for (int i = 0; i < numberBook - 1; i++) {
            for (int j = i + 1; j < numberBook; j++) {
                if (arrBook[i].getInterest() < arrBook[j].getInterest()) {
                    // đổi chỗ 2 phần tử
                    Book bookInterest = arrBook[i];
                    arrBook[i] = arrBook[j];
                    arrBook[j] = bookInterest;
                }
            }
        }
        System.out.println("Sau khi sắp xếp theo lợi nhuận giảm dần ");
        for (int i = 0; i < numberBook; i++) {
            arrBook[i].loiNhuanGiam();
        }
    }

    //6
    public static void seachBookByName(Scanner sc) {
        System.out.println("Nhập vào sách cần tìm: ");
        String bookSeach = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < numberBook; i++) {
            if (arrBook[i].getBookName().toLowerCase().contains(bookSeach.toLowerCase())) {

                arrBook[i].disPlayData();
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Không có sách bạn vừa tìm");
        }
    }

    //7
    public static void seachBookByYear(Scanner sc){
        //Tìm tất cả các năm xuất bản sách và lưu mảng
        int[] yearsBook = new int[numberBook];
        int cnt = 0;

        int numberBookByYear;
        for(int i = 0; i < numberBook - 1; ++i) {
            boolean isExist = false;

            for(numberBookByYear = i + 1; numberBookByYear < numberBook; ++numberBookByYear) {
                if (arrBook[i].getYear() == arrBook[numberBookByYear].getYear()) {
                    isExist = true;
                    break;
                }
            }

            if (!isExist) {
                yearsBook[cnt] = arrBook[i].getYear();
                ++cnt;
            }
        }

        yearsBook[cnt] = arrBook[numberBook - 1].getYear();
        int[] arrNumberBookByYear = new int[cnt + 1];

        int i;
        for(i = 0; i <= cnt; ++i) {
            numberBookByYear = 0;

            for(int j = 0; j < numberBook; ++j) {
                if (yearsBook[i] == arrBook[j].getYear()) {
                    ++numberBookByYear;
                }
            }

            arrNumberBookByYear[i] = numberBookByYear;
        }

        System.out.println("Thống kê số lượng sách theo năm xuất bản:");

        for(i = 0; i <= cnt; ++i) {
            System.out.printf("%d\t", yearsBook[i]);
        }

        System.out.printf("\n");

        for(i = 0; i <= cnt; ++i) {
            System.out.printf("%d\t", arrNumberBookByYear[i]);
        }

        System.out.printf("\n");

    }
    public static void seachBookByAuthor(Scanner sc){
        System.out.println("Nhập vào tên tác giả cần tìm: ");
        String authorSeach = sc.nextLine();
        int dem = 0;
        for (int i = 0; i < numberBook; i++) {
            if (arrBook[i].getAuthor().toLowerCase().contains(authorSeach.toLowerCase())) {

                arrBook[i].authorSeach();
                dem++;
            }
        }

        if (dem == 0) {
            System.out.println("Không có sách bạn vừa tìm");
        } else {
            System.out.printf("Sách của tác giả \"%s\" có %d cuốn.\n", authorSeach, dem);

        }

    }


}
