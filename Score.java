public class Score {
    private double total;//define Point Total
    private double earnedPoint;//define earned Point
    private double assignment;//define assignment

    public static void main(String[] args) {
        Score score=new Score(200,175,0.35);
        System.out.println(score.getTotalWeightedGrade());
    }

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
    public double getTotalWeightedGrade()
    {
        return earnedPoint/total*assignment*100;
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
}
