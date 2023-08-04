package Bai_tap;

import java.util.Scanner;

public class Book {
    // mã sách, không được trùng lặp
    private String bookId;

    //không được trùng lăp - 4 ký tự - bắt đầu B
    private String bookName;
    private float importPrice; // giá nhập
    private float exportPrice; // giá xuất lớn hơn ít nhất 30% so với giá nhập
    private String author;
    private float interest; // lợi nhuận sách = exportPrice - importPrice
    private int year; //năm xuất bản > 2000

//default

    public Book() {
    }

//constructor


    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, float interest, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    //get - set

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    //Nhập dữ liệu
    public void inputBook(Scanner sc, Book[] arrBook,int numberBook){
        //mã sách duy nhất
        System.out.println("Mã sách: ");
        boolean checkBookId = true;
        do {
            this.bookId = sc.nextLine();
            //kiểm tra mã sách là duy nhất
            boolean checkExit = false;
            for (int i = 0; i < numberBook; i++) {
                if (arrBook[i].bookId.equals(this.bookId)){
                    checkExit = true;
                    break;
                }
            }
            if (!checkExit) {
//                System.out.println("Mã sách không bị trùng lặp");
                break;
            }else{
                System.err.println("Mã sách đã bị trùng lặp, vui lòng nhập lại");

            }
        }while (checkBookId);

        //tên sách không trùng lặp - ít nhất 4 ký tự- bắt đầu B
        boolean checkBookName = true;
        System.out.println("Tên sách: ");
        do {
            this.bookName = sc.nextLine();
            boolean checkBookNameExit = false;
            for (int i = 0; i < numberBook; i++) {
                if (arrBook[i].bookName.equals(this.bookName)){
                    checkBookNameExit = true;
                    break;
                }
            }
            if (checkBookNameExit) {
                System.err.println("Tên sách đã tồn tại, vui lòng nhập lại");
            }else{
                // tên sách chưa có
                // kiểm tra độ dài
                if (this.bookName.length() == 4) {
                    //kiểm tra bắt đầu bằng kí tự B
                    if (this.bookName.charAt(0) == 'B') {
                        break;
                    }else{
                        System.out.println("Tên sách phải bắt đầu bằng ký tự B, vui longf nhập lại");
                    }
                }else{
                    System.err.println("Tên sách phải gồm 4 ký tự, vui lòng nhập lại");
                }
            }

        }while (checkBookName);

        //Giá nhập Lớn hơn 0
        boolean checkImportPrice = true;
        System.out.println("Giá Nhập: ");
        do {
            this.importPrice = Float.parseFloat(sc.nextLine());
            if (this.importPrice > 0) {
                break;
            }else{
                System.err.println("Giá sách phải lớn hơn 0, vui lòng nhập lại");
            }

        }while (checkImportPrice);

        // giá xuất ít nhất lớn hơn 30% giá nhập
        boolean checkExportPrice = true;
        System.out.println("Giá xuất: ");
        do {
            this.exportPrice = Float.parseFloat(sc.nextLine());
            if (this.exportPrice >= this.importPrice*1.3) {
                break;
            }else{
                System.err.println("Giá xuất phải lớn hơn giá nhập ít hơn 30%, vui lòng nhập lại");
            }

        }while (checkExportPrice);

        //tác giả - 6-50 ký tự
        boolean checkAuthor = true;
        System.out.println("Tác giả: ");
        do {
            this.author = sc.nextLine();
            if (this.author.length()>=6&&this.author.length()<=50){
                break;
            }else {
                System.err.println("Tên tác giả từ 5-60 ký tự, vui lòng nhập lại");
            }

        }while (checkAuthor);
//        System.out.println("Lãi xuất: ");
//        this.interest = Float.parseFloat(sc.nextLine());
        // năm xuất bản sau năm 2000
        boolean checkYear = true;
        System.out.println("Năm xuất bản: ");
        do {
            this.year = Integer.parseInt(sc.nextLine());
            if (this.year >= 2000) {
                break;
            }else{
                System.err.println("Năm xuất bản phải sau năm 2000, vui lonhg nhập lại");
            }
        }while (checkYear);

    }

    //Hiển thị thông tin sách
    public void disPlayData(){
        System.out.printf("Mã sách: %s ---- Tên sách: %s\n",bookId,bookName);
        System.out.printf("Giá Nhập: %f ---- Giá xuất: %f\n",importPrice,exportPrice);
        System.out.printf("Tác giả: %s\n",author);
        System.out.printf("Năm xuất bản: %d\n",year);
        System.out.println("-----------------------------------------------------------");
    }

    // tính lãi xuất
    public void interestOut(){
        interest = this.exportPrice-this.importPrice;
        System.out.printf("\nMã sách: %s\nTên sách: %s\n",bookId,bookName);
        System.out.printf("Lãi xuất: %f", interest);
        System.out.printf("\n------------------------------------------------------------");
    }

    //sắp xếp sách theo giá bán tăng dần
    public void giaBan(){
        System.out.printf("\nMã sách: %s\nTên sách: %s\n",bookId,bookName);
        System.out.printf("Giá xuất: %f\n", exportPrice);
        System.out.printf("------------------------------------------------------------\n");

    }


//    String bookNameRegex = "^[B][a-z0-9_-]{3}$";
//^(?=.{6,50}$)[A-Za-zÀ-ỹ][A-Za-zÀ-ỹ ]*$

    //sắp xếp sách theo lợi nhuận giảm dần
    public void loiNhuanGiam(){
        interest = this.exportPrice-this.importPrice;
        System.out.printf("\nMã sách: %s\nTên sách: %s\n",bookId,bookName);
        System.out.printf("Lợi Nhuận: %f\n", interest);
        System.out.printf("------------------------------------------------------------\n");
    }


    //thống kê số lượng sách theo năm xuất bản
    public void yearSeach(){
        System.out.printf("\nMã sách: %s     Tên sách: %s\n",bookId,bookName);
    }

//    //thống kê số lượng sách theo tác giả
    public void authorSeach(){
        System.out.printf("\nMã sách: %s        Tên sách: %s     Tác giả: %s\n",bookId,bookName,author);

    }


}
