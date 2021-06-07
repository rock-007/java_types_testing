public class Printer {
    int paperLeft;
    int toner;

    public Printer(int paperLeft, int toner) {
        this.paperLeft = paperLeft;
        this.toner = toner;
    }

    public int getPaperLeft() {
        return this.paperLeft;
    }

    public int getTonerLeft(){
        return this.toner;
    }


    public String printDocument(int numberOfPages, int numberOfCopies) {
        if (numberOfPages * numberOfCopies <= paperLeft) {
            this.paperLeft -= numberOfPages * numberOfCopies;
            this.toner -= numberOfPages * numberOfCopies;
            return "you have successfully printed";
        } else {
            return "Please add more paper";

        }

    }
}
