package com.campusdual.subclasses;

public class Item {
    private String tittle;
    private String publicationDate;
    private boolean checkedOut = false;

    public Item(String tittle, String publicationDate) {
        this.tittle = tittle;
        this.publicationDate = publicationDate;
    }

    public String getTittle() {
        return this.tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public String getDetails(){
        return "Tittle: " + this.tittle + ", Publication date: " + this.publicationDate + ", Checked Out: " + this.checkedOut;
    }

    public void checkedOut(){
        if (!this.checkedOut){
            this.checkedOut = true;
            System.out.println(this.tittle + " has been checked out. ");
        }else {
            System.out.println(this.tittle + " is already checked out. ");
        }
    }

    public void returnItem(){
        if(this.checkedOut){
            this.checkedOut = false;
            System.out.println(this.tittle + " has been returned. ");
        }else{
            System.out.println(this.tittle + " has already returned. ");
        }
    }

}
