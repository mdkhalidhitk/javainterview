package comp.hasahmap.equal.validation;

public class ReportCard {
    
    private int mathMark;
    public int getMathMark() {
	return mathMark;
    }
    public void setMathMark(int mathMark) {
	this.mathMark = mathMark;
    }
    public ReportCard() {
	this.mathMark=(int)(Math.random()+1);
    }

}
