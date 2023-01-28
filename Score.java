public class Score {
    private double total;//define Point Total
    private double earnedPoint;//define earned Point
    private double assignment;//define assignment

    private double totalWeightedGrade;//

    /**
     * Implement the class constructor by passing total,earned Point,assignment,
     * and assigning them to attributes in the class
     * @param total
     * @param earnedPoint
     * @param assignment
     */
    public Score(double total,double earnedPoint,double assignment)
    {
        this.total=total;
        this.earnedPoint=earnedPoint;
        this.assignment=assignment;
    }

    /**
     * The weighted total score is obtained from the original score passed in.
     * @return
     */
    public double calculate()
    {
        this.totalWeightedGrade = earnedPoint/total*assignment*100;
        return totalWeightedGrade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getEarnedPoint() {
        return earnedPoint;
    }

    public void setEarnedPoint(double earnedPoint) {
        this.earnedPoint = earnedPoint;
    }

    public double getAssignment() {
        return assignment;
    }

    public void setAssignment(double assignment) {
        this.assignment = assignment;
    }

    public void setTotalWeightedGrade(double totalWeightedGrade){this.totalWeightedGrade = totalWeightedGrade;}

    public double getTotalWeightedGrade(){return this.totalWeightedGrade;}

}
